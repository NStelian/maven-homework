package ro.itschool.mvnbase.tema7;

public class Main {
    public static void main(String[] args) {
        Bottle flacon = new Bottle(500);
        flacon.drink(100);
        flacon.open();
        flacon.drink(100);
        System.out.println("Bottle have "+ flacon.availableLiquid() + " ml left");
        flacon.drink(100);
        flacon.open();
        flacon.drink(400);
        flacon.drink(-400);
        flacon.drink(100);
        System.out.println("Bottle have "+ flacon.availableLiquid() + " ml left");
        System.out.println("You drank in total "+ flacon.emptySpace() + " ml");
        System.out.println("Total capacity: "+flacon.totalCapacity()+" ml");
    }

}
