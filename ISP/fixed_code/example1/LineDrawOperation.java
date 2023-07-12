package example1;

public class LineDrawOperation {

    private String lineColor;

    public LineDrawOperation(String lineColor) {
        this.lineColor = lineColor;
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
}
