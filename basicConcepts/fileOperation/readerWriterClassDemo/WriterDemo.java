package fileOperation.readerWriterClassDemo;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterDemo {
    public static void main(String args[]){
        try {
            FileWriter fw = new FileWriter("basicConcepts/fileOperation/fIleStorage/fileDemo.txt");
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
