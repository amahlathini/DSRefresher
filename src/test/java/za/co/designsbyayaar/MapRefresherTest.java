package za.co.designsbyayaar;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MapRefresherTest extends TestCase {


        MapRefresher area;

        @Before
        public void setUp() throws Exception {
            area = new MapRefresher();
        }

        @Test
        public void testMap() {
            assertTrue(area.areaCode().size() == 6);
        }
    }
