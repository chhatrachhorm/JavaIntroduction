package controlStructure;
import java.util.Scanner;
public class Reverse {
	public static void main(String[] args){
		int num, test, rev=0;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a number to be reveresed");
			num = s.nextInt();
		}
		test = num;
		while(test!=0){
			rev = rev*10+(test%10);
			test /= 10;
		}
		System.out.printf("The reverse of %d is %d", num, rev);
		test = num; rev = 0;
		do{
			rev = rev*10+(test%10);
			test /= 10;
		}while(test!=0);
		System.out.printf("The reverse of %d is %d", num, rev);
	}
}
