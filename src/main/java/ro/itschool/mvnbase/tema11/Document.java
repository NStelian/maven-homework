package ro.itschool.mvnbase.tema11;

import java.util.List;
import java.util.Objects;

public class Document {
    private final int documentID;
    private final String name;
    private final String content;
    private final List<Markup> markups;

    public Document(int documentID, String name, String content, List<Markup> markups) {
        this.documentID = documentID;
        this.name = name;
        this.content = content;
        this.markups = markups;
    }

    public int getDocumentID() {
        return documentID;
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public List<Markup> getMarkups() {
        return markups;
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Document) {
            Document document = (Document) that;
            return documentID == document.documentID &&
                    Objects.equals(name, document.name) &&
                    Objects.equals(content, document.content) &&
                    Objects.equals(markups, document.markups);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(documentID, name, content, markups);
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentID=" + documentID +
                ", name='" + name + '\'' +
                ", content=" + content +
                ", markups='" + markups + '\'' +
                '}';
    }
}
