public class Subtask extends Task {
    protected Integer epicID;

    public Integer getEpicID() {
        return epicID;
    }

    public void setEpicID(Integer epicID) {
        this.epicID = epicID;
    }

    //при создании сабтаска принимаем на вход эпик в который он входит
    public Subtask(String name, String description, int epicID) {
        super(name, description);
        this.epicID = epicID;
    }
}