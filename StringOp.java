/*
WAP that performs following operations on strings (without using string API) :
(a) Reverse a string.
(b) Check whether a string is palindrome or not.
(c) Compare two strings.
(d) Find a substring in a given string & print its position.
(e) Concatenate two strings.
(f) Convert a string into array of characters.
(g) Sort the characters in a string.
(h) Print the character with the second highest frequency in a given string along with its frequency.
*/

package practicals;

import java.util.Scanner;

public class StringOp
{
    public static void main(String args[])
    {
        String str1,str3,sbstr;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("------OPERATIONS ON STRING ------");
        System.out.println("1.  Reverse a string.");
        System.out.println("2.  Check whether a string is palindrome or not.");
        System.out.println("3.  Compare two strings.");
        System.out.println("4.  Find a substring in a given string & print its position.");
        System.out.println("5.  Concatenate two strings.");
        System.out.println("6.  Convert a string into array of characters.");
        System.out.println("7.  Sort the characters in a string.");
        System.out.println("8.  Print the character with the second highest frequency in a given string along with its frequency");
        System.out.println("9.  Exit");
        do{
        System.out.print("Enter your choice : ");
        int n= sc.nextInt();
        
        switch(n)
    {
        case 1: {
                     //Reverse a string
                    System.out.print("Enter String 1: ");
                    str1= sc.next();
             
                    char[] ch = new char[str1.length()]; 
                    for (int i = 0; i < str1.length(); i++) 
                    { 
                        ch[i] = str1.charAt(i); 
                    } 
                    String rev="";  //initially blank
                    for(int i=ch.length-1; i>=0; i--)
                    {  
                        rev=rev+ch[i];  
                    }  
                    System.out.println("Reverse of "+ str1+ " : " +rev); 
                }
        break;

        case 2: { 
                     //Check whether a string is palindrome or not.
                     System.out.print("Enter String 1: ");
                     str1= sc.next();
             
                     char[] ch = new char[str1.length()]; 
                     for (int i = 0; i < str1.length(); i++) 
                     { 
                         ch[i] = str1.charAt(i); 
                     } 
                     String rev="";  //initially blank
                     for(int i=ch.length-1; i>=0; i--)
                     {  
                         rev=rev+ch[i];  
                     }  
                    if(str1.equals(rev))
                    {
                        System.out.println(str1+ " is Palindrome");
                    }
                    else{
                        System.out.println(str1+ " is not Palindrome");
                    }
                }
        break;

        case 3: {
                    //Compare two strings.
                    System.out.print("Enter String 1: ");
                     str1= sc.next();

                    System.out.print("Enter string 2 : ");
                    str3= sc.next();
                    if(str1.equals(str3))
                    {
                        System.out.println(str1+" and "+str3+" are equal ");  
                    }
                    else
                    {
                        System.out.println(str1+" and "+str3+" are not equal ");
                    }

                }
        break;

        case 4: {
                    //Find a substring in a given string & print its position.
                    System.out.print("Enter String 1: ");
                    str1= sc.next();

                    System.out.print("Enter SubString you want to search in '"+str1+"' : ");
                    sbstr= sc.next();
                    System.out.println(sbstr+" is present at index "+str1.indexOf(sbstr));
                }
        break;

        case 5: {
                    // Concatenate two strings.
                    System.out.print("Enter String 1: ");
                    str1= sc.next();
                    System.out.print("Enter string 2 : ");
                    str3= sc.next();
                    System.out.println("Concatenation of "+str1+" and "+str3+" : " + str1+str3);

                }
        break;

        case 6: {
                    // Convert a string into array of characters.
                    System.out.print("Enter String 1: ");
                    str1= sc.next();
                    char[] ch = new char[str1.length()]; 

                    for (int i = 0; i < str1.length(); i++) 
                    { 
                        ch[i] = str1.charAt(i); 
                    } 
                    System.out.print("Characters in string "+str1+" are : ");
                    for (int i = 0; i < str1.length(); i++)
                    {
                    System.out.print(ch[i]+" ");
                    }
                    System.out.println();

                }
        break;

        case 7: {
                    // Sort the characters in a string.
                    System.out.print("Enter String 1: ");
                    str1= sc.next();
                    System.out.print("Sorted characters in "+str1+" : ");
                    char[] ch = new char[str1.length()]; 
                    for (int i = 0; i < str1.length(); i++) 
                    { 
                        ch[i] = str1.charAt(i); 
                    } 
                    for(int i=0; i<ch.length ; i++)
                    {
                        for(int j=i+1;j<ch.length; j++)
                        {
                            if(ch[i]>=ch[j])
                            {
                                char m=ch[i];
                                ch[i]=ch[j];
                                ch[j]=m;
                            }
                        }
                        System.out.print(ch[i]+" , ");
                        
                    }
                }
        break;

        case 8: {   //Print the character with the second highest frequency in a given string along with its frequency
     
        }break;
        case 9: System.exit(0);
        
        sc.close();
    } 
    }while(true);

} 
}

