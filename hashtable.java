import java.util.HashMap;
import java.util.Hashtable;

public class hashtable {
    public static void main(String[] args) {
        // Hashtable()
        // Hashtable(int capacity)
        // Hashtable(int capacity, float loadfactor)

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put(null, null);
        hm.put(null, 1);
        System.out.println(hm);

        Hashtable<String , Integer> ht = new Hashtable<>();
        ht.put("A", 1);
        ht.put("A",2);
        System.out.println(ht.get("A"));
    }
}
