package day9com.blit;

import java.awt.image.LookupOp;
import java.util.*;

public class MapIntro {
    public static void main(String[] args) {
//      MAP:
//      we have couples here =   Key      Value
//                                1     "Kulsoom"
//                            "kulsoom"     1

//        HASHMAP :

//        Map<String,Integer> map2 = new HashMap<>();
//        map2.put("kulsoom",101);

        Map<Integer,String> map1 = new HashMap<>();
        map1.put(101,null);
        map1.put(109,"Bob");
        map1.put(201,"Loius");
        map1.put(320,"Sara");
//      Cannot have duplicate keys but can have duplicate values
        map1.put(310,"Bob");
        System.out.println(map1);
//      Doesnot follow the insertion order
        System.out.println(map1.keySet());
//        map1.get();
//        map1.containsKey()
//        map1.containsValue()
//        map1.remove()
//        map1.replace()

//        LINKEDHASHMAP:

        Map <Integer,String> map2 = new LinkedHashMap<>();
        map2.put(101,null);
        map2.put(109,"Bob");
        map2.put(201,"Loius");
        map2.put(320,"Sara");
        System.out.println(map2);
//      does follow the insertion order

//        TREEMAP:
        TreeMap <Integer,String> map3 = new TreeMap<>();
        map3.put(2,"Loius");
//        map3.put(null,"Sara");
        map3.put(5,"John");
        map3.put(20,"jack");
        System.out.println(map3);
//      TreeHashMap follows the sorting order


//		     hashMap                             LinkedHashMap                       TreeMap
//		 we can store null values              we can store null values     we can not store null keys
//      does not follow insertion order      does follow insertion order     does follow sorting order

//----------------------------------------------------------------------------------------------------------
//      FOREACH - Loop:

//      Iterator object = implemented by forEachLoop which will iterate through the loop one by one.
//      Iteration = its ike a for loop which means : running block of code

    for (Integer key : map1.keySet()){
            System.out.println(key);
        }

        for(String values : map1.values()){
            System.out.println(values);
        }

      for(Map.Entry<Integer,String> entry : map1.entrySet()){
          System.out.println(entry.getKey() + entry.getValue());
      }


    }
}
