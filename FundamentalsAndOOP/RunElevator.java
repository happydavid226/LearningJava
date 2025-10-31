import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

class Elevator {
    private int currentFloorNumber;
    private int currentNumberOfPeople;
    private Scanner sc = new Scanner(System.in);
    private int[] floors;
    private boolean[] isIn;
    private Queue<Integer> queue = new LinkedList<>();
    private boolean isOn, isOff;
    private int capacity;

    public Elevator(int capacity){
        init(capacity, 0);
    }
    void init(int capacity, int whereToGo){
        setCapacity(capacity);
        floors = new int[getCapacity()];
        isIn = new boolean[getCapacity()];
        currentNumberOfPeople = 0;
        currentFloorNumber = whereToGo;

        for(int i = 0; i < capacity; i++){
            floors[i] = 0;
            isIn[i] = false;
        }
        isOn = false;
        isOff = true;
    }
    void open(){
        System.out.println("doors opened : ");
        currentNumberOfPeople -= floors[currentFloorNumber];
        floors[currentFloorNumber] = 0;
        
        int numberOfSpaces = capacity - currentNumberOfPeople;
        if(numberOfSpaces == 0){
            go(); return;
        }
        System.out.println("There are " + numberOfSpaces + " spaces");
        System.out.println("Enter number of People want to enter : ");
        int numberOfPeopleToEnter = sc.nextInt();

        while(numberOfPeopleToEnter > (capacity-currentNumberOfPeople)){
            System.out.println("please enter valid number of people : ");
            numberOfPeopleToEnter = sc.nextInt();
        }
        currentNumberOfPeople += numberOfPeopleToEnter;

        int floor;
        System.out.println("Enter their destinations : ");
        for(int i = 0; i < numberOfPeopleToEnter; i++){
            floor = sc.nextInt();
            while(floor < 0 || floor >= capacity){
                System.out.println("The floor number must be from 0 to " + (capacity-1) + "\nplease enter valid floor : ");
                floor = sc.nextInt();
            }
            floors[floor]++;
            if(isIn[floor] || floor == currentFloorNumber) continue;
            queue.add(floor);
        } 
        go();       
    }

    void go(){
        if(queue.isEmpty()){
            System.out.println("I am on floor : " + currentFloorNumber);
            turnOff();
        } else {
            close();
            currentFloorNumber = queue.peek();
            System.out.println("heading to floor " + currentFloorNumber);
            queue.remove();
            System.out.println("reached floor " + currentFloorNumber);
            open();
        }
    }
    void close(){
        System.out.println("doors closed");
    }
    void start(int whereToGo){
        if(isOn)
            return;
        if(whereToGo > 0){
            init(this.capacity, whereToGo);
        }
        System.out.println("The elevator is starting...");
        isOn = true;
        isOff = false;
        open();
    }

    void turnOff(){
        isOff = true;
        isOn = false;
        System.out.println("enter where you are : ");
        int whereToGo = sc.nextInt();
        start(whereToGo);
    }
    void switchOff(){
        isOff = true;
        isOn = false;
        System.out.println("turning off...");
    }
    void setCapacity(int capacity){
        if(capacity >= 0){
            this.capacity = capacity;
        }
    }
    int getCapacity(){
        return this.capacity;
    }
}

public class RunElevator {
    public static void main(String[] args){
        Elevator elevator = new Elevator(8);
        elevator.start();
    }
}


