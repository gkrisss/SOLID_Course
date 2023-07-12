package example1;

public class Screen {

    public void draw() {
        LineDrawOperation operationLine = new LineDrawOperation(
                "red"
        );

        CircleDrawOperation operationCircle = new CircleDrawOperation(
                "green"
        );

        operationLine.drawLine(1, 2, 3, 4);
        operationCircle.drawCircle(5, 5, 10);
    }
}
