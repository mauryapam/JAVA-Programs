package practicals;

public class Practical15 
{
    public static void main(String args[])
    {
        final int a= 10;
        int arr[]=new int[10];
       // a=11;
       // error: cannot assign a value to final variable a
        try{
            arr[11]=50; 
        }
        catch(ArrayIndexOutOfBoundsException ie)
        {
            System.out.println("Exception : "+ie);
        }
        finally
        {
            System.out.println("Finally block");
        }
    }
    @Override
    protected void finalize()
    {
        System.out.println("Finalize block");
    }
    
}
