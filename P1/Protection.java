package P1;
public class Protection
{
    int a=1;
    private int b= 2;
    protected int c=3;
    public int d=4;

    public Protection()
    {
        System.out.println("Base Constructor : Protection class ");
       System.out.println("a= "+a );
        System.out.println("b= "+b );
        System.out.println("c= "+c );
        System.out.println("d= "+d );
    }
}