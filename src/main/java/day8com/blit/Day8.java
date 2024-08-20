package day8com.blit;

public class Day8 {
//    Garbage Collector:
//    it comes unannounced and take the data that is not being used
//    we can not force it.

//    Final:
//    classes/methods/variables that cannot change.
//    they cannot be inherited

//    Finalize:
//    a method that runs before an object is removed from garbage collector.
//    for cleanup and removing files.

//    Finally:
//    the last block of code after try catch.
//    Finally will execute no matter if the try catch works or not.

    public static void main(String[] args) {

//      classnmae objectname = new classname();
        Generics     obj     = new Generics();
        obj.shout("Hey",56);
        obj.shout(3456,45.00);
        obj.shout(45.00,"hey");

//      classname <datatype, dataype> objectname = new classname<> ();
        Generics   <String , String>     obj1     = new Generics<>("hey","hey");

        Generics <Integer,Double> obj2 = new Generics<Integer, Double>(2,45.00);

//        int -> Integer
//        double -> Double
//        float -> Float

//        Wrapper classes:
//        int is getting wrapped from a primitive datatype to a object now..

//        Collection Framework:
//        Arrays: were fixed in size..

//        List          -> ArrayList, LinkedList , Stack
//        Set           -> Hashset , LinkedHashSet
//        SortedSet     -> TreeSet
//        Queue         -> Queue, PriorityQueue, DoubleEndedQueue

//        Map           -> HashMap, LinkedHashMap, TreeMap


    }
}
