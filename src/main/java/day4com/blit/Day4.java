package day4com.blit;

public class Day4 {

    public static void main(String[] args) {
//        type casting:
//        primitive datatypes:
//        objects:
//        99.99% =
//        the primitive datatypes are not objects: which means java is not completely
//        object-oriented programming
//
//        type casting: assigning a variable to another datatype
//        2 types: widening casting  byte -> short -> int -> double
//                 narrowing casting    double -> int -> byte

//        widening = changing a smaller datatype to a bigger one
        byte a = 120;
        int b = a;

//        narrowing = changing from bigger to smaller datatype
        float  c = 3.45f;
        int intvalue = (int) c;

//        System.out.println(intvalue);


//        ACCESS MODIFIERS:
//                          controls the level of access you want to anyone
//        -public : public is accessed to all by everyone anywhere in jaa program
//        -private: can only be accessed inside a particular class
//        -default : means can only be accessed inside the package
//                  id some attributes have no access modifiers they are default
//        -protected: means accessed with in the same package and subclasses/child classes.

// ---------------------------------------------------------------------------------
        Person1 p = new Person1();
        System.out.println(p.getName());
        p.setName("kulsoom");
        System.out.println(p.getName());

//------------------------------------------------------------------------------------

//        ARRAYS:
//        its fixed in size
//        it can hold only the data its given to store

//        syntax:
//        datatype[] arrayname = new datatype[sizeofarray];

        int[] box = new int[5];

        System.out.println(box);

        box[2] = 54;
        box[0] = 45;
        box[4] = 70;
        System.out.println(box[4]);

        double [] box2 = new double[10];
        box2[0] = 67.89 ;
        System.out.println(box2[0]);

        String [] box3 = new String[2];
        box3[0] = "kulsoom";
        box3[1] = "agha";

//      create a string array of names
//      length will be 10
//      store 10 names in it then print them.

    }
}
