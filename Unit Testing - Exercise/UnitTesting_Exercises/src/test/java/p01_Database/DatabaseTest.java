package p01_Database;

import org.junit.Test;

import javax.naming.OperationNotSupportedException;

import static org.junit.Assert.assertEquals;

public class DatabaseTest {

    @Test
    public void test1() throws OperationNotSupportedException {
        Integer[] elements = new Integer[]{4, 7, 10, 31, 9};
        Database database = new Database(elements);
        assertEquals(elements.length, database.getElements().length);
    }
    @Test(expected = OperationNotSupportedException.class)
    public void test2() throws OperationNotSupportedException {
        Integer[] elements = new Integer[18];
        Database database = new Database(elements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test3() throws OperationNotSupportedException {
        Integer[] elements = new Integer[]{4, 7, 10, 31, 9};
        Database database = new Database(elements);
        database.add(null);
    }
    @Test()
    public void test4() throws OperationNotSupportedException {
        Integer[] elements = new Integer[]{4, 7, 10, 31, 9};
        Database database = new Database(elements);
        database.add(5);
        assertEquals(5, database.getElements().length - 1);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test5() throws OperationNotSupportedException {
        Database database = new Database(5);
        database.remove();
        database.remove();

    }
}
