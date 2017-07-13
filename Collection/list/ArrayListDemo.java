package list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		A bad way to make array list: 
		ArrayList arr = new ArrayList();
		for(int i = 1; i<100; i = i+10){
			arr.add(i);
		}
		arr.add(1);
		arr.add('A');
		arr.add(1.8f);
		arr.add(true);
		arr.add(5, false);
		System.out.println(arr);
		*/
		//To restrict DataType
		ArrayList <String> a = new ArrayList<>();
		String c="";
		a.add("Hello");
		a.add("World");
		a.add(1, "Chhatra");
		//a will never accept other DataType apart from string
		System.out.println("Before sorting: \n"+a);
		Collections.sort(a);
		System.out.println("After sorting: \n"+a);
		System.out.println(a.get(1)+" "+a.get(2));
		for(String s:a){
			System.out.println(s);
			c += s + "... ";
			System.out.println(c);
		}
		System.out.println("Finally: "+c);
		
		
	}

}
