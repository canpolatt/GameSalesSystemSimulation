package Abstract;

import Entities.Discount;
import Entities.GameLibrary;
import Entities.Player;

public interface SalesService {
    void sales(GameLibrary game, Player player);
    void sales(GameLibrary game, Player player, Discount discount);
}
