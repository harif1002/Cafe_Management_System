package Cafe_Management_System;
import java.sql.*;

public class DBconnection {
    public static Connection getConnection() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/Cafe_Management_System",
              "root","123");
            return con;
        }
        catch(Exception ex){
            System.out.println("DBconnection.getConnection() Error-->"+ ex.getMessage());
            return null;
        
        }
        
    }
    public static void close(Connection con) {
        try{
            con.close();
        }
        catch(Exception ex){
            
        }
        
    }
}
