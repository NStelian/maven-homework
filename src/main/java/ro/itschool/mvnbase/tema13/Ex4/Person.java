package ro.itschool.mvnbase.tema13.Ex4;

import java.util.UUID;

public class Person {
    private final UUID id;
    private final String name;
    private final String address;
    private final int age;


    public Person(String name, String address, int age) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", adress='" + address + '\'' +
                ", age=" + age +
                '}' + "\n";
    }
}
