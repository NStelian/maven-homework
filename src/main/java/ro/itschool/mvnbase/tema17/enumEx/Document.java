package ro.itschool.mvnbase.tema17.enumEx;

import java.util.Objects;

public class Document {
    private final String documentId;
    private final String name;
    private Status status;

    public Document(String documentId, String name) {
        this.documentId = documentId;
        this.name = name;
        this.status = Status.NEW;
    }

    public String getDocumentId() {
        return documentId;
    }

    public String getName() {
        return name;
    }

    public Status getStatus() {
        return status;
    }

    public void changeStatus(Status status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Document document = (Document) o;
        return Objects.equals(documentId, document.documentId) &&
                Objects.equals(name, document.name) &&
                status == document.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(documentId, name, status);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentId='" + documentId + '\'' +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
