package Abstract;

import Entities.GameLibrary;

public interface GameService {
    void save(GameLibrary game);
    void update(GameLibrary game);
    void delete(GameLibrary game);
    void addMultiple(GameLibrary[] games);
}
