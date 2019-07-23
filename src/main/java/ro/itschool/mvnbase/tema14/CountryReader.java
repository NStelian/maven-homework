package ro.itschool.mvnbase.tema14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {
    private final List<Country> countries;

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountry(path);
    }

    private List<Country> fetchCountry(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = breader.readLine()) != null) {
            String[] country = line.split(Pattern.quote("|"));
            result.add(new Country(country[0], country[1], Long.parseLong(country[2]), Integer.parseInt(country[3])));
        }
        return result;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
