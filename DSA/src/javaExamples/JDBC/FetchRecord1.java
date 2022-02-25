package javaExamples.JDBC;

import java.sql.*;


public class FetchRecord1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gaandu", "root", "Shubhangi@0502");
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery("select * from employee");
            rs.absolute(4);
            System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
            conn.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
