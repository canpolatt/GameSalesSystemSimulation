package Concrete;

import Abstract.BaseGameManager;
import Entities.GameLibrary;

public class GameManager extends BaseGameManager{
    @Override
    public void save(GameLibrary game) {
        super.save(game);
    }

    @Override
    public void update(GameLibrary game) {
        super.update(game);
    }

    @Override
    public void delete(GameLibrary game) {
        super.delete(game);
    }

    @Override
    public void addMultiple(GameLibrary[] games) {
        super.addMultiple(games);
    }
}
