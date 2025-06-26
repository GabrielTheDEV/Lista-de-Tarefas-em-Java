package br.com.application.dao;

import br.com.application.dao.service.DatabaseConnection;
import br.com.application.entity.model.Task;

import java.sql.*;

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

        try(Connection conn = DatabaseConnection.connect();
            PreparedStatement pstmt = conn.prepareStatement(command)) {

            ResultSet result = pstmt.executeQuery();
            while(result.next()){
                int id = result.getInt("id");
                String descrip = result.getString("descrip");
                Task t = new Task(id, descrip);
                System.out.println(t.toString());
            }

        }catch (SQLException e){
            System.out.println("*ERROR* :" + e.getMessage());
        }
    }
    public void changeTask(int id, String newValue){
        String command = "UPDATE tasks SET descrip = '" + newValue +"' WHERE id =" + id;

        try(Connection conn = DatabaseConnection.connect()) {
            try( Statement stmt = conn.createStatement()){
                stmt.executeUpdate(command);
                System.out.println("Tarefa alterada");
            }
        }catch(SQLException err){
            System.out.println("*ERROR* : " + err.getMessage());
        }
    }

    public void removeTask(int id){
        String command = "DELETE FROM tasks WHERE id = " + id;

        try(Connection conn = DatabaseConnection.connect()){
            try(Statement stmt = conn.createStatement()) {
                stmt.executeUpdate(command);
            }
        }catch (SQLException e){
            System.out.println("*ERROR* :" + e.getMessage());
        }catch (NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
}
