package javaExamples.InputOutput;
import java.io.*;

public class FilterOutputStreamExample  {
    public static void main(String[] args) throws IOException{
     File data = new File("D:\\testout3.txt");
     FileOutputStream file = new FileOutputStream(data);
    FilterOutputStream filter = new FilterOutputStream(file);
    String s="Learning JAVA by Shubhangi";
    byte b[]=s.getBytes();
        filter.write(b);
        filter.flush();
        filter.close();
        file.close();
        System.out.println("Success...");
}
}
