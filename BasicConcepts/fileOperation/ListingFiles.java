package fileOperation;

import java.io.File;
import java.io.IOException;

public class ListingFiles {
    public static void main(String args[]){
        File folder = new File("BasicConcepts/fileOperation/FIleStorage/ListOfFiles");
        if(folder.exists()){
            File files[] =  folder.listFiles();
            for(int i = 0; i<files.length; i++){
                System.out.println(files[i]);
            }

        }else{
            File dir = new File("BasicConcepts/fileOperation/FIleStorage/ListOfFiles");
            if(!dir.exists())
                dir.mkdir();
            String fs[]={
                    "BasicConcepts/fileOperation/FIleStorage/ListOfFiles/Hello.html",
                    "BasicConcepts/fileOperation/FIleStorage/ListOfFiles/JavaScript.js",
                    "BasicConcepts/fileOperation/FIleStorage/ListOfFiles/package-info.java",
                    "BasicConcepts/fileOperation/FIleStorage/ListOfFiles/package.yaml"
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
