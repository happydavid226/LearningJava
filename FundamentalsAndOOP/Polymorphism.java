class Vehicle{
    public void display(){
        System.out.println("I have a vehicle");
    }
}

class Car extends Vehicle {
    @Override
    public void display(){
        System.out.println("I have  acar");
    }
}

class Bike extends Vehicle {
    @Override
    public void display(){
        System.out.println("I have a bike");
    }
}

public class Polymorphism {
    public static void main(String [] args){
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.display();
        v2.display();
    }
}