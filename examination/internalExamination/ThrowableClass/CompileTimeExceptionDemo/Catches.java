package internalExamination.throwableClass.compileTimeExceptionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Catches {
    public static void main(String args[]){
        File f = new File("D:\\Shared\\JAVAPROJECT\\JavaIntroduction\\BasicConcepts\\fileOperation\\fIleStorage\\fileDemo.txt");
        try {
            FileInputStream fis = new FileInputStream(f);
            byte b[] = new byte[1000];
            fis.read(b);
            String s = new String(b).trim();
            System.out.println(s);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
