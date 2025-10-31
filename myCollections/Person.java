package myCollections;

public class Person implements Comparable {
    private Integer code;
    private String name;
    private String email;

    public Person(int code, String name, String email){
        setCode(code);
        setName(name);
        setEmail(email);
    }

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setCode(int code){
        this.code = code;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public int getCode(){
        return this.code;
    }

    @Override
    public String toString(){
        return "Person [ code = " + code + ", name = " + name + ", email = " + email + "]";
    }

    @Override
    public int hashCode(){
        return this.code.hashCode() + this.name.hashCode() + this.email.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        Person person = (Person) obj;
        return (this.code.equals(person.getCode()) && this.name.equals(person.getName()) && this.email.equals(person.getEmail()));
    }

    @Override
    public int compareTo(Object obj){
        Person person = (Person) obj;
        if(this.code.compareTo(person.getCode()) != 0){
            return - this.code.compareTo(person.code);
        }
        if(this.name.compareTo(person.getName()) != 0){
            return - this.name.compareTo(person.getName());
        }

        return - this.email.compareTo(person.email);
    }
}
