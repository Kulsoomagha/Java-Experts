package day10com.blit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableIntro {
    public static void main(String[] args) {
        List <Student> s = new ArrayList<>();
        s.add(new Student(12,"Alice"));
        s.add(new Student(42,"Bob"));
        s.add(new Student(22,"John"));
        s.add(new Student(32,"Louis"));

//        Collections.sort(s);
        System.out.println(s);



    }
}
