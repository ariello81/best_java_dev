package ex6;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    private final double DELTA = 10e-15;

    @Test
    public void testArea(){
        //given
        double a = 2.5;
        Figure square = new Square(a);

        //is
        double area = square.getArea();

        //expected
        Assert.assertEquals(6.25, area, DELTA);
    }

    @Test
    public void testCircuit(){
        //given
        double a = 2.7;
        Figure square = new Square(a);

        //is
        double circuit = square.getCircuit();

        //expected
        Assert.assertEquals(10.8, circuit, DELTA);
    }

}
