/*In general, a Armstrong number of n digits is equal to the sum of its digits raise to the power of n, e.g. 153 is
a Armstrong number because 153=1^3+5^3+3^3.
WAP that verifies whether a user entered number (of any number of digits) is Armstrong or not.
*/

package practicals;
import java.util.Scanner;
public class ArmstrongNo {
    public static void main(String args[])
    {
        int n,num,rem,arms=0;
        System.out.print("Enter the number(3 digits) :");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
            num=n;
            while (n!=0)
            {
                rem= n%10;
                arms=arms+(rem*rem*rem);
                n=n/10;
            }
        if(num==arms)
        {
            System.out.println(num + " Number is Armstrong Number ");
        }
        else
        {
            System.out.println(num + " Number is Not Armstrong Number ");
        }
        System.out.println();

        sc.close();
    }
}
