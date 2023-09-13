package Util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class ConnectionPool {
    private static String url = "jdbc:mysql://localhost:3306/lottus?serverTimezone=America/Bogota";
    //No se puede utilizar superUsuario
    private static String username = "root";
    private static String password = "";
    public static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException{
        if(pool ==null){
            pool = new BasicDataSource();
            pool.setUrl(url);
            pool.setUsername(username);
            pool.setPassword(password);

            pool.setInitialSize(5);
            pool.setMinIdle(5);
            pool.setMaxIdle(10);
            pool.setMaxIdle(10);
        }
        return pool;
    }

    public static Connection getConnection()
            throws  SQLException{
        return getInstance().getConnection();
    }
}
