package Abstract;

import Entities.GameLibrary;
import Entities.Player;

public interface PlayerService {
    void save(Player player);
    void update(Player player);
    void delete(Player player);
    void getGames(Player player);
    void addGames(Player player, GameLibrary game);
}
