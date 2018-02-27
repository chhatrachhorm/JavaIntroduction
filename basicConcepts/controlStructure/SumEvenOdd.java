package controlStructure;
import java.util.Scanner;
public class SumEvenOdd {

	public void sum(int num){
		int total1=0, total2=0, i=0;
		while(i<=num/2){
			total1 += i*2+1;
			i++;
		}
		i=0;
		while(i<=num/2){
			total2 += i*2;
			i++;
		}
		System.out.println("The total for odd is "+ total1);
		System.out.println("The total for even is "+ total2);
	}
	public static void main(String[] args) {
		SumEvenOdd s = new SumEvenOdd();
		s.sum(new Scanner(System.in).nextInt());
		
	}
}
