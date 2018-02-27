package array;
import java.util.Scanner;
public class Combination {

	public static void com(int a[], int b[], int as, int bs){
		int c[]=new int[as + bs], i, j;
		for(i=0; i<as; i++)
			c[i]=a[i];
		for(j=0; j<bs; j++)
			c[i+j]=b[j];
		for(i=0; i<as+bs; i++)
			System.out.println(c[i]+" ");
	}
	public static void main(String[] args) {
		int as, bs, a[],b[];
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter number of element of array 1 and 2");
			as = s.nextInt();
			bs = s.nextInt();
			a = new int[as];
			b = new int[bs];
			System.out.println("Enter the elements for array 1: ");
			for(int i = 0; i < as; i++)
				a[i]=s.nextInt();
			System.out.println("Enter the elements for array 2: ");
			for(int i = 0; i < bs; i++)
				b[i]=s.nextInt();
		}
		com(a, b, as, bs);
	}
}
