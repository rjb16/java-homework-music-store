import Inventory.Guitar;
import Inventory.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    Guitar guitar;
    InstrumentType instrumentType;

    @Before
    public void before() {
        guitar = new Guitar("wood", "yellow", instrumentType.STRING, 35.00, 100.00, 5);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(185.7, guitar.calculateMarkup(), 0.5);
    }

    @Test
    public void canGetInstrumentType() {
        assertEquals(InstrumentType.STRING, guitar.getInstrumentType());
    }
}