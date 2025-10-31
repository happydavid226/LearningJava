package interfaceLearning;

interface Flyable {
    void fly();
}

interface Walkable {
    void walk();
}

class Hen implements Flyable, Walkable {
    public void fly(){
        System.out.println("I am flying");
    }
    public void walk(){
        System.out.println("I am walking");
    }
}

class LetIt {
    void letItFly(Flyable flyable){
        flyable.fly();
    }
    void letItWalk(Walkable walkable){
        walkable.walk();
    }
}


public class Program1 {
    public static void main(String[] args){
        LetIt letIt = new LetIt();
        Hen hen = new Hen();
        letIt.letItFly(hen);
        letIt.letItWalk(hen);
    }
}