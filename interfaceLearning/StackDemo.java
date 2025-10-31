class Stack {
    private int[] stack = new int[10];
    private int size;
    private int top;
    public Stack(){
        size = 0;
        top = -1;
    }
    void push(int x){
        if(top == 9){
            System.out.println("can't push, stack Over flow");
        } else {
            stack[++top] = x;
        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack Under flow");
        } else{
            top--;
        }
    }
    int peek(){
        if(top == -1){
            System.out.println("stack is empty");
            return -1;
        } else {
            return stack[top];
        }
    }
    int size(){
        return (top+1);
    }
}

public class StackDemo {
    public static void main(String[] args){
        Stack stack = new Stack();
        stack.pop();
        for(int i = 0; i < 11; i++){
            stack.push(i);
        }
        System.out.println(stack.peek());
    }
}