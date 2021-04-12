package src;
public class Scalene implements Triangle
{
    
    double Perimeter()
    {
        double perimeter= a+b+c;
        return perimeter;
    }
    double Area()
    {
        double s= (a+b+c)/2;
        double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
        return area;
    }
    
}
