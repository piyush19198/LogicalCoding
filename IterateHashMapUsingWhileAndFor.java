import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class IterateHashMapUsingWhileAndFor {
    
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Piyush", 1);
        hashMap.put("Pratik", 2);
        hashMap.put("Tejal", 3);
        hashMap.put("Rushikesh", 4);

        for (Map.Entry<String, Integer> set : hashMap.entrySet()) {
            System.out.println(set.getKey() + " = " + set.getValue());
        }

        hashMap.forEach((key, value) -> System.out.println(key + " = " + value));
        
        Iterator<Entry<String, Integer>> itr = hashMap.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String,Integer> itrHM = (Map.Entry<String,Integer>)
            itr.next();
            System.out.println(itrHM.getKey() +" = " + itrHM.getValue());
        }
    }
}