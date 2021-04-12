package P1;
class Samepackage
{
    Samepackage(){
    Protection p= new Protection();
    
        System.out.println("Same package Constructor : Samepackage class ");
        System.out.println("a= "+p.a );
        // System.out.println("b= "+p.b ); //class only
        System.out.println("c= "+p.c );
        System.out.println("d= "+p.d );
    }
}