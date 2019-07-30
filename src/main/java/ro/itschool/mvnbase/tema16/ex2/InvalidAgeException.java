package ro.itschool.mvnbase.tema16.ex2;

public class InvalidAgeException extends Exception {
    private final int age;

    public InvalidAgeException(int age) {
        super("Age "+age+" is invalid");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
