package ro.itschool.mvnbase.tema21.Ex1;

import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Nitu", 21, "Oradea", true),
                new Person("Mircea", 12, "Nagyvarad", false),
                new Person("Stelian", 19, "Varadnagy", true),
                new Person("Eugen", 17, "Deaora", false)
        );

        List<String> names = persons.stream()
                .filter(person -> person.getAge() >= 18)
                .map(person -> person.getName())
                .collect(Collectors.toList());
        System.out.println(names);

        persons.stream()
                .forEach(person -> System.out.print(person.getName() + ":" + person.getCity() + ":" + person.getAge()+" "));


        List<Person> startingWith = persons.stream()
                .filter(person -> person.getName().startsWith("S"))
                .collect(Collectors.toList());
        System.out.println(startingWith);

        List<Person> hasCar = persons.stream()
                .filter(person -> person.isHasCar())
                .collect(Collectors.toList());
        System.out.println(hasCar);
    }
}
