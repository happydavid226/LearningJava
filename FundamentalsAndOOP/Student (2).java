class Person {
    String name;
    Person(String name){
        this.name = name;
    }
        
}

class Student extends Person {
    String yearOfStudy;
    Student(String name, String yearOfStudy){
        super(name);
        this.yearOfStudy = yearOfStudy;
    }

    public void printDetails(){
        System.out.println("this is  " +  this.name + " in " + this.yearOfStudy);
    }
    public static void main(String [] args){
        Student s1 = new Student("David", "y1A");
        s1.printDetails();
    }
}