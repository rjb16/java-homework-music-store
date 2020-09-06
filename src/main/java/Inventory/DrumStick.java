package Inventory;

public class DrumStick extends Accessory {
    public DrumStick(String description, double buyPrice, double sellPrice) {
        super(description, buyPrice, sellPrice);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getBuyPrice() {
        return super.getBuyPrice();
    }

    @Override
    public double getSellPrice() {
        return super.getSellPrice();
    }

    public double calculateMarkup() {
        double profit = this.getSellPrice() - this.getBuyPrice();
        double cost = this.getBuyPrice();
        return profit / cost * 100;
    }
}