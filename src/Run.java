import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        //Zadanie (Figury)
        //Napisz klasę abstrakcyjną model.Figure, która zawiera pole name, metodę String getName()
        // oraz metodę abstrakcyjną double getArea().

        //Wykorzystaj klasę abstrakcyjnej do napisania klas różnych figur zawierających pola z długościami potrzebnymi do obliczenia pola tych figur:
        //• model.Rectangle • Squere • model.Triangle • model.Circle
        //Sprawdź w metodzie main pola różnych figur i ładnie wypisz jakie figury mają jakie pola.
        //

        Figure square = new Square("Square", 10);
        Figure rectangle = new Rectangle("Rectangle", 10, 5);
        Figure triangle = new Triangle("Triangle", 10, 8);
        Figure circle = new Circle("Circle", 10);

        List<Figure> figures = new ArrayList<>(Arrays.asList(square, rectangle, triangle, circle));

        for (Figure figure : figures) {
            System.out.println(String.format("Area of " + figure.getName() + " equals: %.2f", figure.getArea()));
        }
    }
}
