package interfaceLearning;

class FixedStack implements IntStack {
    int[] stck;
    int size, tos;

    public FixedStack(int size){
        this.size = size;
        stck = new int[size];
        tos = -1;
    }

    public void push(int x){
        if(tos == size-1){
            System.out.println("Stack over flow");
        } else {
            stck[++tos] = x;
        }
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Stack Under flow");
            return -1;
        } else {
            return stck[tos--];
        }
    }

}

public class IFTest {
    public static void main(String[] args){
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);

        for(int i = 0; i < 5; i++) myStack1.push(i);
        for(int i = 0; i < 8; i++) myStack2.push(i);

        System.out.println("stack in mystack1 : ");
        for(int i = 0; i < 5; i++){
            System.out.println(myStack1.pop());
        }

        System.out.println("stack in mystack 2 : ");
        
        for(int i = 0; i < 8; i++)
            System.out.println(myStack2.pop());
    }
}