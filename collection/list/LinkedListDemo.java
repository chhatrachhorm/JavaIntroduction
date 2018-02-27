package list;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer>  l = new LinkedList<>();
		for(int i = 0; i<100; i+=5){
			int k = i-3;
			l.add(k+i*i-3);
		}
		l.add(5, 5);
		l.add(7, 1);
		System.out.println("Before sorting: \n"+l);
		Collections.sort(l);
		System.out.println("After sorting: \n"+l);
	}

}
