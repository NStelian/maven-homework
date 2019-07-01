package ro.itschool.mvnbase.tema8;

public class Square extends SideShape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public int getNoOfSides() {
        return 4;
    }
}
