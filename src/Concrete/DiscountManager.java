package Concrete;

import Abstract.DiscountService;
import Entities.Discount;

public class DiscountManager implements DiscountService {
    @Override
    public void save(Discount discount) {
        System.out.println("İndirim tanımlandı.");
    }

    @Override
    public void update(Discount discount) {
        System.out.println("İndirim güncellendi.");
    }

    @Override
    public void delete(Discount discount) {
        System.out.println("İndirim kaldırıldı.");
    }
}
