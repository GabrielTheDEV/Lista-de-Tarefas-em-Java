package br.com.listadetarefas.dao.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/x";
    private static final String USER = "root";
    private static final String PASSWORD = "toor123";

    public static Connection connect() {
        try(Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);){
            System.out.println("Conectado ao banco de dados! ");
            return conn;
        }catch(SQLException e){
            System.out.println("FALHA NA CONEXÃO , ERROR : " + e.getMessage());
        }
        return null;
    }
}
