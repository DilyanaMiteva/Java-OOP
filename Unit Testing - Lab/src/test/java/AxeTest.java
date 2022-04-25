import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Axe;
import rpg_lab.Dummy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AxeTest {
    @Test
    public void test1(){
        Axe axe = new Axe(10, 10);
        assertEquals(10, axe.getAttackPoints());
        assertEquals(10, axe.getDurabilityPoints());
    }

    @Test(expected = IllegalStateException.class)
    public void test2(){
        Axe axe = new Axe(10,0);
        Dummy dummy = new Dummy(100, 20);

        axe.attack(dummy);
    }

    @Test()
    public void test3(){
        Axe axe = new Axe(10,10);
        Dummy dummy = new Dummy(100, 20);

        axe.attack(dummy);
        assertEquals(10 - 1, axe.getDurabilityPoints());
    }

}
