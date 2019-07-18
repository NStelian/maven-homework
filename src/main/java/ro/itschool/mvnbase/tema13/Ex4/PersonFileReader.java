package ro.itschool.mvnbase.tema13.Ex4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class PersonFileReader {
    private final List<Person> persons;

    public PersonFileReader(String path) throws IOException {
        this.persons = fetchPersons(path);
    }

    public List<Person> getPersons() {
        return persons;
    }

    private List<Person> fetchPersons(String path) throws IOException {
        List<Person> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = breader.readLine()) != null) {
            String[] person = line.split(Pattern.quote("|"));
            result.add(new Person(person[0], person[1], Integer.parseInt(person[2])));
        }

        return result;
    }
}
