class Overloading {
    private int id;
    String name;

    Overloading(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void printDetails(){
        System.out.println(this.id + " " + this.name);
    }
    public void printDetails(boolean hideName){
        System.out.println(this.id + " " + (hideName ? "" : this.name));
    }
    public static void main(String [] args){
        Overloading o1 = new Overloading(1, "David");
        Overloading o2 = new Overloading(2, "Darius");
        Overloading o3 = new Overloading(3, "Berard");

        o1.printDetails();
        o2.printDetails(false);
        o3.printDetails(true);

        o1.id = 4;
        o2.id = 5;
        o3.id = 6;

        o1.printDetails();
        o2.printDetails(true);
        o3.printDetails(false);



    }
}
