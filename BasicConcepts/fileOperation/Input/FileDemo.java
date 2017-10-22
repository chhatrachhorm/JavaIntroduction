package fileOperation.Input;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String args[]){
        File file = new File("BasicConcepts/fileOperation/FIleStorage/file.docx");
        if(file.exists()){
            System.out.println("The file is exist");
        }else{
            System.out.println("Press 1 to create a new file");
            int i = new Scanner(System.in).nextInt();
            if(i==1){
                try {
                    file.createNewFile();
                    System.out.println("File has been created");
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("Failed to create new file");
                }
            }
        }
    }

}
