package fileOperation.readerWriterClassDemo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BufferReaderDemo {
    public static void main(String args[]){
        char c[] = new char[10000];
        try {
            BufferedReader br = new BufferedReader(
                    new FileReader("basicConcepts/fileOperation/fIleStorage/fileDemo.txt"));
//            To read as ASCII one by ONE
            int ascii;
            while((ascii = br.read())!=-1){
                System.out.println((char)ascii + " " + ascii);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
