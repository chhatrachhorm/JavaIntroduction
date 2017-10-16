package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NaturalOrdering {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1 = new Students(100, "jk la");
		List<Students> student = new ArrayList<>();
		student.add(s1);
		student.add(new Students(123, "Hello Haha"));
		student.add(new Students(12, "Hello KK"));
		student.add(new Students(13, "Hello Derek"));
		student.add(new Students(223, "Hello World"));
		System.out.println(student);
		System.out.println(student.get(0).name);
		Collections.sort(student);
		System.out.println(student);
	}

}
