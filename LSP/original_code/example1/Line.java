package example1;

public class Line implements Shape {

    @Override
    public double getArea() {
        throw new RuntimeException("Cannot get the area of a line");
    }
}
