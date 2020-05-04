package model;

public class Circle extends Figure {


    public Circle(String name, double a) {
        super(name, a);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(getA(), 2);
    }
}
