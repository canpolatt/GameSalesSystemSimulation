package Entities;

import java.util.Date;

public class Discount {

    private String description;
    private int discountPercent;

    public Discount(){

    }

    public Discount(String description, int discountPercent) {
        this.description = description;
        this.discountPercent = discountPercent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

}
