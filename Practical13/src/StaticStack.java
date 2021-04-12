public class StaticStack {
    int oneDstack[]= new int[10];
    int tos;
    StaticStack()
    {
    tos= -1;
    }
    int push(int item)
    {
        if(tos==9)
            System.out.println("Stack is full");
            return 0;
        else
            return oneDstack[++tos]=item;
    }
    int pop()
    {
        if(tos<0)
            System.out.println("Stack Underflow");
            return 0;
        else
            return oneDstack[tos--];
    } 
}
