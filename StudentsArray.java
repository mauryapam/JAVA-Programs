/*WAP that reads the names of the students in a class and store them a string array and consequently print
the names in a sorted order (without using the built-in string function sort() for string API).
*/

package practicals;

import java.util.Scanner;

public class StudentsArray {
    public static void main(String args[])
    {
        String students[];
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of students : ");
        n=sc.nextInt();

        students= new String[n];

        System.out.println("Enter name of students : ");
       
        for(int i=0; i<n; i++)
        {
        students[i]=sc.next();
        }   
        
        System.out.println("Sorted student names : ");
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(students[j].compareToIgnoreCase(students[i])<0)
                {
                    String temp= students[i];
                    students[i]=students[j];
                   students[j]=temp;
                }
            }
            System.out.println(students[i]);
        }
       sc.close();
    }
}
