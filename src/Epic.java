import java.util.ArrayList;

public class Epic extends Task {
    protected ArrayList<Integer> subtasksIds = new ArrayList<>(); //ID сабтасков по эпику

    public Epic(String name, String description) {
        super(name, description);
    }

    public void addSubtask(int subtaskId) {
        subtasksIds.add(subtaskId);
    }
}
