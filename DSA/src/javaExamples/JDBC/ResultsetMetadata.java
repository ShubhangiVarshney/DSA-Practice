package javaExamples.JDBC;
import java.sql.*;

public class ResultsetMetadata {
    public static void main(String args[]){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/gaandu","root","Shubhangi@0502");

            PreparedStatement ps=con.prepareStatement("select * from employee");
            ResultSet rs=ps.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();

            System.out.println("Total columns: "+rsmd.getColumnCount());
            System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));
            System.out.println("Column Type Name of 3st column: "+rsmd.getColumnTypeName(3));
            System.out.println("Table name: "+rsmd.getTableName(3));

            con.close();
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}

