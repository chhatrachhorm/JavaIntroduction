package fileOperation.readerWriterClassDemo;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String args[]){
        char ch[] = new char[1000];
        try {
            File f =
                    new File("basicConcepts/fileOperation/fIleStorage/fileDemo.txt");
            FileReader fr = new FileReader(f);
            fr.read(ch);
            System.out.println(ch);
            String str = new String(ch);
//            To trim
            System.out.println(str.trim());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
