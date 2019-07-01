package ro.itschool.mvnbase.tema8;

public abstract class SideShape implements Shape {
    private int noOfSides;

    public SideShape(int noOfSides) {
        this.noOfSides = noOfSides;
    }

    public int getNoOfSides() {
        return noOfSides;
    }
}
