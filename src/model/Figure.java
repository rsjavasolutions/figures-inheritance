package model;//Napisz klasę abstrakcyjną model.Figure, która zawiera pole name, metodę String getName()
// oraz metodę abstrakcyjną double getArea().

public abstract class Figure {

    private String name;
    private double a;

    public Figure(String name, double a) {
        this.name = name;
        this.a = a;
    }

    public String getName() {
        return name;
    }

    public double getA() {
        return a;
    }

   public abstract double getArea();
}
