package Decorator;

public class CensoredPieceOfMediaAccess implements PieceOfMediaAccess {

    public PieceOfMediaAccess pieceOfMediaAccess;

    public CensoredPieceOfMediaAccess(PieceOfMediaAccess pieceOfMediaAccess) {
        this.pieceOfMediaAccess = pieceOfMediaAccess;
    }

    @Override
    public PieceOfMedia getPieceOfMedia() {
        return this.getCensoredPieceOfMedia();
    }

    public PieceOfMedia getCensoredPieceOfMedia() {
        PieceOfMedia pieceOfMedia = this.pieceOfMediaAccess.getPieceOfMedia();
        String newContent;
        System.out.printf("Censoring %s by %s...%n", pieceOfMedia.getName(), pieceOfMedia.getAuthor());
        newContent = this.applyCensorship(pieceOfMedia.getContent());
        return new PieceOfMedia(pieceOfMedia.getName(), pieceOfMedia.getAuthor(), newContent);
    }

    private String applyCensorship(String content) {
        return content.replaceAll("[a-zA-Z]", "*");
    }
}
