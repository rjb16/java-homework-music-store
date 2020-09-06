package Inventory;


import Behaviours.ISell;


public abstract class Accessory implements ISell {

    private String description;
    private double buyPrice;
    private double sellPrice;

    public Accessory(String description, double buyPrice, double sellPrice) {
        this.description = description;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup(double buyPrice, double sellPrice) {
        return 0;
    }

    public String getDescription() {
        return description;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}