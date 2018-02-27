package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadPreserveObj {
    /*
    * To read preserved obj
    *   1. Use ObjectInputStream to get the .bin or .ser along with FileInputStream
    *   2. Typecast the preserve obj with the original class (make new obj to store)
    * */
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("BasicConcepts/fileOperation/fIleStorage/ObjPreserve.bin"));
            Fruit f = (Fruit)ois.readObject();
            System.out.println(f);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
