//Find the maximum and minimum number in a user- entered array of integers using conditional operator.

package practicals;

import java.util.Scanner;

public class MinMax 
{
    public static void main(String args[])
    {    
    int i,n;
    int arr[]; 
    System.out.print("Enter the size of array :");
    Scanner sc= new Scanner(System.in);
    n=sc.nextInt();
    
    arr=new int[n];
    System.out.print("Enter the values of array :");
    { 
        
        for(i=0;i<n;i++)
        {  
            arr[i]=sc.nextInt();
            System.out.print(arr[i]+" ");   
        }
    }
    //variable = Expression1 ? Expression2: Expression3
    int Max= arr[0];
    for(i=0;i<n;i++)
    {  
       Max= (Max<arr[i])?(arr[i]):Max;
    }
    System.out.println();
    System.out.println("Maximum is = " + Max);
       
    int Min= arr[0];
    for(i=0;i<n;i++)
    {
        Min= (Min>arr[i])?(arr[i]):Min;
    }
    System.out.println();
    System.out.println("Minimum is = " + Min); 
    sc.close();
    }
}


