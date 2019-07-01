package ro.itschool.mvnbase.tema8;

public class Oval extends RoundShape {
    private double smallRadius;
    private double largeRadius;

    public Oval(double smallRadius, double largeRadius) {
        super(0, 0);
        this.smallRadius = smallRadius;
        this.largeRadius = largeRadius;
    }

    public double getArea() {
        return Math.PI * smallRadius * largeRadius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * Math.pow(((Math.pow(smallRadius, 2) + Math.pow(largeRadius, 2)) / 2), -2);
    }
}
