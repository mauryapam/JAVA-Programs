package src;

public class Isosceles implements Triangle
{
    double Perimeter()
    {
        double perimeter= a+b+a;
        return perimeter;
    }
    double Area()
    {
        
        double area= 0.5*a*b;
        return area;
    }
}
