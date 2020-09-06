import inventory.Drum;
import inventory.DrumStick;
import inventory.Guitar;
import inventory.InstrumentType;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Guitar guitar;
    InstrumentType instrumentType;
    DrumStick drumStick;

    @Before
    public void before() {
        shop = new Shop("Big Tunes");
        guitar = new Guitar("wood", "red", instrumentType.STRING, 35.00, 100.00, 5);
        drumStick = new DrumStick("Handcrafted sticks constructed from tiger wood", 1.50, 3.50);
    }

    @Test
    public void canGetStock() {
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canAddStock() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumStick);
        assertEquals(2, shop.getStock());
    }

    @Test
    public void canRemoveStock() {
        shop.addItemToStock(guitar);
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStock());
    }

    @Test
    public void canCalculateTotalPotentialProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(drumStick);
        assertEquals(319.04, shop.calculateTotalPotentialProfit(), 0.5);
    }
}
