/*
    WAP that prints the following pattern :

    A B C D E F G G F E D C B A
      A B C D E F F E D C B A
        A B C D E E D C B A
          A B C D D C B A
           A B C C B A
             A B B A
               A A
*/
package practicals;

import java.util.Scanner;
public class Pattern {
    public static void main(String[] args) {
        int number;
        char ch;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        number = sc.nextInt();

        for (int i = 1; i <=number; i++) {
            ch ='A';
            for (int j = 1; j <=i; j++) 
                System.out.print("  ");

            for (int j = 1; j <=2*(number-i+1); j++) {
                System.out.print(ch+" ");
                if(j>(number-i+1))
                    ch--;
                else if(j<(number-i+1))
                    ch++;  
                         
            }

            System.out.println("");
        }

        sc.close();
    }
}