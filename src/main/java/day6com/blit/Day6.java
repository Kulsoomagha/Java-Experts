package day6com.blit;

public class Day6 {
//    ABSTRACTION:
//    its a process of hiding the certain details and implementations
//    its achieved by 2 ways:
//    1- Abstract class
//    2- Interface

//    Abstract class:
//    can have concrete and abstract methods
//    cannot create objects using abstract class
//    we use keyword = abstract

//    Abstract methods:
//    those methods who dont have a body

    public static void main(String[] args) {
//        Bankaccount b = new Bankaccount();


//     Interface:
//     we use keyword = implements
//     we cannot create objects using interface
//     when a class implements an interface, that class should implement its methods.
//     interface can have abstract methods only.

//     in interface -> methods -> by default its public, attributes are -> static and final.

//     DIAMOND PROBLEM:
//     by using interface we can implement multiple inheritance
//     JAVA DOESN'T ALLOW MULTIPLE INHERITANCE WITH CLASSES
//     A CLASS SHOULD ONLY EXTEND ONE PARENT
//----------------------------------------------------------------------------------------------
//      JDK = JAVA DEVELOPMENT KIT = HELPS US WRITE THE CODE
//      JRE = JAVA RUNTIME ENVIRONMENT = HELPS US RUN THE CODE / ALL THE LIBRARIES

//      JVM:
//      JAVA VIRTUAL MACHINE =
//      JAVAC -> JAVA COMPILER = COMPILES THE SOURCE CODE INTO MACHINE CODE
//      JIT -> JUST IN TIME = IT READS CODE LINE BY LINE AND UNDERSTANDS WHAT USER WANTS AS AN OUTPUT

//      WORA : WRITE ONCE RUN ANYWHERE: which means once we write java code it can
//      be run on any computer having JVM .
//----------------------------------------------------------------------------------------------
//      JAVA MEMORY IN JVM:
//      STACK:
//      -> java uses stack memory to store local variables and method calls
//        method call means when you call a variable using a method
//      ->
//      HEAP:
//      -> java objects will be stored in heap, portion of memory storing objects and arrays
//      ->  String literal pool:

//      ---------------------------------------------------------------------------------------
//      String class:
//      Strings are final-> immutable -> once created its values cannot be changed.
//      when we modify a String -> it will actually create a new String

        String a  = "hey"; //stored in String literal pool
        String b  = new String(); //stored in heap memory

        String s1 = "hello world";
        String s2 = "hello world";

        String c = "hey";
        c = "hi";

        String s3 = "hello world";
        String s4 = new String("hello world");

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);

        System.out.println(s1.length());
        System.out.println(s1.charAt(2));
        System.out.println(s1.indexOf('w'));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,8));

//      Concatenations:
        System.out.println("hey" + " " + "how" + "are" + "you");

//      Final :
//      in java, the final keyword is used to apply restrictions on classes, methods, and variables.
//      in class: making final means it cannot extend


    }
}
