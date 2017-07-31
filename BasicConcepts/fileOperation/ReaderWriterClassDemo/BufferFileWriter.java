package fileOperation.ReaderWriterClassDemo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferFileWriter {
    public static void main(String args[]){
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("BasicConcepts/fileOperation/FIleStorage/fileDemo.txt"));
            try(Scanner s = new Scanner(System.in)){
                bw.write(s.nextLine().toCharArray());
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
