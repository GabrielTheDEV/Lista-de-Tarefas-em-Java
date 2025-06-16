package entity;

public abstract class Task {
    private boolean completed;
    private String task;
    private TaskStatusEnum status;

    public Task(){
    }
    abstract void getTask();
    abstract void setTask();
    public void setStatus(TaskStatusEnum status) {
        this.status = status;
    }

}
