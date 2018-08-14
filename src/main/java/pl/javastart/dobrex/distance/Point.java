package pl.javastart.dobrex.distance;

public class Point {
    private double length;
    private double width;

    public Point(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
