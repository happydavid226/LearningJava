import java.util.Objects;

public class Student implements Comparable {
    private Integer code;
    private String firstName;
    private String email;

    public Student(){
        super();
    }

    public Student(Integer code, String firstName, String email){
        super();
        this.code = code;
        this.firstName = firstName;
        this.email = email;
    }

    public Integer getCode(){return code; }

    public void setCode(Integer code) { this.code = code;}
    public void setFirstName(String firstName){ this.firstName = firstName; }
    public String getEmail() {return email; }
    public void setEmail(String email){ this.email = email; }

    @Override
    public boolean equals(Object obj){
        Student st = (Student) obj;
        return this.code.equals(st.code) && this.email.equals(st.email);
    }

    public int hashCode(){
        return this.code.hashCode() + this.firstName.hashCode()+this.email.hashCode();
    }
    @Override
    public int compareTo(Object o){
        Student st = (Student) o;

        if(this.code.compareTo(st.code) != 0)
            return this.code.compareTo(st.code);
        if(this.firstName.compareTo(st.firstName) != 0)
            return this.firstName.compareTo(st.firstName);

        return this.email.compareTo(st.email);
    }

    public static void main(String[] args){
        Student a = new Student(123, "Angella", "angella2023@gmail.com");
    }
}
