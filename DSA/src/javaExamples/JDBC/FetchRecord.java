package javaExamples.JDBC;

import java.sql.*;

public class FetchRecord {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gaandu", "root", "Shubhangi@0502");
            Statement stmt= conn.createStatement();
            int result=stmt.executeUpdate("Update employee set Employee_name='Raghav Bhalla',age='30' where id=103");
            System.out.println(result);
            ResultSet rs=stmt.executeQuery("select * from employee");
            while(rs.next())
                System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            conn.close();

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
    }

