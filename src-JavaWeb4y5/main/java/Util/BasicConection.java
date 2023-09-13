package Util;

import java.sql.*;
public class BasicConection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/lottus?serverTimezone=America/Bogota";
        //crear un usuario de la db
            String username = "Maria";
            String password = "@Maria2687351";

            //crear objeto de consulta
            String sql = null;
            //crear objeto de conexion
            Connection  conn = null;
           //crear la consulta preparada
            Statement stm = null;
            //obtener resultaado de la consulta
            ResultSet rs = null;
           try{
                sql="SELECT * FROM lottus.users_tbl";
                conn = DriverManager.getConnection(url,username,password);
                stm = conn.createStatement();
                //executeUpdate
                rs = stm.executeQuery(sql);

                while (rs.next()){
                    System.out.println(rs.getString("user_firstname"));
                    System.out.println(" | ");
                    System.out.println(rs.getString("user_lastname"));
                }
            } catch (SQLException e) {
                //Trazabilidad-imprimir conexion
               e.printStackTrace();
            } finally {
                try {
                    //cerrar conexion
                    rs.close();
                    stm.close();
                    conn.close();
                }catch (SQLException e){
                    throw new RuntimeException(e);
                }
            }//end try-catch

    }//main
} //BasicConnection
