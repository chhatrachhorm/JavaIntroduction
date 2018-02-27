package exception;

import java.util.Scanner;

public class RuntimeException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a, b: ");
			a = s.nextInt();
			b = s.nextInt();
		}
		try{
			c = a/b;
			System.out.println("Answer = "+c);
		}catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		

	}

}
