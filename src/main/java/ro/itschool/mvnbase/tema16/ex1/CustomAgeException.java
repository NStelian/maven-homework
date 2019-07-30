package ro.itschool.mvnbase.tema16.ex1;

public class CustomAgeException extends Exception {
    private final int age;

    public CustomAgeException(int age) {
        super("This is not an age");
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
