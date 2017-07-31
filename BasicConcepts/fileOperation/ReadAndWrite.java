package fileOperation;

import java.io.*;

public class ReadAndWrite {
    public static void main(String args[]){
        byte b[] = new byte[1000];
        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("fileOperation/FIleStorage/ListOfFiles/Hello.html"));
            bis.read(b);
            bos.write(b);
            bis.close();
            bos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
