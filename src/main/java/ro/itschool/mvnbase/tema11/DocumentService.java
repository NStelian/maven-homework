package ro.itschool.mvnbase.tema11;

import java.util.ArrayList;
import java.util.List;

public class DocumentService {
    private final List<Document> documents;

    public DocumentService(List<Document> documents) {
        this.documents = documents;
    }

    public List<Document> getAllDocuments() {
        return new ArrayList<>(documents);
    }

    public Document getDocumentWithName(String name) {
        Document result = null;
        for (Document document : documents) {
            if (document.getName().equals(name)) {
                result = document;
            }
        }
        return result;
    }

    public void addMarkupForDocument(int markupID, int position, String content) {
        for (Document document : documents) {
            if (markupID == document.getDocumentID()) {
                Markup markup = new Markup(markupID,position,content);
                System.out.println("Succes");
            }else {
                System.out.println("Failed");
            }
        }
    }

    public void getMarkupsForDocument(Document document) {
    }
}
