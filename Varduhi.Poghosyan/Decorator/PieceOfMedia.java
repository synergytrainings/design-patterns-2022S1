package Decorator;

public class PieceOfMedia {

    private final String name;
    private final String author;
    private final String content;

    public PieceOfMedia(String name, String author, String content) {
        this.name = name;
        this.author = author;
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }
}
