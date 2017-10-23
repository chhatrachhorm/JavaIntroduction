package fileOperation.Output;

import java.io.*;
import java.util.Scanner;

public class DataOutputStreamDemo {
    public static void main(String args[]){
        String name;
        try {
            DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt")));
            try(Scanner s = new Scanner(System.in)){
                name = s.nextLine();
            }
            dos.write(name.getBytes());
            dos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
