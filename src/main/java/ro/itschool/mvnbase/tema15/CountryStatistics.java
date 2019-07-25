package ro.itschool.mvnbase.tema15;

import java.util.ArrayList;
import java.util.List;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public List<Country> getCountriesForRegion(String region) {
        List<Country> result = new ArrayList<>();
        for (Country country : countries) {
            if (country.getRegion().equals(region)) {
                result.add(country);
            }
        }
        return result;
    }

    public List<Country> getCountriesBordering(String borderInitials){
        List<Country> result = new ArrayList<>();
        for (Country country : countries){
            if(country.getBorders().contains(borderInitials)){
                result.add(country);
            }
        }
        return result;
    }

    public List<String> getBorderingCountries(String countryName){
        for (Country country : countries){
            if(country.getName().equals(countryName)){
                return country.getBorders();
            }
        }
        return null;
    }
}
