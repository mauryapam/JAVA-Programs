/*Write a program that will read a float type value from the   keyboard and print the following output.
     -smallest Integer not less than the number.
    -Given Number.
    -Largest Integer not greater than the number.
*/

package practicals;
import java.util.Scanner;;
public class FloatValue {


    int largestInteger(float a)
    {
        return (int)Math.floor(a);
    }
    int smallestInteger(float a)
    {
        return (int)Math.ceil(a);
    }
    public static void main(String args[])
    {
        FloatValue fv= new FloatValue();
        float n;
        System.out.println("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        n=sc.nextFloat();

        System.out.println("Smallest Integer not less than the number : "+fv.smallestInteger(n));
        

        System.out.print("Number : ");
        System.out.println(n);

        System.out.println("Largest Integer not greater than the number : "+fv.largestInteger(n));
        sc.close();
    }  
}
