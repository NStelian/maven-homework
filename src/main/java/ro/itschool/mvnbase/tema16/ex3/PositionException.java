package ro.itschool.mvnbase.tema16.ex3;

public class PositionException extends Exception{
    private final int number;

    public PositionException(int number) {
        super("The position "+number+" is invalid");
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
