package InternalExamination.ThrowableClass.ThrowingExceptions;

import java.io.FileInputStream;
import java.io.IOException;

public class ThrowDemo {
    public static byte[] readFile(String path) throws IOException{
        FileInputStream fis = new FileInputStream(path);
        byte[] b = new byte[1024];
        fis.read(b);
        return b;
    }

    public static void main(String[] args) {
        try {
            byte[] b = readFile("D:\\Shared\\JAVAPROJECT\\JavaIntroduction\\BasicConcepts\\fileOperation\\FIleStorage\\fileDemo.txt");
            String s = new String(b);
            System.out.println(s.trim());
        }catch (IOException e){
            System.out.println("Opps! File not found");
            e.printStackTrace();
        }
    }
}
