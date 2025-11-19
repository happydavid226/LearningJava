package generics;

interface X {}
interface Y{}

class SuperClass implements X, Y{
    Integer v;
    SuperClass(int v){
        this.v = v;
    }
    SuperClass(){}
    void superShow(){
        System.out.println(v);
    }
    @Override
    public String toString(){
        return this.v.toString();
    }
}
class AnotherClass extends SuperClass{
    Integer val;
    AnotherClass(int var){
        this.val = var;
    }
    void show(){
        System.out.println(val);
    }
    @Override
    public String toString(){
        return this.val.toString();
    }
}

class Mine <T extends X & Y>{
    T me;
    Mine(T me){
        this.me = me;
    }

    void show(){
        System.out.println(me);
    }
}

public class GenericsDemo1 {
    public static void main(String[] args){
        SuperClass sp = new SuperClass(100);
        Mine<SuperClass> mine = new Mine<>(sp);
        mine.show();
    }
}
