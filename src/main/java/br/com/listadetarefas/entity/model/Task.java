package br.com.listadetarefas.entity.model;

public class Task {
    private int id;
    private String description;
    private boolean isCompleted;

    public Task() {}

    public Task(String description , boolean isCompleted) {
        this.description = description;
        this.isCompleted = isCompleted;
    }
    public Task(int id, String description , boolean isCompleted) {
        this.id = id;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    //Getter e Setter

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String desc){
        this.description = desc;
    }
    public boolean getIsCompleted(){
        return isCompleted;
    }
    public void setIsCompleted(boolean completed){
        this.isCompleted = completed;
    }
}
