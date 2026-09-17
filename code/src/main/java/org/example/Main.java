package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Student s0 = new Student("Dave Developer", 23, "dav1");
        Person p1 = new Person("Alice Aardvark", 1);
        Student s1 = new Student("Bob Builder", 27, "bob123");
        Student s2 = new Student("Carol Coder", 42, "car5");
        Person[] people = {s0, p1, s1, s2};

        for (Person p : people) {
            System.out.println(p);
        }

        List<Student> students = new ArrayList<>();
        for (Person p : people) {
            if (p instanceof Student)
                students.add((Student) p);
        }

        Collections.sort(students);
        System.out.println(students);
    }
}