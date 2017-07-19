package controlStructure;
import java.util.Scanner;

public class IfAndElseExample {
	int age;
	public static void main(String[] args) {
		IfAndElseExample test = new IfAndElseExample();
		/*
		 * We need a stream(flow of data) to get input
		 * */
		Scanner s = new Scanner(System.in);
		/*
		 * s object is created by using class(blueprint) Scanner
		 * System.in is used to get data from keyboard and s object is the wrapper(will handle)
		 * */
		System.out.println("Enter your age: ");
		test.age = s.nextInt();
		/*
		 * s.nextInt() is called and s.nextInt() will wait for the input
		 * after the input is given, it will return the int value to function call
		 * */
		if(test.age>=18)System.out.println("You can vote");
		else System.out.println("You are not an adult yet");
		
	}

}
