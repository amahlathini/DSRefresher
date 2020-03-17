package za.co.designsbyayaar;

import junit.framework.TestCase;
import org.junit.*;

public class SetRefresherTest extends TestCase {
    SetRefresher countrySet;

    @Before
    public void setUp() throws Exception {
        countrySet = new SetRefresher();
    }

    @Ignore
    @Test
    public void testTreeIsEmpty() {
        assertTrue(countrySet.countryTree().isEmpty());
    }

    @Test
    public void testTreeWithSize() {
        assertEquals(countrySet.countryTree().size(), 7);
    }
}