package ro.itschool.mvnbase.tema17.enumEx;

public class IncorectIdException extends Exception {
    IncorectIdException(){
        super("Document with that id doesn't exist");
    }
}
