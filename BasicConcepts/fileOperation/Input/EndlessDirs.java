package fileOperation.Input;


import java.io.File;
import java.util.Scanner;

public class EndlessDirs {
    public static void main(String args[]){
        char c = 'A';
        String s = "BasicConcepts/fileOperation/FIleStorage/EndlessDir/";
        for(int i = 0; i < 26 ; i++){
            s += c;
            s += "/";
            c++;
        }
        File dir = new File(s);
        if(dir.exists()){
            System.out.println("The directories exist!");
        }else{
            System.out.println("Directory does not exist\n Enter Y to create new folders, N to denial");
            if('Y' == new Scanner(System.in).next().charAt(0)){
                dir.mkdirs();
                System.out.println("Folder Created");
            }else System.out.println("You have entered No");
        }
    }
}
