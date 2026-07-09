package com.example.springcore;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Student {
    private String name;
    private int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }


    public String getName() { return name; }

    public int getMarks() {
        return marks;
    }
}

public class CustomSorting {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
         students.add(new Student("Pratik", 99));
         students.add(new Student("Deepak", 98));
         students.add(new Student("Omm", 99));

         List<Student> sortedByMarks = students.stream()
                 .sorted(Comparator.comparingInt(Student::getMarks))
                 .toList();

        System.out.println();

    }
}
