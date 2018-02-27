package modelExamination;

import java.io.*;

public class FileDemo {
    public static void main(String args[]){
        File f = new File("path");
        try {
            DataInputStream dis = new DataInputStream(
                    new BufferedInputStream(
                            new FileInputStream(f)
                    )
            );
            byte b[] = new byte[1024];

            dis.read(b);
            System.out.println(new String(b).trim());
            dis.close();
            DataOutputStream dos = new DataOutputStream(
                    new BufferedOutputStream(
                            new FileOutputStream(f)
                    )
            );
            dos.write("string".getBytes());
            BufferedReader fr = new BufferedReader(new FileReader(f));
            int asccii;
            while((asccii = fr.read()) != -1){
                System.out.println(asccii);
            }
            BufferedWriter bf = new BufferedWriter(new FileWriter(f));
            bf.write("String".toCharArray());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
