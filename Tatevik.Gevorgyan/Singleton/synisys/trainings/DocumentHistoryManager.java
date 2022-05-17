package synisys.trainings;

import java.util.LinkedList;

public enum DocumentHistoryManager {
    INSTANCE;

    final LinkedList<String> history = new LinkedList<>();

    public String getCurrentState() {
        return history.getLast();
    }

    public void addHistory(String text) {
        history.addLast(text);
    }

    public void undo() {
        if (history.size() > 0) {
            history.removeLast();
        } else {
            throw new Error("Can't process undo.");
        }
    }
}
