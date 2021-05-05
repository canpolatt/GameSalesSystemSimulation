package Abstract;

import Entities.Player;

public abstract class BasePlayerManager implements PlayerService {
    @Override
    public void save(Player player) {
        System.out.println(player.getFirstName()+" sisteme eklendi.");
    }

    @Override
    public void update(Player player) {
        System.out.println(player.getFirstName()+" bilgileri güncellendi.");
    }

    @Override
    public void delete(Player player) {
        System.out.println(player.getFirstName()+" sistemden silindi.");
    }
}
