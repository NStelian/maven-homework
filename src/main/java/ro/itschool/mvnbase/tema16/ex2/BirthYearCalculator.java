package ro.itschool.mvnbase.tema16.ex2;

public class BirthYearCalculator {
    private final int age;

    public int getAge() {
        return age;
    }

    public BirthYearCalculator(int age) {
        this.age = age;
    }

    public int calculate() throws InvalidAgeException {
        if(age<=0){
            throw new InvalidAgeException(age);
        }
        return 2019-age;
    }
}
