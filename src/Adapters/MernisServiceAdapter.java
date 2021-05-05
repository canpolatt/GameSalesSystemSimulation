package Adapters;

import Abstract.PlayerCheckService;
import Entities.Player;
import MernisService.BIPKPSPublicSoap;


public class MernisServiceAdapter implements PlayerCheckService {
    @Override
    public boolean checkIfRealPerson(Player player) {
        BIPKPSPublicSoap soapClient=new BIPKPSPublicSoap();
        try{
            return soapClient.TCKimlikNoDogrula(Long.valueOf(player.getTcNo()), player.getFirstName().toUpperCase(),player.getLastName().toUpperCase(),player.dateOfBirth.getYear());
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return false;
    }
}
