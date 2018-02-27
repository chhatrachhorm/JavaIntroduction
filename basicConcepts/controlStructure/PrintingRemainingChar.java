package controlStructure;
import java.util.Scanner;
public class PrintingRemainingChar {

	public static void main(String[] args) {
		char ch;
		int before, after;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter a character: ");
			ch = s.next(".").charAt(0);
		}
		if(ch>='A'&&ch<='Z'){
			after = 'Z'-ch;
			before = ch - 'A';
			System.out.println("There are "+after+" after "+ch);
			System.out.println("There are "+before+" before "+ch);
			if(ch!='Z'){
				while(ch<'Z'){
					System.out.print(++ch+" ");
				}
			}
		}else if(ch>='a'&&ch<='z'){
			after = 'z'-ch;
			before = ch - 'a';
			System.out.println("There are "+after+" after "+ch);
			System.out.println("There are "+before+" before "+ch);
			if(ch!='z'){
				while(ch<'z'){
					System.out.print(++ch + " ");
					after++;
				}
			}
			
		}

	}

}
/*
 * 		if(ch>='A'&&ch<='Z'){
			do{
				ch = (char)((int)ch+1);
				System.out.print(ch+" ");
			}while((int)ch<90);
		}else if(ch>='a'&&ch<='z'){
			do{
				ch = (char)((int)ch+1);
				System.out.print(ch+" ");
			}while((int)ch<122);
		}*/
