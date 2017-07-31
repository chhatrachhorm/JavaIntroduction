package fileOperation.ReaderWriterClassDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {
    public static void main(String args[]){
        try {
            FileWriter fw = new FileWriter("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt");
            System.out.println("Enter something");
            try(Scanner s = new Scanner(System.in)){
                fw.write(s.nextLine().toCharArray());
            }
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
