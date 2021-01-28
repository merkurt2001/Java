package a_review.week17;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountingLettersMap {
    /*
    - Create a method that will accept a String and be print how many times each characters is found in the String

    apple

   {
      a - 1
      p - 2
      l - 1
      e - 1
   }
     */

   public static void main(String[] args) {
      countLetters("pneumonoultramicroscopicsilicovolcanoconiosis");
   }

   public static void countLetters(String str) {

      Map<Character, Integer> counter = new LinkedHashMap<>();

      for(int i=0; i < str.length(); i++) {

         char key = str.charAt(i);  // a

         if(!counter.containsKey(key)) {
            counter.put(key, 0);
         }

         counter.put(key, counter.get(key) + 1);
         // counter.put(key, 1)
      }

      for(Character key: counter.keySet() ) {
         System.out.println(key + " - " + counter.get(key));
      }




   }



}
