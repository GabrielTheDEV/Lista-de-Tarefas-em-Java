package model;

public class Task {

    private String description;
    private boolean completed;

    public Task(String description ){
        this.description = description;
        this.completed = false;
    }
    public String getDescription() {
        return description;
    }
    public String isCompleted() {
        if(completed) {
            return "feito";
        }
        return "Incompleto";
    }

}
