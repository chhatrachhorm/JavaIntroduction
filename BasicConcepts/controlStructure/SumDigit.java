package controlStructure;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		int num, test, sum=0;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a number to be reversed");
			num = s.nextInt();
		}
		test = num;
		while(test!=0){
			sum += test % 10;
			System.out.printf("%d + ", test%10);
			test /= 10;
		}
		System.out.printf("\b\b = %d", sum);
	}

}
