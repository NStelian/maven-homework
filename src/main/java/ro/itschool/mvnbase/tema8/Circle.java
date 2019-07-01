package ro.itschool.mvnbase.tema8;

public class Circle extends RoundShape {
    private double radius;

    public Circle(int radius) {
        super(0, 0);
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
