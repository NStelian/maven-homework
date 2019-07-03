package ro.itschool.mvnbase.tema9;

public class ChangeTextFormatter implements TextFormatter {
    private String text;

    public ChangeTextFormatter(String text) {
        this.text = text;
    }


    @Override
    public String format(String text) {
        this.text = text;
        return this.text;
    }
}
