package Decorator;

import java.util.Objects;

public class UnrestrictedPieceOfMediaAccess implements PieceOfMediaAccess {

    private final PieceOfMedia pieceOfMedia;

    public UnrestrictedPieceOfMediaAccess(String name, String author) {
        this.pieceOfMedia = new PieceOfMedia(
                Objects.requireNonNull(name),
                Objects.requireNonNull(author),
                this.findContent(name, author)
        );
    }

    @Override
    public PieceOfMedia getPieceOfMedia() {
        return this.pieceOfMedia;
    }

    private String findContent(String name, String author) {
        return String.format("This is the content of %s by %s.", name, author);
    }
}
