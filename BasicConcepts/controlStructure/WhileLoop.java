package controlStructure;
import java.util.Scanner;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i=0, input;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a value: ");
			num = s.nextInt();
			System.out.print("Enter 0 or 1 to print even or odd: ");
			input = s.nextInt();
		}
		while(i<=num/2){
			if(input == 1){
				System.out.print(" "+(2*i+1));
			}else if(input == 0)System.out.print(" "+2*i);
			i++;
		}
		
	}

}
