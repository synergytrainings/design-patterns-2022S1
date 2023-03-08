package Decorator;

public class Main {

    public static void main(String[] args) throws Exception {
        PieceOfMediaAccess pieceOfMediaAccess = new UnrestrictedPieceOfMediaAccess("Alice in Wonderland", "Lewis Carroll");
        System.out.printf("Usual content: %s%n", pieceOfMediaAccess.getPieceOfMedia().getContent());
        PieceOfMediaAccess censoredPieceOfMedia = new CensoredPieceOfMediaAccess(pieceOfMediaAccess);
        System.out.printf("Censored content: %s%n", censoredPieceOfMedia.getPieceOfMedia().getContent());
    }
}
