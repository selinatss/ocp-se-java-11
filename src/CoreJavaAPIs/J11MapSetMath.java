package CoreJavaAPIs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class J11MapSetMath {

    static void setAndMap(){
        Set<Integer> set = new HashSet<>();
        System.out.println(set.add(66)); // true
        System.out.println(set.add(66)); // false
        System.out.println(set.size()); // 1
        set.remove(66);
        System.out.println(set.isEmpty()); // true


        Map<String, String> map = new HashMap<>();
        map.put("koala", "bamboo");
        String food = map.get("koala"); // bamboo
        String other = map.getOrDefault("ant", "leaf"); // leaf
        for (String key: map.keySet())
            System.out.println(key + " " + map.get(key)); // koala bamboo
    }

    static void math(){
        long low = Math.round(123.45); // 123
        long high = Math.round(123.50); // 124
        int fromFloat = Math.round(123.45f); // 123

        double squared = Math.pow(5, 2); // 25.0
    }
}
