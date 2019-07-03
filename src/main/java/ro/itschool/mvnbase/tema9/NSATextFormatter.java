package ro.itschool.mvnbase.tema9;

public class NSATextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text.replaceAll("NSA", "***");
    }
}
