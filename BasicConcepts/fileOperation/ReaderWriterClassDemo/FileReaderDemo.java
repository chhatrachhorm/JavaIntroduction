package fileOperation.ReaderWriterClassDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String args[]){
        char ch[] = new char[1000];
        try {
            FileReader fr = new FileReader("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt");
            fr.read(ch);
            System.out.println(ch);
            String str = new String(ch);
//            To trim
            System.out.println(str.trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
