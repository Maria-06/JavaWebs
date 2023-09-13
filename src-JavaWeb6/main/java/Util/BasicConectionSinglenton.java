package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//CONEXIÓN UTILIZADA PARA CONSULTAR UN SOLO USUARIO
public class BasicConectionSinglenton {
    private static String url = "jdbc:mysql://localhost:3306/lottus?serverTimezone=America/Bogota";
    //No se puede utilizar superUsuario
    private static String username = "root";
    private static String password = "";
    public static Connection conn;

    public static Connection getInstance()
           throws SQLException {
        if (conn == null){
            conn = DriverManager.getConnection(url, username, password);
        }
        return conn;
    }
}// UseBasicConnectionSingleton
