package tienda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

    public static Connection getConnection() throws SQLException {
        String URL = "jdbc:mysql://localhost:3306/Tienda_Ropa";
        String USUARIO = "root";
        String CONTRASENA = "MySQL24-25";
        return DriverManager.getConnection(URL, USUARIO, CONTRASENA);
    }

    public static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada correctamente.");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}