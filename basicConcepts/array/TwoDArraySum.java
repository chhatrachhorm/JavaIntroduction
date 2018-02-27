package array;
import java.util.Scanner;
public class TwoDArraySum {

	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter the first elements: ");
			for(int i=0; i<3; i++)
				for(int j=0; j<3; j++)
					a[i][j]=s.nextInt();

			System.out.println("Enter the second elements: ");
			for(int i=0; i<3; i++)
				for(int j=0; j<3; j++)
					b[i][j]=s.nextInt();
		}
		for(int i=0; i<3; i++)
			for(int j=0; j<3; j++)
				c[i][j]=a[i][j]+b[i][j];

		System.out.println("The addition: ");
		for(int i=0; i<3; i++){
			for(int j=0; j<3; j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}

}
