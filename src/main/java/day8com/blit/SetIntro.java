package day8com.blit;

import java.util.*;

public class SetIntro {
    public static void main(String[] args) {

        Set <Integer> set1 = new HashSet<>();
//      can store null values
        set1.add(null);
//      does not follow the insertion order
        set1.add(54);
        set1.add(89);
        set1.add(21);
        set1.add(65);
//      does not allow duplicates
        set1.add(21);
        System.out.println(set1);

        set1.remove(54);
        System.out.println(set1);

        set1.clear();
        System.out.println(set1);

//      LinkedHashSet:

        Set <Integer> set2 = new LinkedHashSet<>();
//      LinkedHashSet maintains the insertion order
        set2.add(null);
        set2.add(40);
        set2.add(30);
        set2.add(50);
//      doesnot allows duplicates
        set2.add(10);
        System.out.println(set2);

//      TreeSet:
//      also known as sorted tree set:
        Set <Integer> set3 = new TreeSet<>(); // min - max
//        Set <Integer> set3 = new TreeSet<>(Comparator.reverseOrder()); reverse the order max - min
        set3.add(10);
        set3.add(30);
        set3.add(20);
        set3.add(70);
        System.out.println(set3);

        Set<String> set4 = new TreeSet<>();
        set4.add("apple");
        set4.add("orange");
        set4.add("banana");
        set4.add("grapes");
        System.out.println(set4);

//        hashSet                                 LinkedHashSet                        treeSet
//		can store null values                  can store null values            can not store null values
//		doesnot follow insertion order        follows insertion order             follows sorting order

//     all items are unique -> every data has its unique name in memory
//     set has all the values given a specific id of a hashcode in their memory
//     that's why we cannot have duplicates

    }
}
