package set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	public static void main(String[] a){
		Set<Integer> s = new HashSet<Integer>();
		s.add(1);
		s.add(125);
		s.add(2);
		s.add(13);
		s.add(45);
		/*
		 * Mixed Value
		 * */
		System.out.println("HashSet: " + s);
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		s1.add(1);
		s1.add(125);
		s1.add(2);
		s1.add(13);
		s1.add(45);
		/*
		 * User's order will be maintained
		 * */
		System.out.println("LinkedHashSet: " +s1);
		Set<Integer> s2 = new TreeSet<Integer>();
		s2.add(1);
		s2.add(125);
		s2.add(2);
		s2.add(13);
		s2.add(45);
		/*
		 * Elements will be sorted based on ASEC (ascending order) or predefined sort
		 * */
		System.out.println("TreeSet: " + s2);
	}
}
