package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    java.lang.String[] elements = new java.lang.String[]{"A", "B", "C"};
    private ListIterator listIterator;

    @Before
    public void setUp() throws OperationNotSupportedException {
        this.listIterator = new ListIterator(elements);
    }

    @Test(expected = OperationNotSupportedException.class)
    public void test1() throws OperationNotSupportedException {
        new ListIterator(null);
    }
    @Test
    public void test2() throws OperationNotSupportedException {
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertFalse(listIterator.move());
    }

    @Test(expected = IllegalStateException.class)
    public void test3() throws OperationNotSupportedException {
        new ListIterator().print();
    }

    @Test
    public void test4() throws OperationNotSupportedException {
        for (int i = 0; listIterator.hasNext(); listIterator.move(), i++) {
            Assert.assertEquals(elements[i], listIterator.print());
        }

    }





}
