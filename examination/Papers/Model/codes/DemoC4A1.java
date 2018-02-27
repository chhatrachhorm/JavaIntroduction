package Papers.Model.codes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class DemoC4A1 {
    public static void main(String args[]){
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();
        long startA, endA, startB, endB;

        startA = System.nanoTime();
        for(int i = 0; i < 1000; i++)
            arrayList.add(i);
        for(int i = 0; i < 100; i++)
            arrayList.remove(i+ new Random().nextInt(50));
        endA = System.nanoTime();
        System.out.println("To manipulate item for ArrayList " + (endA-startA));

        startB = System.nanoTime();
        for(int i = 0; i < 1000; i++)
            linkedList.add(i);
        for(int i = 0; i < 100; i++)
            arrayList.remove(i+ new Random().nextInt(50));
        endB = System.nanoTime();
        System.out.println("To manipulate item for LinkedList " + (endB-startB));
    }
}
