package fileOperation.Input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemoRead {
    public static void main(String args[]){
//        -1 represent the end of an array (also the beginning of an array) or end of file
        int ch;
        try {
            FileInputStream fis = new FileInputStream("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt");
                while((ch = fis.read())!=-1){
                    // .read() will return the int of ASCII value one by one
                    System.out.println((char)ch + " with ASCII = "+ch);
                }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
