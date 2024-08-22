package day10com.blit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorIntro {
    public static void main(String[] args) {
        List<Student> s = new ArrayList<>();
        s.add(new Student(101,"Alice"));
        s.add(new Student(420,"Bob"));
        s.add(new Student(225,"John"));
        s.add(new Student(502,"Louis"));

        Collections.sort(s, new IdComparator());
        System.out.println(s);

        for (Student ss : s){
            System.out.println(ss.getId() + ss.getName());
        }

    }
}
