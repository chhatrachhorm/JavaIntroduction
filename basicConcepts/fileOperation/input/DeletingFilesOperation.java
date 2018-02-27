package fileOperation.input;

import java.io.File;

public class DeletingFilesOperation {
    public static void main(String args[]){
        File dir = new File("basicConcepts/fileOperation/fIleStorage/listOfFiles");
        if(dir.exists()){
            File files[] = dir.listFiles();
            for (File f:files) {
                f.delete();
            }
            dir.delete();
        }

    }
}
