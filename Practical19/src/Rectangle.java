package src;
public class Rectangle implements Shape
{
    double length=6.0;
    double breadth=8.0;
    public double Area()
    {
        return length*breadth;
    }
    public double Perimeter()
    {
        return 2*(length+breadth);
    }  
} 