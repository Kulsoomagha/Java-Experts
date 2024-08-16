package day6com.blit;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {
//     SCANNER:
//     SCANNER class is used to get user input

        Scanner sc1 = new Scanner(System.in);
//        system.in = means we are saying that system will provide you the information
        Student student1 = new Student();

        //        1= create the sout of print statements first
        System.out.println("Enter your id: ");
        //        2= then use the scanner object
        int sid = sc1.nextInt();
        //        3= then call the next line methods on that scanner object
        sc1.nextLine();
        //        4-  then call the set method, and it will set the new values from user
        student1.setId(sid);

        System.out.println("Enter your age: ");
        int sage = sc1.nextInt();
        sc1.nextLine();
        student1.setAge(sage);

        System.out.println("Enter your Gpa: ");
        double sgpa = sc1.nextDouble();
        sc1.nextLine();
        student1.setGpa(sgpa);

        System.out.println("Enter your name: ");
        String sname = sc1.nextLine();
        student1.setName(sname);

        //        then create a tostring method in Student class
//        then it will print the stored values too..
        System.out.println(student1);

    }
}
