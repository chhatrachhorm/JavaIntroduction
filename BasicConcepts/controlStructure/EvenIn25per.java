package controlStructure;
import java.util.Scanner;
public class EvenIn25per {

	public static void main(String[] args) {
		int num, i=0, limit, total1=0, total2=0, total3=0;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a number: ");
			num = s.nextInt();
		}
		limit = (int)(num*0.25);
		while(i<num){
			if(i<=limit)
				total1 += (i%2!=0)?i:0;
			if(i>=num-limit)
				total2 += (i%2!=0)?i:0;
			if(i>limit && i<num-limit)
			{
				total3 += (i%2!=0)?i:0;
			}
			i++;
		}
		System.out.printf("The sum of even from the frist %d is %d\n", limit, total1);
		System.out.printf("The sum of even from the last %d is %d\n", limit, total2);
		System.out.printf("The sum of even from the 75percent is %d\n", total3);
	}

}
