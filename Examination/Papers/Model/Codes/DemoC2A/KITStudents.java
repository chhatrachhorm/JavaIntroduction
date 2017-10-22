package Papers.Model.Codes.DemoC2A;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class KITStudents {
    public static void main(String args[]){
        Student s = new Student(1, "Chhatra Chhorm");
        try{
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Examination/Papers/Model/Codes/StudentObj.bin"));
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(s);
            oos.close();
            bos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
