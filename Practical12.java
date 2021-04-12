package practicals;

import java.util.Scanner;
import java.lang.StringBuffer;
public class Practical12 
{
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a number :  ");
        int num= sc.nextInt();
        System.out.println(num+" in Binary form :"+Integer.toBinaryString(num));
        System.out.print("Enter the nth position :  ");
        int n = sc.nextInt();
        System.out.println(num ^ (1 << (n-1)));
    }
    //sc.close();
}
