package a_review.week16;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMulti {

    public static void main(String[] args) {

        List <String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("a");
        List <String> list2= new ArrayList<>();
        List <String> list3= new ArrayList<>();
        list3.add("z");

        List < List<String> > multiList = new ArrayList<>();
        multiList.add(list1);
        multiList.add(list2);
        multiList.add(list3);

        System.out.println(multiList.get(0).get(0));
        System.out.println(multiList.get(2).get(0));

    }
}
