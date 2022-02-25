package javaExamples.JDBC;
import java.sql.*;

public class InsertPrepare {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gaandu", "root","Shubhangi@0502");
        PreparedStatement stmt1=con.prepareStatement("insert into employee values(?,?,?)" );
        stmt1.setInt(1,105);
        stmt1.setString(2,"Yash Sachdeva");
        stmt1.setInt(3,29);
        stmt1.executeUpdate();
        ResultSet rs=stmt1.executeQuery("select * from employee");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
        con.close();


    }
}
