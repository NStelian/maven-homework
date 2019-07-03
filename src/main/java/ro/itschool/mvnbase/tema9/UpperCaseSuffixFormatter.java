package ro.itschool.mvnbase.tema9;

public class UpperCaseSuffixFormatter extends UpperCaseFormatter {
    public String format(String text, String customSuffix) {
        return customSuffix + text.toUpperCase();
    }
}
