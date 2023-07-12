package example1;

public class DrawOperation {

    private String lineColor;
    private String circleColor;
    private String rectangleColor;

    public DrawOperation(String lineColor, String circleColor, String rectangleColor) {
        this.lineColor = lineColor;
        this.circleColor = circleColor;
        this.rectangleColor = rectangleColor;
    }

    public void drawLine(double x1, double y1, double x2, double y2) {
        System.out.printf(
                "Drawing a %s line from (%f; %f) to (%f; %f)%n",
                lineColor,
                x1,
                y1,
                x2,
                y2
        );
    }

    public void drawCircle(double x, double y, double radius) {
        System.out.printf(
                "Drawing a %s circle with the radius of %f at (%f, %f)",
                circleColor,
                radius,
                x,
                y
        );
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
