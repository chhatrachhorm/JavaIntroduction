package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingExistingDT {
	public static void main(String[] a){
		List<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(10);
		list.add(200);
		list.add(123);
		list.add(12);
		Collections.sort(list);
		System.out.println(list);
//		List<Students> s = new ArrayList<Students>();
		Students s1 = new Students(12, "Derek");
		Students s2 = new Students(13, "Hello");
		System.out.println(s1);
		System.out.println(s2);
	}

}
