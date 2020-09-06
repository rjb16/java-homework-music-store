package Inventory;

import Behaviours.IPlay;
import Behaviours.ISell;

public abstract class Instrument implements IPlay, ISell {

    private String material;
    private String colour;
    private InstrumentType instrumentType;
    private double buyPrice;
    private double sellPrice;

    public Instrument(String material, String colour, InstrumentType instrumentType, double buyPrice, double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.instrumentType = instrumentType;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }
}