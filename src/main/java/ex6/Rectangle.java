package ex6;

import java.math.BigDecimal;

public class Rectangle implements Figure {

    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getCircuit() {
        return 2*(a+b);
    }
}
