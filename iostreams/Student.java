package iostreams;
import java.io.*;
public class Student implements Serializable{
    @Serial
    private static final long serialVersionUID = 2924432001941578696L;
    public int code;
    public String firstName;
    public int age;

    public Student(int code, String fname, int age){
        this.code = code;
        this.firstName = fname;
        this.age = age;
    }
    public Student(){

    }
    public String toString(){
        return ("first name : " + this.firstName + " age " + this.age);
    }
}
