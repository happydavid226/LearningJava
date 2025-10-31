package interfaceLearning;
class DynStack implements IntStack {
    int[] stck;
    int size;
    int tos;
    DynStack(int size){
        stck = new int[size];
        tos = -1;
        this.size = size;
    }

    public void push(int x){
        if(tos == stck.length-1){
            int[] temp = new int[stck.length*2];
            for(int i = 0; i < stck.length; i++)
                temp[i] = stck[i];
            
            stck = temp;
            stck[++tos] = x;
        } else {
            stck[++tos] = x;
        }
    }
    public int pop(){
        if(tos < 0){
            System.out.println("Stack under flow");
            return 0;
        }
        return stck[tos--];
    }
}

class IFTest2 {
    public static void main(String[] args){
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);

        for(int i = 0; i < 12; i++)
            myStack1.push(i);
        for(int i = 0; i < 20; i++)
            myStack2.push(i);

        System.out.println("Stack in my stack1 : ");
        for(int i = 0; i < 12; i++)
            System.out.println(myStack1.pop());
        
        System.out.println("Stack in my Stack2 : ");
        for(int i = 0; i < 20; i++)
            System.out.println(myStack2.pop());
    }
}