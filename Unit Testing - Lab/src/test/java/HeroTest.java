import org.junit.Assert;
import org.junit.Test;
import rpg_lab.Dummy;
import rpg_lab.Hero;

public class HeroTest {

    @Test
    public void test1(){
        Hero hero = new Hero("test");
        Assert.assertEquals("test", hero.getName());
    }
    @Test
    public void test2(){
        Hero hero = new Hero("test");
        Dummy dummy = new Dummy(100, 20);

    }

}
