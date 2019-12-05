package ex6;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class RectangleTest {

    private final double DELTA = 10e-15;

    @Test
    public void testArea(){
        //given
        double a = 5.0;
        double b = 4.2;
        Figure rectangle = new Rectangle(a, b);

        //is
        double area = rectangle.getArea();

        //expected
        Assert.assertEquals(21, area, DELTA);
    }

    @Test
    public void testCircuit(){
        //given
        double a = 2.1;
        double b = 5.2;
        Figure rectangle = new Rectangle(a, b);

        //is
        double circuit = rectangle.getCircuit();

        //expected
        Assert.assertEquals(14.6, circuit, DELTA);
    }

}
