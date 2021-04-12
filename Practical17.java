/*Perform following operations using wrapper classes in a menu-driven fashion :
Convert Integer into Java String object and vice-versa.
Convert Integer into other primitive data types.
Convert a decimal number into binary & vice-versa.
Convert a decimal number into octal & vice-versa.
Convert a decimal number into hexadecimal & vice-versa.
*/
package practicals;

import java.util.Scanner;

public class Practical17 {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.println("------OPERATIONS USING WRAPPER CLASSES ------");
        System.out.println("1.  Convert Integer into Java String object and vice-versa.");
        System.out.println("2.  Convert Integer into other primitive data types.");
        System.out.println("3.  Convert a decimal number into binary & vice-versa.");
        System.out.println("4.  Convert a decimal number into octal & vice-versa.");
        System.out.println("5.  Convert a decimal number into hexadecimal & vice-versa.");
        System.out.println("6.  Exit");
        do{
        System.out.print("Enter your choice : ");
        int n= sc.nextInt();
        
        switch(n)
    {
        case 1: {
                Integer num= 31;
                System.out.println(num+ " in String : "+Integer.toString(num));
                String str= new String("6");
                System.out.println(str+ " in Integer : "+Integer.parseInt(str));
        }break;

        case 2: {
                Integer num= 31;
                long lnum= num;
                System.out.println(num+ " in Long : "+lnum);
                float fnum= num;
                System.out.println(num+ " in Float : "+fnum);
                
        }break;
        case 3: {
                System.out.print("Enter an Integer :");
                int num= sc.nextInt();
                String str= Integer.toBinaryString(num);
                System.out.println(num+ " in binary : "+str);
                int i= Integer.parseInt(str, 2);
                System.out.println(str+" in decimal : "+i);
                
        }break;
        case 4: {
                System.out.print("Enter an Integer :");
                int num= sc.nextInt();
                String str= Integer.toOctalString(num);
                System.out.println(num+ " in octal : "+str);
                int i= Integer.parseInt(str, 8);
                System.out.println(str+" in decimal : "+i);
        }break;
        case 5: {
                System.out.print("Enter an Integer :");
                int num= sc.nextInt();
                String str= Integer.toHexString(num);
                System.out.println(num+ " in hexadecimal : "+str);
                int i= Integer.parseInt(str, 16);
                System.out.println(str+" in decimal : "+i);
        }break;
        case 6: System.exit(0);
        
        sc.close();
    } 
    }while(true);
}
}