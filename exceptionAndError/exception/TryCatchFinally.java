package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
 * Compile Time Exception
 * */
public class TryCatchFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte b[]= new byte[1000];
		FileInputStream fis;
		try{
			fis = new FileInputStream("D:\\html.html");
			System.out.println(" Success");
			fis.read(b);
			String s = new String(b);
			System.out.println(s);
		}catch(FileNotFoundException e){
			String cName = e.getClass().toString();
			System.out.println(cName);
			System.out.println("Exception occured "+ e.getMessage());
		}catch(IOException ioe){
			System.out.println("Cannot Read from the file");
		}

	}

}
