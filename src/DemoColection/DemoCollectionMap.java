package DemoColection;

import java.util.HashMap;
import java.util.Map;

public class DemoCollectionMap {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        Map< Integer ,Double> map2 = new HashMap<>();

        map.put("Hello", "Xin Chao" );
        map2.put(1, 2.1);
        System.out.println(map);
        System.out.println(map2);
    }
}
