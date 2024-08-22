package day8com.blit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;

public class ListIntro {
    public static void main(String[] args) {
//      arraylist datatype      objectName = new arraylist<>():
        ArrayList   <String>        names     = new ArrayList<>();
//      ArrayList:
//        -> it is a resizeable array
//        -> good for adding something at first or last.
//        -> it is not good for inserting or deleting elements in the middle.

//     functions:
        names.add("lious");
        names.add("sara");
        names.add(0,"Bob");
        System.out.println(names);

        System.out.println(names.size());

        System.out.println(names.contains("sara"));

        System.out.println(names.indexOf("sara"));

        System.out.println(names);

//      LinkedList:
//      -> a sequence of elements where each element is pointing to the next (in a chain).
//      -> good for inserting or deleting elements in middle of the list.
//      -> they have nodes -> each node will know its own and the fellow elements location.

        LinkedList<String> Students = new LinkedList<>();
//        Students.addFirst("hello");
//        Students.addLast();

//      Stack:
//      LIFO : Last In First Out

        Stack<String> animals = new Stack<>();
//      Push: means adding the data in stack
        animals.push("Lion"); //first
        animals.push("Dog");
        animals.push("Horse");
        animals.push("Cat"); //last
//      insertion order = how i typed in laptop
        System.out.println(animals);

//      peek: shows the last in line
        System.out.println(animals.peek());

//      pop: removes the last one
//        animals.pop();
        System.out.println(animals);

//        animals.remove("Lion");
        System.out.println(animals);
        System.out.println(animals.search("Dog"));


    }
}
