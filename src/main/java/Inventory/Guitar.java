package Inventory;

import Behaviours.IPlay;

public class Guitar extends Instrument implements IPlay {

    private int numberOfStrings;

    public Guitar(String material, String colour, InstrumentType instrumentType, double purchasePrice, double sellPrice, int numberOfStrings) {
        super(material, colour, instrumentType, purchasePrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public String play() {
        return "Strum";
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public double calculateMarkup() {
        double profit = this.getSellPrice() - this.getBuyPrice();
        double cost = this.getBuyPrice();
        return profit / cost * 100;
    }
}