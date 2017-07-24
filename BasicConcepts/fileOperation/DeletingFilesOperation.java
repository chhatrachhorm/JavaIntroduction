package fileOperation;

import java.io.File;

public class DeletingFilesOperation {
    public static void main(String args[]){
        File dir = new File("BasicConcepts/fileOperation/FIleStorage/ListOfFiles");
        if(dir.exists()){
            File files[] = dir.listFiles();
            for (File f:files) {
                f.delete();
            }
            dir.delete();
        }

    }
}
