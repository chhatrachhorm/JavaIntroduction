package fileOperation.input;

import java.io.*;

public class DataInputStreamDemo {
    public static void main(String args[]){
        byte b[] = new byte[10000];
        try {
//            (For Large Data)Either FileInputStream or BufferInputStream as long as it's the child of InputStream class (high level programming)
            DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream("basicConcepts/fileOperation/fIleStorage/fileDemo.txt")));
            dis.read(b);
            System.out.println(new String(b).trim());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
