package Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PreserveWriteObj {
    /*
    * To preserve obj:
    *   1. Serialize the class of the object to preserve
    *   2. Use FileOutputStream to write the .bin or .ser
    *   3. Use ObjectOutputStream to get the path of .bin or .ser
    *   4. use .writeObject(); to pass obj to .bin or .ser
    * */
    public static void main(String[] args) {
        Fruit f1 = new Fruit(1, "Apple");
        /*
        * Byte file is a file with .bin extension
        * to preserve any obj, .bin or .ser should be used
        * */
        try {
            FileOutputStream fos = new FileOutputStream("BasicConcepts/fileOperation/FIleStorage/ObjPreserve.bin");
            ObjectOutputStream ois = new ObjectOutputStream(fos);
            ois.writeObject(f1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
