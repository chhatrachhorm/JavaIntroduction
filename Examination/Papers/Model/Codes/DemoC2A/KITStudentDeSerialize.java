package Papers.Model.Codes.DemoC2A;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class KITStudentDeSerialize {
    public static void main(String args[]){
        try{
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("Examination/Papers/Model/Codes/StudentObj.bin"));
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student s = (Student)ois.readObject();
            System.out.println(s.toString());
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
