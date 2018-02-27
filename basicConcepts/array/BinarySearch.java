package array;
import java.util.Scanner;
public class BinarySearch {

	public static int binarySearch(int a[], int ele, int size){
		int pos = -1, beg=0, mid, last =size-1;
		while(beg <= last){
			mid = (beg+last)/2;
			if(ele == a[mid]){
				return mid;
			}else if(ele>a[mid]){
				beg = mid + 1;
			}else last = mid -1;
		}
		return pos;
	}
	public static void main(String[] args) {
		int a[], ele, pos, n, temp;
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
		for(int i=0; i<n; i++){
			for(int j=0; j<n-1; j++){
				if(a[j]>a[j+1]){
					temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0; i<n; i++)System.out.println(a[i]);
		pos = binarySearch(a, ele, n);
		System.out.println(pos);
		if(pos==-1)System.out.println("The element you want to find is not found");
		else System.out.println("The element is at "+ ++pos +" position");
	}

}
