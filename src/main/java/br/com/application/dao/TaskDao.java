package br.com.application.dao;

import br.com.application.dao.service.DatabaseConnection;
import br.com.application.entity.model.Task;

import java.sql.Connection;
import java.sql.PreparedStatement;
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
            System.out.println("*ERRO* :" + e.getMessage());
        } catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }

    public void getTask(){
        String command = "SELECT * FROM tasks";
        try(Connection conn = DatabaseConnection.connect()) {
            System.out.println("funcionando");
        }catch (SQLException e){
            System.out.println("*ERROR* :" + e.getMessage());
        }
    }
    public void changeTask(){
        String command = "ALTER TABLE ";
    }

    public void removeTask(Task task){
        String command = "DELETE FROM tasks WHERE = " + task.getId();

        try(Connection conn = DatabaseConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(command)) {
            pstmt.setInt(1, task.getId());
            int rowsAffected = pstmt.executeUpdate();

            if(rowsAffected > 0){
                System.out.println("TAREFA APAGADA");
            } else {
                System.out.println("Nenhuma tarefa encontrada com esse ID");
            }
        }catch (SQLException e){
            System.out.println("*ERROR* :" + e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
