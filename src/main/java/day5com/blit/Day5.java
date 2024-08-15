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
//      it is possible to inherit attributes and methods from one class to another class
//      1. subclass or child class -> class that inherits from [anotherlass]<- this will be parent class

//      2. super class or parent class ->
//              using the super keyword we can access the parent methods or attributes

//      to inherit from one class to another class , we will use keyword "extends"
//      for all the classes in java parent class is the OBJECT CLASS

//      we still remain with 1 pillar:





    }
}
