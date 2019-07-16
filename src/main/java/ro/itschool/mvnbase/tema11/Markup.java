package ro.itschool.mvnbase.tema11;

import java.util.Objects;

public class Markup {
    private final int markupID;
    private final int position;
    private final String content;


    public Markup(int markupID, int position, String content) {
        this.markupID = markupID;
        this.position = position;
        this.content = content;
    }

    public int getMarkupID() {
        return markupID;
    }

    public int getPosition() {
        return position;
    }

    public String getContent() {
        return content;
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof Markup) {
            Markup markup = (Markup) that;
            return markupID == markup.markupID &&
                    position == markup.position &&
                    Objects.equals(content, markup.content);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(markupID, position, content);
    }

    @Override
    public String toString() {
        return "Markup{" +
                "markupID=" + markupID +
                ", position='" + position + '\'' +
                ", content=" + content +
                '}';
    }
}
