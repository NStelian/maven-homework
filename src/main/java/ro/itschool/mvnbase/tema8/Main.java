package ro.itschool.mvnbase.tema8;

public class Main {
    public static void main(String[] args) {
        Square patrat = new Square(10);
        System.out.println("Sides: " + patrat.getNoOfSides() + " Area " + patrat.getArea() + " Perimeter " + patrat.getPerimeter());
    }
}
