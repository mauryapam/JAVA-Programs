/*Create an interface Shape which must contain two methods- area() and perimeter(). Then create another
interface Triangle that extends Shape and a class Rectangle that implements Shape. The interface Triangle
should contain three instance variables depicting its three sides and should be further implemented by three
classes-Scalene, Isosceles & Equilateral. */
package src;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);

        System.out.println("\n------------SHAPES------------");
        Rectangle r=new Rectangle();
        System.out.print("\nRectangle of  length= "+r.length+"  and breadth="+r.breadth +"  : \t");
        // r.length=sc.nextDouble();
        // r.breadth=sc.nextDouble();

        System.out.println( "Area : "+r.Area() + "\tPerimeter : "+r.Perimeter());

        Scalene s= new Scalene();
        System.out.print("\nScalene triangle  of sides (a="+Scalene.a+",b="+Scalene.b+",c="+Scalene.c+")  : ");
        System.out.println( "Area : "+Math.round(s.Area()*100.0)/100.0 + "\tPerimeter : "+s.Perimeter());

        Isosceles i= new Isosceles();
        System.out.print("\nIsosceles triangle  of sides (a="+Isosceles.a+",b="+Isosceles.b+")  : \t");
        System.out.println( "Area : "+i.Area() + "\tPerimeter : "+i.Perimeter());

        Equilateral e= new Equilateral();
        System.out.print("\nEquilateral triangle  of side (a="+Equilateral.a+")  : \t");
        System.out.println( "Area : "+Math.round(e.Area()*100.0)/100.0 + "\tPerimeter : "+e.Perimeter()+"\n");

        sc.close();
    }
}
