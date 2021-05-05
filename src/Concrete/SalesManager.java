package Concrete;

import Abstract.DiscountService;
import Abstract.PlayerService;
import Abstract.SalesService;
import Entities.Discount;
import Entities.GameLibrary;
import Entities.Player;

public class SalesManager implements SalesService {

    private PlayerService playerService;

    public SalesManager(PlayerService playerService) {
        this.playerService=playerService;
    }

    @Override
    public void sales(GameLibrary game, Player player) {
        playerService.addGames(player,game);
    }

    @Override
    public void sales(GameLibrary game, Player player, Discount discount) {
        game.setPrice(game.getPrice()-(game.getPrice()*discount.getDiscountPercent()));
        playerService.addGames(player,game);
    }
}
