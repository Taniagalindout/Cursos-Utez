package mx.edu.utez.CursosUTEZ.courses.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySQL {
    public static Connection getConnection() throws SQLException {
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
        return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/cursosutez?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root",
                "root"
        );
    }

    public static void main(String[] args) {
        try {
            System.out.println("Abriendo conexión");
            Connection con = ConnectionMySQL.getConnection();
            System.out.println("Conexión establecida");
            con.close();
            System.out.println("Cerrando conexión");
        }catch (Exception ex){
            System.out.println("Error de conexión");
            ex.printStackTrace();
        }
    }
}
