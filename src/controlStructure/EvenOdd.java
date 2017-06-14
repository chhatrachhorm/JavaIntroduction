package controlStructure;
import java.util.Scanner;
public class EvenOdd {
	public void avg(int num){
		int total=0;
		int m = (num%2==0)?(num/2):(num/2+1);
		for(int i=1; i<=num; i++)
			total += ((i%2!=0)?i:0);
		System.out.println("The average for odd is "+ total/m);
		System.out.println("The average for even is "+ ((m==num/2)?(total/m+1):(total/m)));
	}
	public static void main(String[] args) {
		EvenOdd eo = new EvenOdd();
		eo.avg(new Scanner(System.in).nextInt());
	}
}