package ro.itschool.mvnbase.tema8;

public abstract class RoundShape implements Shape {
    private int centerX;
    private int centerY;

    protected RoundShape(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    public int getCenterX() {
        return centerX;
    }

    public int getCenterY() {
        return centerY;
    }
}
