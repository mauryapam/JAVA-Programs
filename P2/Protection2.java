package P2;
class Protection2 extends P1.Protection
{
    public Protection2()
    {
        System.out.println("Derived other package Constructor : Protection2 class ");
        // System.out.println("a= "+a );    //class or package only
        // System.out.println("b= "+b );    //class only
        System.out.println("c= "+c );
        System.out.println("d= "+d );
    }
}