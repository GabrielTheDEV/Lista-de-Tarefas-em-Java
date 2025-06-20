package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TaskDao {

    Connection conn = null;


    public void addTask(String description){
        String sql = "INSERT INTO task (task , completed) VALUES (? ,?)";
        try{
            conn = DatabaseConnection.connect();
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(2,description);
            ps.setString(3,"false");
            ps.executeUpdate();
            System.out.println("Tarefa criada!");

        }catch(SQLException err){
            System.out.println(err.getMessage());
        }
    }
    public void removeTask(String id){
        String sql = "DELETE FROM tasks WHERE id=?";
        try{
            conn = DatabaseConnection.connect();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, id);
            ps.executeUpdate();
            System.out.println("Tarefa Deletada...");
        }catch (SQLException err){
           System.out.println(err);
        }
    }
}
