package MAP;
import java.util.*;

/*
 *Created by chhormchhatra on 7/20/17.
 */
public class HashMapDemo
{
    public static void main(String[] args){
        Map map = new HashMap<Integer, String>();
        map.put(1, "Derek");
        map.put(21, "Ong");
        map.put(12, "Yong");
        map.put(23, "Sim");
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        /**/
        Set<Integer> keys = map.keySet();
        System.out.println(keys);
        Collection<String> col = map.values();
        System.out.println(col);
        /*
        * Set can be used with the keySet() because keySet is already unique
        * Set cannot be used with values() because values can be duplicated values
        * List cannot be used with values() because the implementation is not the same,
        * the collection interface should be used with values() set from map
        * */
    }
}
