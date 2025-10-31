package myCollections;

public class GenericTestDemo {
    public static void main(String[] args){
        Point<String> nums = new Point<String>();
        nums.x = "Hello";
        nums.y = "Hey";

        System.out.println("My Point is : (" + nums.x + "," + nums.y + ")");
    }
}
