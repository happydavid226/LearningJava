class Human {
    public int age;
    public String name;
    public void represent(){
        System.out.println("I am " + name + " with " + age);
    }
}

class Student extends Human {
    public String clas;
    @Override
    public void represent(){
        System.out.println("I am " + name + " with " + age + " in " + clas);
    }
}

public class Ac {
    public static void main(String[] args){
        Student student = new Student();
        student.name = "Happy David";
        student.age = 16;
        student.clas = "Y2C";
        student.represent();
    }
}