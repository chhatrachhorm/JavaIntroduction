package fileOperation.Output;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FIleOutputStreamDemo {
    public static void main(String args[]){
        String name;
        try {
//            If the file is not exist, then the new file will be created
            FileOutputStream fos = new FileOutputStream("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt");
            try (Scanner s = new Scanner(System.in)) {
                name = s.nextLine();
            }
            byte b[] = name.getBytes();
            fos.write(b);
            fos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
