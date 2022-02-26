package javaExamples.JDBC;
import java.sql.*;
import javax.sql.RowSetEvent;
import javax.sql.RowSetListener;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;

public class RowSetExample {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");

        JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
        rowSet.setUrl("jdbc:mysql://localhost:3306/gaandu");
        rowSet.setUsername("root");
        rowSet.setPassword("Shubhangi@0502");
        rowSet.setCommand("select * from employee");
        rowSet.execute();
        rowSet.addRowSetListener(new MyListener());
        while (rowSet.next()) {
            // Generating cursor Moved event
            System.out.println("Id: " + rowSet.getString(1));
            System.out.println("Name: " + rowSet.getString(2));
            System.out.println("Age: " + rowSet.getString(3));
        }
    }
}
    class MyListener implements RowSetListener {
        public void cursorMoved(RowSetEvent event) {
            System.out.println("Cursor Moved...");
        }
        public void rowChanged(RowSetEvent event) {
            System.out.println("Cursor Changed...");
        }
        public void rowSetChanged(RowSetEvent event) {
            System.out.println("RowSet changed...");
        }
    }
