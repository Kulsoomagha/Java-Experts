package day5com.blit;

import day4com.blit.Person1;

public class Day5 extends Person1 {
    public static void main(String[] args) {
//        Arrays:

        String [] names = {"kulsoom", "loius", "joe", "sara"};
//        dataype [] arrayname = {}
        System.out.println(names.length);

        names[0] = "sam";
        System.out.println(names[0]);
        System.out.println(names.length);

//        Static:
//      when we know something is gonna be common to all..
//      static members (attributes or methods) its always public
//      static members (attributes or methods) always associated with class itself
//      static members (attributes or methods) can only be accessed by the class reference.

//      Anything which is not declared with static keyword is "NON-STATIC".

        Car c = new Car();
    //        Car.driving();

//      4 pillar OOPS: OBJECT ORIENTED PROGRAMMING

//      ENCAPSULATION:
//      encapsulation is to make sure that "sensitive" data is hidden from the user.
//      how to achieve?
//      1. declare class variables/attributes as private.
//      2. we will create a set or get methods to access or update the values of
//          private variables/attributes |
//      PRIVATE Access modifier , Getter / Setter..

//      make some variables
//        constructor
//        give methods
//        create getter setters
//        also objects..

//      INHERITANCE:

    }
}
