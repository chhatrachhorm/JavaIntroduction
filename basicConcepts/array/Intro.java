package array;
import java.util.Scanner;
public class Intro {
	public static void main(String[] arg){
		int []a=new int[5];
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the element");
			for(int i=0; i<a.length; i++)
				a[i]=s.nextInt();	
		}
		System.out.println("You have entered: ");
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
	}
}
