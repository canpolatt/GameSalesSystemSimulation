package Abstract;

import Entities.GameLibrary;

public abstract class BaseGameManager implements GameService{

    @Override
    public void save(GameLibrary game) {
        System.out.println(game.getName()+" oyunu kütüphanene eklendi.");
    }

    @Override
    public void update(GameLibrary game) {
        System.out.println(game.getName()+" oyununun bilgileri güncellendi.");
    }

    @Override
    public void delete(GameLibrary game) {
        System.out.println(game.getName()+" oyunu kütüphanenden silindi.");
    }

    @Override
    public void addMultiple(GameLibrary[] games) {
        for(GameLibrary game:games){
            save(game);
        }
    }
}
