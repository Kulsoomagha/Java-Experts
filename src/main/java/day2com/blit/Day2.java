package day2com.blit;

public class Day2 {
    public static void main(String[] args) {
//        if else - else if statement:

//        if (condition) {
//
//        }else{
//
//        }

//        signal = red green yellow

//        SWITCH STATEMENT:
//        case1
//        case2
//        case 3
//        default

        String signal = "yellow";

        switch(signal){
            case "green" :
                System.out.println("drive");
            break;
            case "red" :
                System.out.println("stop");
            break;
            case "yellow" :
                System.out.println("yeild");
            break;
            default :
                System.out.println(" i dont know");
        }

//        weekdays:
//        7 cases:
//        default : anything

        int f = 23;
        switch (f){
            case 20 :
                System.out.println("its 20");
                break;
            case 23 :
                System.out.println("its 23");
                break;
            default:
                System.out.println(" its default");
        }

////      LOOPS:
//                                                      ++    --
//        for(intializition a variable ; condtion ; increment/ decrement)

        for (int d = 1; d < 11; d++) {
            System.out.println(d);
        }
//        1 - 10 numbers
//        10 - 1 numbers

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }

//        1000 , 990, 980, ..... 500

        for (int e = 1000; e > 499 ; e=e-10) {
            System.out.println(e);
        }

//      nested for loop:
        for (int x = 1; x <=2 ; x++) {
            System.out.println("outer" + x);


            for (int y = 1; y <=3 ; y++) {
                System.out.println("inner" + y);
            }

        }

//      while loop:

//        initialize
//        while(condition){
//            the code of block that should execute
//            increment ++  \ decrement --
//        }

//        print numbers from 1 -10

        int a = 1;
        while(a<=10) {
            System.out.println(a);
            a++;
        }

//        1000 , 990, 980, ..... 500

//        DO-WHILE LOOP:
//        do{
//          do this i dont care about the whilw loop
//        }
//        while(){
//
//        }

        int s = 1;
        do{
            System.out.println("heyy");
            s++;
        }while(s <= 0);


//        DO-WHILE LOOP                                       WHILE LOOP
//    it will always execute once                           it will check the condition first then execute
//    it will see the while block after executing once


        for (int w = 1; w <51 ; w++) {
            if(w % 2 == 0){
                System.out.println(w + "even");
            }else {
                System.out.println(w + "odd");
            }
        }

//        divisible of 3:

        int number = 1000;

        while(number > 0){
            if(number % 3 == 0){
                System.out.println(number);
            }
            number--;
        };



//        OBJECTS:
//        CLASSES: A class holds the similar data with the class name its kind of a layer or a page


//        new keyword:
//        classname objectname = new classname();
        Person p = new Person();
        p.age = 23;
        p.height = 5.89;
        p.address = "123 somwhere";
        p.weight = 9.00;
        p.email = "p @ gmail.com";
        p.hairColor = "black";

        System.out.println(p.hairColor);

//        create a class TV
//        objects: samsung , tcl , olg
//        VARIABLES :
//        model
//        os
//        size
//        mfgYear
//        specs
//        color

//        samsung.color = "grey;"

    }
}
            //print 1, 2, 3 till 50
            // 1= odd
            // 2= even

//check and print the multiples of 3 in the series of
// 1000 , 999 , 998 , 997 ............... 1

