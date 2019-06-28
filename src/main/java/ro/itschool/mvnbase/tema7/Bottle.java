package ro.itschool.mvnbase.tema7;

public class Bottle implements Containers {

    private int totalCapacity;
    private int availableLiquid;
    private boolean cap;

    Bottle(int capacity) {
        this.availableLiquid = capacity;
        this.totalCapacity = capacity;
        this.cap = true;
    }

    public boolean hasMore() {
        return availableLiquid > 0;
    }

    public int availableLiquid() {
        return availableLiquid;
    }

    public int emptySpace() {
        return totalCapacity - availableLiquid;
    }

    public int totalCapacity() {
        return totalCapacity;
    }

    public void open() {
        this.cap = false;
        System.out.println("The bottle is opened");
    }

    public void close() {
        this.cap = true;
        System.out.println("The bottle is closed");
    }

    public void drink(int amount) {
        if (cap == false) {
            if (amount <= availableLiquid && amount > 0) {
                this.availableLiquid -= amount;
                System.out.println("You drank " + amount + " ml");
                close();
            } else if (amount <= 0) {
                System.out.println("The amount should be greater then 0");
            } else {
                System.out.println("The bottle has less liquid");
            }
        } else {
            System.out.println("You can't drink, you must open the bottle first!");
        }
    }
}
