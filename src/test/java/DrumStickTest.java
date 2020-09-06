
import Inventory.Drum;
import Inventory.DrumStick;
import Inventory.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Childrens learning sticks", 1.50, 3.50);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(133.0, drumStick.calculateMarkup(), 0.5);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Childrens learning sticks", drumStick.getDescription());
    }
}
