package apresentacao.acesso_a_dado;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoDB {
    private static final String URL = "jdbc:postgresql://localhost:5432/banco";
    private static final String USER = "usuario";
    private static final String PASSWORD = "senha";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("Erro na conexão: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
