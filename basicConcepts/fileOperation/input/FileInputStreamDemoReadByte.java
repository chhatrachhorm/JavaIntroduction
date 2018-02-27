package fileOperation.input;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemoReadByte {
    public static void main(String args[]) {
        String str;
        byte b[] = new byte[500];
        try {
            FileInputStream fis = new FileInputStream("basicConcepts/fileOperation/fIleStorage/fileDemo.txt");
            System.out.println("Other method with read(byte array)");
            fis.read(b);
            System.out.println(b);
            str = new String(b);
            System.out.println(str.trim());
//            use trim() to get only the value not the unwanted square box
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
