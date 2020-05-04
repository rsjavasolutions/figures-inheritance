package model;

public class Rectangle extends Figure {

    private double b;

    public Rectangle(String name, double a, double b) {
        super(name, a);
        this.b = b;
    }

    @Override
    public double getArea() {
        return getA() * b;
    }
}