package fileOperation.input;

import java.io.*;

public class BufferedInputStreamDemo {
    public static void main(String args[]){
        byte b[] = new byte[10000];
        try {
//            Interact with hard disk directly(low level programming)
            FileInputStream fis = new FileInputStream("basicConcepts/fileOperation/fIleStorage/fileDemo.txt");
//            Manipulate with buffer (high level programming)
            BufferedInputStream bis = new BufferedInputStream(fis);
            bis.read(b);
            String str = new String(b);
            System.out.println(str.trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
