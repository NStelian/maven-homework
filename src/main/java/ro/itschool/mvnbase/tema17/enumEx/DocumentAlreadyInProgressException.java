package ro.itschool.mvnbase.tema17.enumEx;

public class DocumentAlreadyInProgressException extends Exception {
    DocumentAlreadyInProgressException() {
        super("The document is already in progress");
    }
}
