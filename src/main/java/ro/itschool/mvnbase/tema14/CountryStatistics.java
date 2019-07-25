package ro.itschool.mvnbase.tema14;

import java.util.List;

public class CountryStatistics {
    private final List<Country> countries;

    public CountryStatistics(List<Country> countries) {
        this.countries = countries;
    }

    public List<Country> getAllCountries() {
        return countries;
    }

    public Country getCountriesStartingWithLetter(String letter) {
        for (Country country : countries) {
            if (country.getName().startsWith(letter)) {
                return country;
            }
        }
        return null;
    }

    public String getCountryCapital(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getCapital();
            }
        }
        return null;
    }

    public long getPopulation(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getPopulation();
            }
        }
        return 0;
    }

    public int getArea(String countryName) {
        for (Country country : countries) {
            if (country.getName().equals(countryName)) {
                return country.getArea();
            }
        }
        return 0;
    }

    public Country getLargestCountry() {
        Country largestCountry = null;
        int largestArea = 0;
        for (Country country : countries) {
            if (country.getArea() >= largestArea) {
                largestArea = country.getArea();
                largestCountry = country;
            }
        }
        return largestCountry;
    }

    public Country getMostPeopleCountry() {
        Country mostPeopleCountry = null;
        long mostPeople = 0;
        for (Country country : countries) {
            if (country.getPopulation() >= mostPeople) {
                mostPeople = country.getPopulation();
                mostPeopleCountry = country;
            }
        }
        return mostPeopleCountry;
    }

    public Country getMostDenseCountry() {
        double dense = Double.MAX_VALUE;
        Country denseCountry = null;
        for (Country country : countries) {
            double crtDensity = (double)country.getArea() / country.getPopulation();
            if (crtDensity <= dense) {
                dense = crtDensity;
                denseCountry = country;
            }
        }
        return denseCountry;
    }

}
