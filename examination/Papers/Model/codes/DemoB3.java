package Papers.Model.codes;

import java.io.FileInputStream;
import java.io.IOException;


public class DemoB3 {
    public static void main(String args[]){
        try{
            FileInputStream fis = new FileInputStream("Examination/Papers/model/codes/mytitle.txt");
            byte b[] = new byte[1024];
            int total = 0;
            fis.read(b);
            char[] arr = new String(b).trim().replace("\n", "").replace("\r", "").toCharArray();
            System.out.println("length of array " + arr.length);
            for(char c: arr){
//                if(!(((int)'A' <= (int)c && (int)c <= (int)'Z') || ((int)'a' <= (int) c && (int)c <= (int)'z') || ((int)'0' <= (int)c && (int)c <= (int)'9'))){
//                    System.out.println(c);
//                    total++;
//                }
                if(!(('A' <= c && c <= 'Z') || ('a' <= c && c <= 'z') || ('0' <= c && c <= '9'))){
                    System.out.println(c);
                    total++;
                }
            }
            System.out.println("Number of Special Character: " + total);
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
