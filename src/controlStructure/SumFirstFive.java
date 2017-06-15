package controlStructure;
import java.util.Scanner;
public class SumFirstFive {

	public static void main(String[] args) {
		int num, i=0, total=0, limit;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a num: ");
			num = s.nextInt();
			System.out.println("Enter the limit number: ");
			limit = s.nextInt();
		}
		while(i<=num/2){
			total += i*2 +1;
			i++;
			if(i==limit){break;}
		}
		System.out.printf("The sum of first %d odd number is %d", limit, total);
	}
}
/*		while(i<num){
			if(cnt<5){
				if(i%2!=0){
					sum+=i;
					cnt++;
				}
			}
			i++;
		} 
 */