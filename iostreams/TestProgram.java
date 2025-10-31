package iostreams;

import java.io.*;

public class TestProgram {
    public static void main(String[] args){
        String filename = "student.txt";
        /*Student object = new Student(101, "Jack", 15);
        Student sde = new Student(102,  "Jacky", 18);


        //serialization
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(object);
            out.writeObject(sde);

            out.close();
            file.close();
            System.out.println("Object has been serialized");
        } catch (IOException ex){
            System.out.println("IOException is caught");
        }
*/
        Student object1 = null;
        Student object2 = null;

        try {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            object1 = (Student) in.readObject();
            object2 = (Student) in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been serialized");
            System.out.println("code = " + object1.code);
            System.out.println("Name " + object1.firstName);
            System.out.println("Age " + object1.age);
            System.out.println("code " + object2.code);
            System.out.println("Name " + object2.firstName);
            System.out.println("Age " + object2.age);
        } catch(IOException ex){
            System.out.println("IO exception is caught " + ex.getMessage());
            ex.printStackTrace();
        } catch(ClassNotFoundException ec){
            System.out.println("Class not found exception is caught " + ec.getMessage());
        }
    }
}
