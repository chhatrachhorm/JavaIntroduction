package ModelExamination;

import java.util.*;

public class CollectionsDemo {
    // set


    public static void main(String[] args) {
        String[] arrStr = new String[100];
        Set<String> s = new TreeSet<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new LinkedHashSet<>();
        s.add("Hello");

        System.out.println(s);

        ArrayList<Integer> al = new ArrayList<>();
        LinkedList<Integer> ll = new LinkedList<>();
        al.add(1);

        Map<Integer, String> m = new HashMap<>();
        Map<Integer, String> m1 = new LinkedHashMap<>();
        Map<Integer, String> m2 = new TreeMap<>();
        m.put(1, "Hello");
        m.keySet();
        m.values();
        m.size();
        al.size();
        s.size();
        for(String item: arrStr){
            System.out.println(item);
        }
        for(String sitem: s){
            System.out.println(sitem);
        }
        for(Integer alll: al){
            System.out.println(alll);
        }

    }
}
