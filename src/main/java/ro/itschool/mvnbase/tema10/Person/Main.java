package ro.itschool.mvnbase.tema10.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Ion", 20, "black"),
                new Person("Vasile", 45, "brown"),
                new Person("Laslo", 28, "gray"),
                new Person("Oros", 48, "black"),
                new Person("Dege", 51, "blonde"),
                new Person("Tuse", 18, "brown")
        );

        System.out.println(getNames(persons));

        System.out.println(getOlderPersons(persons,20));

        System.out.println(mapHairListName(persons));
    }

    public static List<String> getNames(List<Person> persons) {
        List<String> names = new ArrayList<>();
        for (Person element : persons) {
            names.add(element.getName());
        }
        return names;
    }

    public static List<Person> getOlderPersons(List<Person> persons, int comparingAge) {
        List<Person> personsList = new ArrayList<>();

        for (Person element : persons) {
            if (element.getAge() > comparingAge) {
                personsList.add(new Person(element.getName(), element.getAge(), element.getHairColor()));
            }
        }

        return persons;
    }

    public static Map<String, List<String>> mapHairListName(List<Person> persons){
        Map<String,List<String>> mapHair = new HashMap<>();
        for (Person person : persons) {
            List<String> names = mapHair.get(person.getHairColor());
            if(names==null){
                names = new ArrayList<>();
                mapHair.put(person.getHairColor(),names);
            }
            names.add(person.getName());
        }
        return mapHair;
    }

}
