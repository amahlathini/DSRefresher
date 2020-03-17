package za.co.designsbyayaar;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class ListRefresherTest extends TestCase {
    ListRefresher cityList;

    @Before
    public void setUp() throws Exception {
        cityList = new ListRefresher();
    }

    @Test
    public void testList() {
        assertEquals(cityList.cityList().get(7), "Los Angels");
    }
}