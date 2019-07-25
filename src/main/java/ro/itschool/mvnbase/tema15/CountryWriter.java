package ro.itschool.mvnbase.tema15;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CountryWriter {
    private final String file;
    private BufferedWriter writer;
    private boolean opened;

    public CountryWriter(String file) throws IOException {
        this.file=file;
        this.writer=new BufferedWriter(new FileWriter(file));
        this.opened=true;
    }

    private void writeCountry(Country country, boolean doFlush) throws IOException {
        if (!opened) {
            writer = openWithAppend();
        }
        writer.write(String.format("<h1>%s</h1><h3>%s</h3><p>Population: %s</p><p>Area: %s</p><p>Region: %s" +
                "</p><p>Borders: %s</p>",country.getName(),country.getCapital(),country.getPopulation(),
                country.getArea(),country.getRegion(),country.getBorders()));
        writer.newLine();
        if (doFlush) {
            writer.flush();
        }
    }

    public void writeCountry(List<Country> countries) throws IOException {
        for (Country country : countries) {
            writeCountry(country, false);
        }
        writer.flush();
    }

    public void writeCountry(Country country) throws IOException {
        writeCountry(country, true);
    }

    private BufferedWriter openWithAppend() throws IOException {
        return new BufferedWriter(new FileWriter(file, true));
    }
    public void closeWriter() throws IOException {
        writer.close();
        opened = false;
    }
}
