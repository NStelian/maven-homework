package ro.itschool.mvnbase.tema17.enumEx;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    private Document getDocumentById(String documentId) throws IncorectIdException {
        for (Document document : documents) {
            if (document.getDocumentId() == documentId) {
                return document;
            }
        }
        throw new IncorectIdException();
    }

    public List<Document> getInProgressDocuments() {
        List<Document> result = new ArrayList<>();
        for (Document document : documents) {
            if (document.getStatus().equals(Status.IN_PROGRESS)) {
                result.add(document);
            }
        }
        return result;
    }

    public List<Document> getFailedDocuments() {
        List<Document> result = new ArrayList<>();
        for (Document document : documents) {
            if (document.getStatus().equals(Status.FAILED)) {
                result.add(document);
            }
        }
        return result;
    }

    public void startDocument(String documentId) throws DocumentAlreadyInProgressException, DocumentAlreadyFinishedException, IncorectIdException {
        Document document = getDocumentById(documentId);
        if (document.getStatus().equals(Status.NEW)) {
            document.changeStatus(Status.IN_PROGRESS);
        } else if (document.getStatus().equals(Status.IN_PROGRESS)) {
            throw new DocumentAlreadyInProgressException();
        } else {
            throw new DocumentAlreadyFinishedException();
        }
    }

    public void completeDocument(String documentId) throws DocumentNotInProgressException, IncorectIdException {
        Document document = getDocumentById(documentId);
        if (document.getStatus().equals(Status.IN_PROGRESS)) {
            document.changeStatus(Status.SUCCESS);
        } else {
            throw new DocumentNotInProgressException();
        }
    }

    public void failDocument(String documentId) throws DocumentNotInProgressException, IncorectIdException {
        Document document = getDocumentById(documentId);
        if (document.getStatus().equals(Status.IN_PROGRESS)) {
            document.changeStatus(Status.FAILED);
        } else {
            throw new DocumentNotInProgressException();
        }
    }
}
