package day1com.blit;

import day4com.blit.Day4;

public class JavaDay1 {
    public static void main(String[] args) {
// packages: folders = picture = picture
//        screenshot = screenshots
// classes: we make all the code
// main method : entry point of my java program
//       without main method we cannot run anything...

//        console.log();
//        System.out.println = to print something in the console in java
//      " "
        System.out.println("HELLO JAVA");

//      Primitive  DATA TYPES:
//        whole numbers
//    Byte : 8 bits  -128  to +127
//    short : 16 bits
//    int  : 32 bits    -2,147,483,648          to         2,147,483,647
//    long : 64 bits   (L)
//    for whole number values we will always use int..

//        DECIMAL:
//        float : 32 bits : 6 to 7 decimal digits (f)
//        double : 64 bits : 15 decimal digits
//      for decimal number values we will use double

//          CHAR:
//      char = character
//      char initial = 'K';

//        TRUE/FALSE:
//        boolean : stores true or false
//        boolean a  = true;

//      NON - PRIMITIVE DATATYPE:
//      String = non-primitive data type..

//        create some variables:
//        firstName = String
//        lastName = String
//        initial = character
//        age = whole number
//        height = decimal

        String firstName = "Kulsoom";
        String lastNme = "Agha";
        char initial = 'K';
        int age = 32;
        double height = 53.00;

        System.out.println(firstName + " "+  lastNme + " "+ initial +" "+  age +" "+  height);

//        purse:
        String color = "black";
        int size = 5;
        char brandInitial = 'G';
        double price = 230.00;

//      operators:
//       = assigning a variable some data

//        arthematic operators:
//        + plus
//        - minus
//        * multiply
//        / divide


        int a = 20;
        int b = 30;
        int c  = a + b;

        System.out.println(c);

//         =
//        +=     f = f + 1;
//        -=
//        *=
//        /=

    int f = 30;
    f += 3;

    System.out.println(f);

//    COMPARING OPERATORS:

//    == **** ITS IMPORTANT

//    ==   (it checks the type of data and the location its stored in memory)
//    !=  !-> it means not equal   -> falsey operator
//    >    compare that left is greater than right
//    <    compare right is greater than lft
//    >=   greater than or equal to whatever is there
//    <=   less than or equal to
//
//        int x = 15;
//        int y = 15;
//        System.out.println(x != y);

//      LOGICAL OPERATORS:
//      && = and and = this will check both and say if both are ture or both are false
//                      if one of them is true it will make it false
//      || = or or   = this will just consider one if true it will say true
//                      if both are false it will say false , if both are ture it will say true
//      !  = not used to reverse
//          its always written outside the condition to check if its

        int z = 15;

        System.out.println(!(z < 16 || z > 14));
//                          this     this

//        % = modulus = it will show us the remaining value out of division

        int value1 = 10;
        int value2 = 4;
        int remainder = value1 % value2;
        System.out.println(remainder);

//      interview question
//       checking if the number is even or odd?

        int number = 6;

        if (number % 3 == 0){
            System.out.println("its even");
        }
        else {
            System.out.println("odd");
        }

//        signal methods
//        weather methods


//WAP to find given year is leap year or not

//Years evenly divisible by 4 are leap years.

//years divisible by 100 are not leap years, unless they are also divisible by 400.
//2024 is divisible by 4 and not divisible by 100, so it is a leap year. After 2024, the next leap
// year would be 2028.


    }
}