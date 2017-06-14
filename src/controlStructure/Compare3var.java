package controlStructure;
import java.util.Scanner;
public class Compare3var {

	public static void main(String[] args) {
		int a, b, c, d=0;
		try(Scanner s = new Scanner(System.in)){
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
		}
		if(a>b){
			if(a>c) d = a;
			else d = c;
		}else if (b>c){
			if(b>c)d = b;
			else d = c;
		}
		System.out.printf("The biggest among %d, %d, %d is %d", a, b, c, d);
	}
}
/*
 * d = (a>b)?((a>c)?a:c)):((b>c)?b:c));
 * */
