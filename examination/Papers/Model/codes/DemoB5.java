package Papers.Model.codes;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DemoB5 {
        public static void main(String args[]) {
            Map<Integer, String> hMap = new HashMap<>();
            hMap.put(1, "One");
            hMap.put(2, "Two");
            hMap.put(3, "Three");
            hMap.put(8, "Eight");
            hMap.put(6, "Six");
            hMap.put(10, "Ten");
            System.out.println("HashMap: "+ hMap);

            Map<Integer, String> lMap = new LinkedHashMap<>();
            lMap.put(1, "One");
            lMap.put(5, "Five");
            lMap.put(2, "Two");
            System.out.println("LinkedHashMap: "+ lMap);

            Map<Integer, String> tMap = new TreeMap<>();
            tMap.put(8, "Eight");
            tMap.put(6, "Six");
            tMap.put(10, "Ten");
            System.out.println("TreeMap: "+ tMap);
        }
}
