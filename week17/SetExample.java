package a_review.week17;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<>();
        set1.add("d");
        set1.add("z");
        set1.add("a");
        set1.add("m");
        set1.add("d");
        set1.add("3");
        set1.add(".");
        set1.add(null);
        System.out.println(set1);

        Set<String> set2 = new LinkedHashSet<>();
        set2.add("d");
        set2.add("z");
        set2.add("a");
        set2.add("m");
        set2.add("3");
        set2.add("d");
        set2.add(".");
        set2.add(null);
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
        set3.add("d");
        set3.add("z");
        set3.add("a");
        set3.add("m");
        set3.add("3");
        set3.add("d");
        set3.add(".");
        //set3.add(null);
        System.out.println(set3);



    }
}
