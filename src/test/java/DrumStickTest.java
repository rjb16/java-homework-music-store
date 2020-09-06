import inventory.Drum;
import inventory.DrumStick;
import inventory.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick("Handcrafted sticks constructed from tiger wood", 1.50, 3.50);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(133.0, drumStick.calculateMarkup(), 0.5);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Handcrafted sticks constructed from tiger wood", drumStick.getDescription());
    }
}
