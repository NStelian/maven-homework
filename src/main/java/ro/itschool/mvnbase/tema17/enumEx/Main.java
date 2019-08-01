package ro.itschool.mvnbase.tema17.enumEx;

import java.util.List;

public class Main {
    public static void main(String[] args) throws IncorectIdException, DocumentAlreadyInProgressException, DocumentAlreadyFinishedException, DocumentNotInProgressException {
        DocumentService documentService = new DocumentService(List.of(
                new Document("1","Steli"),
                new Document("2","Mircea"),
                new Document("3","Nitu")
        ));

        System.out.println(documentService.getDocuments());
        documentService.startDocument("1");
        System.out.println(documentService.getInProgressDocuments());
        documentService.failDocument("1");
        System.out.println(documentService.getFailedDocuments());
    }
}
