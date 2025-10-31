package interfaceLearning;

public class IFTest3 {
    public static void main(String[] args){
        IntStack intStack;
        FixedStack fixedStack = new FixedStack(10);
        DynStack dynStack = new DynStack(10);

        intStack = fixedStack;
        for(int i = 0; i < 10; i++)
            intStack.push(i);

        intStack = dynStack;
        for(int i = 0; i < 20; i++)
            intStack.push(i);
        
        intStack = fixedStack;
        System.out.println("fixed stack : ");
        for(int i = 0; i < 10; i++)
            System.out.println(intStack.pop());
        
        intStack = dynStack;
        System.out.println("dynamic Stack : ");
        for(int i = 0; i < 20; i++)
            System.out.println(intStack.pop());
    }
}