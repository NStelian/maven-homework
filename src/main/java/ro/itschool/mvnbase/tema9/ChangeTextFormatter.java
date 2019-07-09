package ro.itschool.mvnbase.tema9;

public class ChangeTextFormatter implements TextFormatter {
    private String source;
    private String target;

    public ChangeTextFormatter(String source, String target) {
        this.source = source;
        this.target = target;
    }


    @Override
    public String format(String text) {
        return text.replaceAll(source, target);
    }
}
