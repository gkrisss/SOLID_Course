package example1;

public class RectangleDrawOperation {

    private String rectangleColor;

    public RectangleDrawOperation(String rectangleColor) {
        this.rectangleColor = rectangleColor;
    }

    public void drawRectangle(double x1, double y1, double x2, double y2) {
        System.out.printf(
                "Drawing a %s rectangle with top-left at (%f; %f) and bottom-right at (%f; %f)%n",
                rectangleColor,
                x1,
                y1,
                x2,
                y2
        );
    }
}
