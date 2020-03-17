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
        assertEquals(countrySet.countryTree().isEmpty(), false);
    }

    @Test
    public void testTreeWithSize() {
        assertEquals(countrySet.countryTree().size(), 7);
    }
}