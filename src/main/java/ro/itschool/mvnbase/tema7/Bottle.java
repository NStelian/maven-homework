package ro.itschool.mvnbase.tema7;

public class Bottle implements Containers {

    private int availableLiquid;
    private int totalCapacity;
    private boolean cap;

    Bottle(int capacity) {
        this.availableLiquid = capacity;
        this.totalCapacity = capacity;
        this.cap = true;
    }

    public int totalCapacity() {
        return totalCapacity;
    }

    public int availableLiquid() {
        return availableLiquid;
    }

    public void open() {
        System.out.println("The bottle is opened");
        cap = false;
    }

    public void close() {
        System.out.println("The bottle is closed");
        cap = true;
    }

    public int emptySpace() {
        return totalCapacity - availableLiquid;
    }

    public void drink(int amount) {
        if (cap == false) {
            if (amount < availableLiquid()  && amount > 0 ) {
                this.availableLiquid -= amount;
                System.out.println("You drank " + amount + " ml");
                close();
            }
            else if(amount <= 0){
                System.out.println("The amount should be greater then 0");
            }
            else {
                System.out.println("You can't drink that amount because the bottle has less liquid");
            }
        }
        else {
            System.out.println("You can't drink, you must open the bottle first!");
        }

    }
}
