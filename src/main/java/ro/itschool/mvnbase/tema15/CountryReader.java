package ro.itschool.mvnbase.tema15;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class CountryReader {
    private final List<Country> countries;

    public CountryReader(String path) throws IOException {
        this.countries = fetchCountries(path);
    }

    private List<Country> fetchCountries(String path) throws IOException {
        List<Country> result = new ArrayList<>();
        BufferedReader breader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = breader.readLine()) != null) {
            String[] countrySplitter = line.split(Pattern.quote("|"));
            List<String> borders = new ArrayList<>();
            if (countrySplitter.length == 6) {
                borders = Arrays.asList(countrySplitter[5].split(Pattern.quote("~")));
            }
            result.add(new Country(countrySplitter[0], countrySplitter[1], Long.parseLong(countrySplitter[2]),
                    Integer.parseInt(countrySplitter[3]), countrySplitter[4], borders));
        }
        return result;
    }

    public List<Country> getCountries() {
        return countries;
    }
}
