package src;

public class Equilateral implements Triangle
{
    double Perimeter()
    {
        double perimeter= a+a+a;
        return perimeter;
    }
    double Area()
    {
        
        double area= ((Math.sqrt(3))*a*a)/4;
        return area;
    }
}
