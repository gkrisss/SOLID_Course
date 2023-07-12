package example1;

public class CircleDrawOperation {

    private String circleColor;

    public CircleDrawOperation(String circleColor) {
        this.circleColor = circleColor;
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
}
