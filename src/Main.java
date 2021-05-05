import Adapters.MernisServiceAdapter;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.PlayerManager;
import Concrete.SalesManager;
import Entities.Discount;
import Entities.GameLibrary;
import Entities.Player;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here
        PlayerManager playerManager=new PlayerManager(new MernisServiceAdapter());
        Player player1=new Player(1,"engin123","engin123","Engin","Demiroğ","11111111111",new Date(1985,1,6));
        playerManager.save(player1);
        System.out.println();
        System.out.println("----Oyun Bölümü----");
        GameManager gameManager=new GameManager();
        GameLibrary gameLOL=new GameLibrary(1,"League of Legends",100);
        GameLibrary gameCS=new GameLibrary(2,"Counter Strike",300);
        gameManager.addMultiple(new GameLibrary[]{gameLOL,gameCS});
        System.out.println();
        System.out.println("----İndirim Bölümü----");
        DiscountManager discountManager=new DiscountManager();
        Discount discountSpring=new Discount("Bahar Fırsatları!!",30);
        discountManager.save(discountSpring);
        System.out.println();
        System.out.println("----Satış Bölümü----");
        SalesManager salesManager=new SalesManager(playerManager);
        salesManager.sales(gameLOL,player1);
        salesManager.sales(gameCS,player1,discountSpring);
        System.out.println();
        playerManager.getGames(player1);

    }
}
