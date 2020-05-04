package model;

public class Triangle extends Figure {

    private double h;

    public Triangle(String name, double a, double h) {
        super(name, a);
        this.h = h;
    }

    @Override
    public double getArea() {
        return (getA()/2) * h;
    }
}
