package controlStructure;
import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		int num = 0;
		System.out.println("Enter a num: ");
		num = new Scanner(System.in).nextInt();
		for(int i=0; i<num; i++)
		{
			System.out.printf("%d ", i+1);
		}
		System.out.println();
		for(int i = 0; i<num; i++){
			System.out.printf("%d ", num-i);
		}
		System.out.println();
		for(int i = num; i>0; i--){
			System.out.printf("%d ", num-i+1);
		}
		System.out.println("\nEven Number: ");
		for(int i = 1; i<=num; i++){
			if(i%2==0)System.out.printf("%d ", i);
		}
		System.out.println("\nOdd Number: ");
		for(int i = 1; i<=num; i++){
			if(i%2!=0)System.out.printf("%d ", i);
		}
	}

}
