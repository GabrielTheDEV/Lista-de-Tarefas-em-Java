package br.com.application.dao.service;

import io.github.cdimascio.dotenv.Dotenv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final Dotenv dotenv = Dotenv.load();

    private static final String URL = dotenv.get("DB_URL");
    private static final String USER = dotenv.get("DB_USER");
    private static final String PASSWORD = dotenv.get("DB_PASSWORD");

    public static Connection connect() {
        try{
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conectado ao banco de dados! ");
            return conn;
        }catch(SQLException e){
            System.out.println("FALHA NA CONEXÃO , ERROR : " + e.getMessage());
        }
        return null;
    }
}
