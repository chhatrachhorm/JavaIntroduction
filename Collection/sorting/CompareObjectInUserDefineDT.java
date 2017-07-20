package sorting;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by chhormchhatra on 7/20/17.
 */
public class CompareObjectInUserDefineDT {
    public static void main(String[] args)
    {
        Students s1 = new Students(100,"John");
        Students s2 = new Students(200, "Jack");
        Students s3 = new Students(100, "John");
        Students s4 = new Students(450, "Chan");
        Set set = new HashSet<Students>();
        //native keyword: it means we write it in other language check internet for more info dude
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        if(s1.equals(s3))
            System.out.println("Equal!");
        else System.out.println("NOT EQUAL");
        System.out.println(set);

    }

 /*
  * 1st condition: with hashcode and equal
  * result Equal and address print once with the same value
  *
  * 2nd condition: with hashcode and comment equal
  * result Not Equal and address print 4 times with the same value
  *
  * 3rd condition: comment hashcode and with equal
  * result: equal and address print 4 times with different values
  *
  * 4th condition:comment both hashcode and equal
  * result: not equal and print 4 times with different values
  */

}
