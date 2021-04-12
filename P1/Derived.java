package P1;
class Derived extends Protection
{
    public Derived()
    {
        System.out.println("Derived Constructor : Derived class ");
        System.out.println("a= "+a );
        //System.out.println("b= "+b );  //class only
        System.out.println("c= "+c );
        System.out.println("d= "+d );
    }
}