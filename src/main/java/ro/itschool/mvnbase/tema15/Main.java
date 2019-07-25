package ro.itschool.mvnbase.tema15;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CountryReader countryReader = new CountryReader("src/main/resources/tema15/countries2.txt");
        System.out.println(countryReader.getCountries());
        CountryStatistics countryStatistics = new CountryStatistics(countryReader.getCountries());
        System.out.println(countryStatistics.getCountriesForRegion("Europe"));
        System.out.println(countryStatistics.getCountriesBordering("ROU"));
        System.out.println(countryStatistics.getBorderingCountries("Romania"));
        CountryWriter countryWriter = new CountryWriter("src/main/resources/tema15/countries.html");
        countryWriter.writeCountry(countryReader.getCountries());
    }
}