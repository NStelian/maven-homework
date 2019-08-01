package ro.itschool.mvnbase.tema17.enumEx;

public class DocumentAlreadyFinishedException extends Exception {
    DocumentAlreadyFinishedException() {
        super("The document is finished");
    }
}
