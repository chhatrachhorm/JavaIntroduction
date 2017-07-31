package fileOperation.ReaderWriterClassDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BufferReaderDemo {
    public static void main(String args[]){
        char c[] = new char[10000];
        try {
            BufferedReader br = new BufferedReader(new FileReader("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt"));
//            To read as ASCII one by ONE
            int ascii;
            while((ascii = br.read())!=-1){
                System.out.println((char)ascii + " " + ascii);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
