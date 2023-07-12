package example1;

public class Screen {

    public void draw() {
        DrawOperation operation = new DrawOperation("red", "green", "blue");

        operation.drawLine(1, 2, 3, 4);
        operation.drawCircle(5, 5, 10);
    }
}
