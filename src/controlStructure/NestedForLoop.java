package controlStructure;
import java.util.Scanner;

public class NestedForLoop {

	public static void main(String[] args) {
		int i, j, num=0, total=0, k=0;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a number: ");
			num = s.nextInt();
		}
		System.out.println("Reverse: ");
		for(i=1; i<=num; i++){
			for(j=num; j>=1; j--)
				System.out.print(j+" ");
			System.out.println();
		}
		System.out.println("Number and Sum: ");
		for(i=1; i<=num; i++){
			for(j=1; j<=num; j++){
				System.out.print(i+" ");
				total += i;
			}
			System.out.print(" = "+total+"\n");
			total = 0;
		}
		System.out.println("Right Triangle Stars: ");
		for(i=0; i<num; i++){
			for(j=0; j<=i; j++)
				System.out.print("* ");
			System.out.println();
		}
		System.out.println("Right Triangle Number: ");
		for(i=1; i<=num; i++){
			for(j=1; j<=i; j++)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("Right Triangle Reverse Number: ");
		for(i=num; i>=1; i--){
			for(j=num; j>=i; j--)
				System.out.print(j);
			System.out.println();
		}
		System.out.println("Ordered Right Triangle Number: ");
		total = 0;
		for(i=1; i<=num; i++){
			for(j=1; j<=i; j++ )
				System.out.print(++total+" ");
			System.out.println();
		}
		System.out.println("Reverse Right Triangle Number: ");
		total = 0;
		for(i=1; i<=num; i++){
			for(j=1; j<=num; j++){
				if(j<=num-i)
					System.out.print(" ");
				else
					System.out.print(num-j+1);
			}
			System.out.println();
		}
	}

}
