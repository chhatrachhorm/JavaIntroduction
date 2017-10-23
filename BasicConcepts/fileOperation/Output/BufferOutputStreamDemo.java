package fileOperation.Output;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class BufferOutputStreamDemo {
    public static void main(String args[]){
        String name;
        try {
            FileOutputStream fos = new FileOutputStream("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            try(Scanner s = new Scanner(System.in)){
                name = s.nextLine();
            }
            bos.write(name.getBytes());
//            For output stream, do not forget to close the file
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
