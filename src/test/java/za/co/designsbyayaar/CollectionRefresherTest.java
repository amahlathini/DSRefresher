package za.co.designsbyayaar;

import junit.framework.TestCase;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;

public class CollectionRefresherTest extends TestCase {
    CollectionRefresher books;

    @Before
    public void setUp() throws Exception {
        books = new CollectionRefresher();
    }

    @Test
    public void testStackBySize() {
        assertEquals(books.bookStack().size() , 3);
    } 
    
    @Test
    public void testStack() {
        assertEquals(books.bookStack().elementAt(2) , "Thembisa noMakhaya");
    }
}