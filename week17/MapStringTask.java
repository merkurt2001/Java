package a_review.week17;

import java.util.HashMap;
import java.util.Map;

public class MapStringTask {

    /*
     Given a map of String, String modify and the map when:
	-> If the key "a" and key "b" have values that are different length then create new entry with key "c" and the value as the biggest value between "a" and "b"
	-> If the values of "a" and "b" have the same length, change both the values to be empty

     */

    /*
        {
           a - apple
           b - banana
         }

     */

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "apple");
        map.put("b", "banana");
        System.out.println(map);
        System.out.println(compareStrings(map));

    }

    public static Map<String, String> compareStrings(Map<String, String> map) {

        if(map.containsKey("a") && map.containsKey("b")) {

            if (map.get("a").length() == map.get("b").length()) {
                map.put("a", "");
                map.put("b", "");
            } else {

              map.put("c", map.get("a").length() > map.get("b").length() ? map.get("a") : map.get("b"));

            }

        }

        return  map;
    }



}
