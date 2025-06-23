package br.com.application.dao;

import br.com.application.dao.service.DatabaseConnection;
import br.com.application.entity.model.Task;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TaskDao {

    public TaskDao(){
    }

    public void addTask(Task task){
        String command = "INSERT INTO tasks(descrip) VALUES ('"+ task.getDescription() +"')";

        try(Connection conn = DatabaseConnection.connect()) {
            try( Statement stmt = conn.createStatement()){
                stmt.executeUpdate(command);
                System.out.println("TAREFA CRIADA :>");
            }
            System.out.println(" ");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void getTask(){}
    public void changeTask(){}
    public void removeTask(){}
}
