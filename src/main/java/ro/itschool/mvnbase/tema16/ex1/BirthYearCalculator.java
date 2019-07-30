package ro.itschool.mvnbase.tema16.ex1;

public class BirthYearCalculator {
    private final int age;

    public int getAge() {
        return age;
    }

    public BirthYearCalculator(int age) {
        this.age = age;
    }

    public int calculate() throws CustomAgeException {
        if (age<=0 || age > 122) {
            throw new CustomAgeException(age);
        }
        return 2019-age;
    }
}
