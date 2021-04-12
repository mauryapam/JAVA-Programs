/*WAP that convert the given number of days into months and days (assuming, each month of 30 days); e.g. :
Input – 69
Output – 69 days = 2 months & 9 days.
*/

package practicals;

import java.util.Scanner;

public class MonthsDays {
    public static void main(String args[])
    {    
    int days,months;
     
    System.out.print("Enter number of Days :");
    Scanner sc= new Scanner(System.in);
    days= sc.nextInt();

    if(days>=30)
    {
        months=days/30;
        days= days%30;      
    }
    else
    {   months=0; }
    System.out.println(months+" Months and "+days+" days");
    sc.close(); 
}
}
