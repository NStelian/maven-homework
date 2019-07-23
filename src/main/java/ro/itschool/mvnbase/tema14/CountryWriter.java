package ro.itschool.mvnbase.tema14;

import java.io.*;

public class CountryWriter {
    private final String file;
    private BufferedWriter writer;
    private boolean opened;

    public CountryWriter(String file) throws IOException {
        this.file = file;
        writer = new BufferedWriter(new FileWriter(file));
        this.opened = true;
    }

    public void writeCountry(Country country) throws IOException {
        if (!opened) {
            writer = openWithAppend();
        }
        writer.write(String.format("The country of %s has capital in %s with a population of %s on an area of %s km2",
                country.getName(), country.getCapital(), country.getPopulation(), country.getArea()));
        writer.newLine();
        writer.flush();
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(file, true));
    }

    public void closeWriter() throws IOException {
        writer.close();
        opened = false;
    }
}
