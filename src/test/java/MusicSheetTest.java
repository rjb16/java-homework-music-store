import inventory.MusicSheet;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicSheetTest {

    private MusicSheet musicSheet;

    @Before
    public void before() {
        musicSheet = new MusicSheet("Made from the bark of some of the oldest trees in the world", 2.50, 5.50);
    }

    @Test
    public void canGetMarkUp() {
        assertEquals(120.0, musicSheet.calculateMarkup(), 0.5);
    }

    @Test
    public void canGetDescription() {
        assertEquals("Made from the bark of some of the oldest trees in the world", musicSheet.getDescription());
    }
}