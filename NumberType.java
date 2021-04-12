/*
There are three types of numbers :
(a)Abundant number: A number which is smaller than the sum of its proper divisors. For example, 12 is a
abundant number because the sum of its proper divisors 1+2+3+4+6=16(&gt;12).
(b)Deficient number: A number which is greater than the sum of its proper divisors.
(c)Perfect number: A number which is equal to the sum of its proper divisors.
*/

package practicals;

import java.util.Scanner;
class NumberType
{      
    public static void main(String args[])
    {
        int n,summ=0;
        System.out.print("Enter the number :");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();

        for (int i=1;i<n;i++) 
        {
            if (n%i==0) 
            {
                summ=summ+i; 
            }
        }
        if(summ==n)
        {
            System.out.println(n+" is a Perfect number");
        }
        else if(summ>n)
        {
            System.out.println(n+" is a Abundant number");
        }
        else{
            System.out.println(n+" is a Deficient number");
        }
        sc.close();
    }
}
