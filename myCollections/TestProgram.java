package myCollections;

import java.util.*;

public class TestProgram {
    public static void main(String[] args){
        Person p1=new Person(100,"ange","Ange@gmail.com");
        Person p2=new Person(200,"Mugisha","mugisha@gmail.com");
        Person p3=new Person(100,"Anaise","Anaise@gmail.com");
        Person p4=new Person(200,"Ange","ange@gmail.com");
        Person p5=new Person(10,"Ange","angella@gmail.com");
        Person p6=new Person(400,"Annet","annet@gmail.com");
        System.out.println("Person 1 and Person 2 "+p1.equals(p2));
        System.out.println("Person 1 and Person 3 "+p1.equals(p3));



        /*System.out.println("Person 1 and Person 2  " + p1.equals(p2));
        System.out.println("Person 1 and Person 3  " + p1.equals(p3));*/

        List<Person> people = new ArrayList<Person>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        people.add(p4);
        people.add(p5);
        people.add(p6);

        System.out.println("Array list before sorting : ");
        for(Person p : people)
            System.out.println(p);
        System.out.println();

        Collections.sort(people);
        for(Person p : people)
            System.out.println(p);
        System.out.println();

        Set<Person> peopleSet = new TreeSet<Person>();
        peopleSet.add(p1);
        peopleSet.add(p2);
        peopleSet.add(p3);
        peopleSet.add(p4);
        peopleSet.add(p5);
        peopleSet.add(p6);

        for(Person p : peopleSet)
            System.out.println(p);

    }
}
