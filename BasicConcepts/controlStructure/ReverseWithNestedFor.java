package controlStructure;
import java.util.Scanner;
public class ReverseWithNestedFor {

	public static void main(String[] args) {
		int i, j, num;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a number: ");
			num = s.nextInt();
		}
		for(i=1; i<=num; i++){
			for(j=num; j>=1; j--)
				System.out.print(j+" ");
			System.out.println();
		}

	}

}
