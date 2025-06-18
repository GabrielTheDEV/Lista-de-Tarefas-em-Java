package service;

import model.Task;
import java.util.ArrayList;
import java.util.List;

public class TaskService {
    private List<Task> task = new ArrayList<>();

    public void addTask(String description) {
        task.add(new Task(description));
    }
    public void getListTask() {
        if(task.isEmpty()){
            System.out.println("Nenhuma tarefa adicionada...");
        }
        for(int i = 0; i < task.size(); i++){
            System.out.println(i + ". " + task.get(i));
        }
    }
    public void changeDescription(int index , String newDesc) {
      //...
    }
    public void doneTask() {
        //...
    }
    public void deleteTask() {
        //...
    }
}
