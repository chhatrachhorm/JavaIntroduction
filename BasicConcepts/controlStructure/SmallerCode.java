package controlStructure;

import java.util.Scanner;

public class SmallerCode 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a character");
		char ch=new Scanner(System.in).next().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			ch+=32;
		}
		System.out.println("Letters before "+ch+ (ch-'a'));
		System.out.println("Letters after "+ch+ ('z'-ch));
	}
}
