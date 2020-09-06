import Inventory.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    private MusicSheet musicSheet;

    @Before
    public void before() {
        musicSheet = new MusicSheet("Fur Elise", 2.50, 5.50);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(120.0, musicSheet.calculateMarkup(), 0.5);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Fur Elise", musicSheet.getDescription());
    }
}