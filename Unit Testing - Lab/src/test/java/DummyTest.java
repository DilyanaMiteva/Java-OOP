import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Dummy;

public class DummyTest {

    @Test
    public void test1(){
        Dummy dummy = new Dummy(100, 20);
        Assert.assertEquals(100, dummy.getHealth());
    }

    @Test(expected = IllegalStateException.class)
    public void test2(){
        Dummy dummy = new Dummy(0, 20);
        dummy.takeAttack(10);

    }
    @Test(expected = IllegalStateException.class)
    public void test3(){
        Dummy dummy = new Dummy(100, 20);
        dummy.giveExperience();
    }


    @Test()
    public void test4(){
        Dummy dummy = new Dummy(0, 20);
        dummy.giveExperience();
    }


}
