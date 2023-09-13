package sena.edu.co.JavaRepository.Util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseConnectionPool {
    private  static Connection getConnection() throws SQLException{
        return DBConnection.getConnetion();
    }

    public static void main(String[] args) throws SQLException{
        try(Connection conn = getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM lottus .users_tbl")){

            while(rs.next()){
                System.out.println(rs.getString("user_firstname"));
                System.out.println(" | ");
                System.out.println(rs.getString("user_lastname"));
            }
        }
    }
}
