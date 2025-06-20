package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/todo_List_Java";
    private static final String root = "root";
    private static final String password = "toor1234";

    private static Connection conn;
    public static Connection connect(){
        try{
            if(conn == null){
                conn = DriverManager.getConnection(URL,root,password);
                System.out.println("CONEXÃO BEM SUCEDIDA!");
                return conn;
            }else{
                return conn;
            }
        }catch (SQLException err) {
            System.out.println("FALHA NA CONEXÃO, ERROR -> " + err.getMessage());
        }
        return conn;
    }
}
