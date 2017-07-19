package array;
import java.util.Scanner;
public class LinearSearch {

	public static int linearSearch(int a[], int ele, int size){
		int pos = -1;
		for(int i=0; i<size; i++){
			if(a[i]==ele){
				pos = i;
				return pos;
			}
		}
		return pos;
	}
	public static void main(String[] args) {
		int a[], ele, pos, n;
		/*
		 * if []a then the other variables have to be an array type
		 * */
		try(Scanner scan = new Scanner(System.in)){
			System.out.println("Please Enter numbers of the elements: ");
			n = scan.nextInt();
			a = new int[n];
			System.out.println("Please Enter the elements: ");
			for(int i=0; i<a.length; i++)
				a[i]=scan.nextInt();
			System.out.println("Enter the Elements you want to search: ");
			ele = scan.nextInt();
		}
		pos = linearSearch(a, ele, n);
		if(pos==-1)System.out.println("The element you want to find is not found");
		else System.out.println("The element is at "+ ++pos +" position");
	}

}
