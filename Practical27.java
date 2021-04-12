import java.lang.Thread;
class A extends Thread
{
    public void run()
    {
        System.out.println("thread A is Started:");
        for(int i=1;i<=5;i++)
        {
        System.out.println("\t from thread A:i="+i);
    }
    System.out.println("exit from thread A:");
    }
}
class B extends Thread
{
    public void run()
    {
        System.out.println("thread B is Started:");
        for(int j=1;j<=5;j++)
        {
        System.out.println("\t from thread B:j="+j);
        }
    System.out.println("exit from thread B:");
    }
}
class Practical27
{
    public static void main(String arg[])
    {
    new A().start();
    new B().start();
    }
}