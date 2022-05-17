import java.time.LocalDate;

public class CaseNumberForm {

    private static NumberGenerator generator = NumberGenerator.getInstance();

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(String.format("%05d", generator.getNextNumber()) + "/" + LocalDate.now().getYear());
        }
    }
}
