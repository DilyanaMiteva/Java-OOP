package p04_BubbleSortTest;

import org.junit.Assert;
import org.junit.Test;

public class BubbleTest {
    @Test
    public void test1(){
        int[] array = new int[]{3, 5, -2, 16, 43, 12};
        Bubble.sort(array);
        int[] expectedArray = new int[]{-2, 3, 5, 12, 16, 43};
        Assert.assertArrayEquals(expectedArray, array);
    }
}
