//WAP that generate 5 random integers between a user defined range (e.g. 1-100).

package practicals;
import java.util.Random;
public class RandomIntegers {

    public static void main(String args[])
    {
        int a;
       Random r= new Random();

       for(int i=0;i<5;i++)
       {
           a=r.nextInt(100);
           System.out.println(a);
       }
    }
    
}
