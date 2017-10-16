package controlStructure;
import java.util.Scanner;
public class Sum25perOdd {
/*
 * BODMAS
 * */
	public static void main(String[] args) {
		int num, i=0, total=0, limit;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a num: ");
			num = s.nextInt();
		}
		limit = (int)(num*0.25f);
		System.out.println(limit);
		while(i<=num/2){
			total+=i*2+1;
			i++; 
			if(i==limit)break;
		}
		System.out.printf("The sum of the first %d even is %d\n", limit, total);
	}
}

