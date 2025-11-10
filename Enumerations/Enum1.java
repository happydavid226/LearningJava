package Enumerations;

import java.io.*;
import java.util.*;

enum Student {
    Slow(50), Middle(75), Fast(100), None;
    private final int marks;
    Student(int marks){
        this.marks = marks;
        System.out.println("called constructor with " + marks);
    }
    Student(){ this(-1); }
    public int getMarks(){
        return marks;
    }
}

public class Enum1 {
    public static void main(String[] args) throws IOException{
        ArrayList<Student> students = new ArrayList<>();
        students.add(Student.Slow);
        students.add(Student.Fast);
        students.add(Student.Middle);
        students.add(Student.None);
        for(int i = 0; i < 4; i++)
            System.out.println(students.get(i).getMarks());

    }
}