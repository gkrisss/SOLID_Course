package example1;

import java.util.ArrayList;
import java.util.List;

public class MainShapes {

    public MainShapes() {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Rectangle(2, 5));
        shapes.add(new Circle(10));
        shapes.add(new Line());

        double totalArea = 0;

        for (Shape shape: shapes) {
            totalArea += shape.getArea();
        }

        System.out.println(totalArea);
    }
}
