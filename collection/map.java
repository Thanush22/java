package collection;

import java.util.HashMap;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        map obj = new map();
        obj.newmap();
    }

    public void newmap() {
        Map map = new HashMap();
        map.put(3, "dinesh");
        map.put(2, "siva");
        map.put(1, "sanjay");
        System.out.println(map);
    }
}
