package fileOperation;

import java.io.*;

public class ReadAndWrite {
    public static void main(String args[]){
        byte b[] = new byte[1000];
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("basicConcepts/fileOperation/fIleStorage/fileDemo.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fileOperation/fIleStorage/listOfFiles/Hello.html"));
            bis.read(b);
            bos.write(b);
            bis.close();
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
