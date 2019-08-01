package ro.itschool.mvnbase.tema17.enumEx;

public class DocumentNotInProgressException extends Exception {
    DocumentNotInProgressException(){
        super("Document status should be IN_PROGRESS");
    }
}
