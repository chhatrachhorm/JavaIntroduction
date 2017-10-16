package array;

import java.util.Scanner;

public class BubleSort {

	public static void bubleSort(int a[], int n){
		for(int i=0; i<n; i++){
			for(int j=0; j<n-1-i; j++){
				if(a[j]>a[j+1]){
					int temp = a[j+1];
					a[j+1]= a[j];
					a[j]=temp;
				}
			}
		}
		for(int i = 0; i<n; i++){
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		int a[], n;
		try(Scanner s = new Scanner(System.in)){
			System.out.println("Enter number of element");
			n = s.nextInt();
			a = new int[n];
			System.out.println("Enter the element: ");
			for(int i = 0; i<n; i++)
				a[i]=s.nextInt();
		}
		bubleSort(a, n);
	}

}
