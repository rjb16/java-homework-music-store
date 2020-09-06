package Inventory;

import Behaviours.IPlay;

public class Drum extends Instrument implements IPlay {

    private int diameter;

    public Drum(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice, int diameter) {
        super(material, colour, instrumentType, buyPrice, sellPrice);
        this.diameter = diameter;
    }

    public String play() {
        return "Ba dum tsssss";
    }

    public int getDiameter() {
        return diameter;
    }


    public double calculateMarkup() {
        double profit = this.getSellPrice() - this.getBuyPrice();
        double cost = this.getBuyPrice();
        return profit / cost * 100;
    }
}
