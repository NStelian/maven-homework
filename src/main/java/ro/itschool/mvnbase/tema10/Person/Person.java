package ro.itschool.mvnbase.tema10.Person;

public class Person {
    private String name;
    private int age;
    private String hairColor;

    Person(String name, int age, String hairColor) {
        this.name = name;
        this.age = age;
        this.hairColor = hairColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHairColor() {
        return hairColor;
    }

    public String toString() {
        return name + " " + age + " " + hairColor;
    }
}
