package Concrete;

import Abstract.BasePlayerManager;
import Abstract.PlayerCheckService;
import Entities.GameLibrary;
import Entities.Player;

import java.util.ArrayList;

public class PlayerManager extends BasePlayerManager {

    private PlayerCheckService playerCheckService;
    private ArrayList<GameLibrary> games;

    public PlayerManager(PlayerCheckService playerCheckService) {
        this.playerCheckService=playerCheckService;
        this.games=new ArrayList<GameLibrary>();
    }

    @Override
    public void save(Player player) {
        if(playerCheckService.checkIfRealPerson(player)){
            super.save(player);
        }else{
            System.out.println("Hatalı kullanıcı.");
        }

    }

    @Override
    public void update(Player player) {
        super.update(player);
    }

    @Override
    public void delete(Player player) {
        super.delete(player);
    }

    @Override
    public void getGames(Player player) {
        System.out.println("Almış olduğunuz oyunlar: ");
        for(GameLibrary game:games){
            System.out.println("- "+game.getName());
        }

    }

    @Override
    public void addGames(Player player,GameLibrary game) {
        this.games.add(game);
        System.out.println(player.getFirstName()+" tarafından "+game.getName()+" satın alındı.");
    }
}
