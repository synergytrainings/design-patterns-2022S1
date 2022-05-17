package synisys.trainings;

public class DocumentCreator {
    public static void main(String[] args) {

        DocumentHistoryManager documentHistoryManager = DocumentHistoryManager.INSTANCE;

        documentHistoryManager.addHistory("text");
        documentHistoryManager.addHistory("text edited");

        documentHistoryManager.undo();

        System.out.println(documentHistoryManager.getCurrentState());

    }
}
