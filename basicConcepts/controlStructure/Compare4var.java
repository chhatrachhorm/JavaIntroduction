package controlStructure;
import java.util.Scanner;
public class Compare4var {
	public static void main(String[] args) {
		int a, b, c, d, e=0;
		try(Scanner s = new Scanner(System.in)){
			a = s.nextInt();
			b = s.nextInt();
			c = s.nextInt();
			d = s.nextInt();
		}
		e = (a>b)?((c>d)?((a>c)?a:c):((a>d)?a:d)):((c>d)?((b>c)?b:c):((b>d)?b:d));
		System.out.printf("The biggest among %d, %d, %d, %d is %d", a, b, c, d, e);
	}
}
/*
->First Logic: 
if(a>b&&a>c&&a>d)e = a;
else if(b>a&&b>c&&b>d)e = b;
else if(c>a&&c>b&&c>d)e=c;
else if(d>a&&d>b&&d>c)e = d;

->Second Logic:
e = (a>b)?
		((c>d)?
				((a>c)?a:c):((a>d)?a:d)
				)
		:
		((c>d)?
				((b>c)?b:c):((b>d)?b:d)
				);
				
->Third Logic:
if(a > b){
	if(c > d){
		if(a>c)e = a;
		else e = c;
	}
	else{
		if(a > d)e = a;
		else e = d;
	}
}else{
	if(c > d){
		if(b > c)e = b;
		else e = c;
	}else{
		if(b > d) e = b;
		else e = d;
	}
}
*/