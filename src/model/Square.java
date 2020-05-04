package model;

public class Square extends Figure {

    public Square(String name, double a) {
        super(name, a);
    }

    @Override
    public double getArea() {
        return Math.pow(getA(),2);
    }
}
