
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.apache.commons.lang3.RandomStringUtils;
import praktikum.Bun;

import java.util.Random;

public class TestBun {

    private String name;
    private float price;

    @Before
    public void createBun(){
        name = RandomStringUtils.randomAlphabetic(10);
        Random r = new Random();
        price = r.nextFloat()* 1000;
        System.out.println("random " + name + " price " + price);
    }

    @Test
    public void checkName(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(name, bun.getName());
    }

    @Test
    public void checkPrice(){
        Bun bun = new Bun(name, price);
        Assert.assertEquals(price, bun.getPrice(), 0);
    }
}
