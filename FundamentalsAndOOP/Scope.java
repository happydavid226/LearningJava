class A {
    private int id;
    A(int id){
        this.id = id;
    }
    public static void main(String [] args){
        System.out.println("this is class A");
    }
    public void printDetails(){
        System.out.println(this.id);
    }
}

class B {
    int id;
    B(int id){
        this.id = id;
    }
    public static void main(String [] args){
        System.out.println("This is class B");

        A a = new A(1);
        a.printDetails();
        a.id = 2;
        a.printDetails();
    }
    
    
}
