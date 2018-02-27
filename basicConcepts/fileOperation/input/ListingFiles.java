package fileOperation.input;

import java.io.File;
import java.io.IOException;

public class ListingFiles {
    public static void main(String args[]){
        File folder = new File("basicConcepts/fileOperation/fIleStorage/listOfFiles");
        if(folder.exists()){
            File files[] =  folder.listFiles();
            for(int i = 0; i<files.length; i++){
                System.out.println(files[i]);
            }

        }else{
            File dir = new File("basicConcepts/fileOperation/fIleStorage/listOfFiles");
            if(!dir.exists())
                dir.mkdir();
            String fs[]={
                    "basicConcepts/fileOperation/fIleStorage/listOfFiles/Hello.html",
                    "basicConcepts/fileOperation/fIleStorage/listOfFiles/JavaScript.js",
                    "basicConcepts/fileOperation/fIleStorage/listOfFiles/package-info.java",
                    "basicConcepts/fileOperation/fIleStorage/listOfFiles/package.yaml"
            };
            for(int i = 0; i < fs.length; i++){
                File file = new File(fs[i]);
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
