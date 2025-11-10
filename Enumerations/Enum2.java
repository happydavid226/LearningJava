package Enumerations;

import java.io.*;

/**
 * This section is commented because this enum is already defined in Enum1.java in the same package

enum Student {
    Slow(50), Middle(75), Fast(100), None;
    private int marks;
    Student(int marks){
        this.marks = marks;
        System.out.println("called constructor with " + marks);
    }
    Student(){ this(-1); }
    public int getMarks(){
        return marks;
    }
}
*/
enum Teacher {
    Slow(50), Middle(75), Fast(100), None;
    private final int marks;
    Teacher(int marks){
        this.marks = marks;
        System.out.println("called constructor with " + marks);
    }
    Teacher(){ this(-1); }
    public int getMarks(){
        return marks;
    }
}

public class Enum2 {
    public static void main(String[] args) throws IOException{
        Teacher omar, hassan;
        Student david, happy;

        omar = Teacher.Fast;
        david = Student.Fast;
        hassan = Teacher.Slow;
        happy = Student.Slow;
        System.out.println(omar.compareTo(hassan)); //positive number
        System.out.println(david.equals(happy)); //false
        System.out.println(Teacher.None.equals(Student.None)); //false

        System.out.println(omar.ordinal());
        System.out.println(david.ordinal());
        System.out.println(Teacher.None.ordinal());
        System.out.println(Student.None.ordinal());

    }
}