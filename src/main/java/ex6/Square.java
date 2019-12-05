package ex6;

import java.math.BigDecimal;

public class Square implements Figure {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getCircuit() {
        return 4*a;
    }

}
