package Util;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/lottus?serverTimezone=America/Bogota";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    private static BasicDataSource pool;
    private static BasicDataSource getInstance() throws SQLException {
        if(pool == null){
            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.setUsername(USER);
            pool.setPassword(PASSWORD);

            pool.setInitialSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxIdle(8);
        }
        return pool;
    }//getConnectionToDatabase
    public static Connection getConnetion() throws  SQLException{
        return getInstance().getConnection();
    }
}