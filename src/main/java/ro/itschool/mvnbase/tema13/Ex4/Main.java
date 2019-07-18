package ro.itschool.mvnbase.tema13.Ex4;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PersonFileReader personReader = new PersonFileReader("src/main/resources/tema13/ex4.in");
        System.out.println(personReader.getPersons());
    }
}
