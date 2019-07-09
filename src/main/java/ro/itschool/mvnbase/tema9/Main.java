package ro.itschool.mvnbase.tema9;

public class Main {
    public static void main(String[] args) {
        UpperCaseFormatter up = new UpperCaseFormatter();
        System.out.println(up.format("steli"));

        UpperCaseSuffixFormatter upS = new UpperCaseSuffixFormatter();
        System.out.println(upS.format("steli","n"));

        NSATextFormatter nsa = new NSATextFormatter();
        System.out.println(nsa.format("we can't talk about NSA"));

        ChangeTextFormatter change = new ChangeTextFormatter("mere","pere");
        System.out.println(change.format("Eu am mere"));
    }
}
