package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public static void openFile(String path) throws FileNotFoundException{
		/*
		 * throws will throw back the exception to the function call
		 * function call has to handle the exception with try catch and/or with finally
		 * */
		FileInputStream fis = new FileInputStream(path);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			openFile("D:\\html.html");
		}catch(FileNotFoundException e){
			System.out.println("Exception occured: "+e);
		}
//		openFile("D:\\html.html");
	}


}
