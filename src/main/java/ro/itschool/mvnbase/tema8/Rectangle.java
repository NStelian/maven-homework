package ro.itschool.mvnbase.tema8;

public class Rectangle extends SideShape {
    private int smallSide;
    private int largeSide;

    public Rectangle(int smallSide, int largeSide) {
        this.smallSide = smallSide;
        this.largeSide = largeSide;
    }

    public double getArea() {
        return smallSide * largeSide;
    }

    public double getPerimeter() {
        return 2 * (smallSide + largeSide);
    }

    public int getNoOfSides() {
        return 4;
    }
}
