package main.java.com.ejcar.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private String url = "jdbc:mysql://localhost:3306/oficina";
    private String user = "root";
    private String password = "";

    private Connection conexao;

        public Connection getConexao() {

            try {
                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Conexão bem sucedida!");
                    return conexao;
            } catch (SQLException e) { 

                e.printStackTrace();
                System.out.println("Erro na conexão!");

            }
            return null; 
        }
}
