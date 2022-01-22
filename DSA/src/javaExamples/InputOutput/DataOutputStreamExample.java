package javaExamples.InputOutput;
import java.io.*;
public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
            FileOutputStream file = new FileOutputStream("D:\\testout2.txt");
            DataOutputStream data = new DataOutputStream(file);
            data.writeInt(89);
            data.flush();
            data.close();
            System.out.println("Succcess...");
        }
    }

