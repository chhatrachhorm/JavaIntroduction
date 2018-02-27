package map;
import java.util.*;

/*
 *Created by chhormchhatra on 7/20/17.
 */
public class HashMapDemo
{
    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Derek");
        map.put(21, "Ong");
        map.put(12, "Yong");
        map.put(23, "Sim");
        System.out.println(map.get(1));
        System.out.println(map.size());
        System.out.println(map.keySet());
        System.out.println(map.values());
        /**/
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<String> col = map.values();
        System.out.println(col);
        /*
        * keySet() return set
        * values() return Collection
        * */
    }
}
