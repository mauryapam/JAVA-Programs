package practicals;

import java.util.Scanner;
import java.lang.StringBuffer;
public class Practical16 
{
    public static void main(String args[])
    {
        
        Scanner sc= new Scanner(System.in);
        
        System.out.println("------OPERATIONS ON STRINGBUFFER ------");
        System.out.println("1.  Replace the content of StringBuffer with the user given string.");
        System.out.println("2.  Reverse the content of StringBuffer.");
        System.out.println("3.  Append a value to StringBuffer at the end.");
        System.out.println("4.  Remove a particular character from the StringBuffer.");
        System.out.println("5.  Insert a value at a particular offset in StringBuffer.");
        System.out.println("6.  Convert StringBuffer into String using toString() method of String class.");
        System.out.println("7.  Trim the content of StringBuffer using substring() method of String class.");
        System.out.println("8.  Write the contents of StringBuffer to file using BufferedWriter , FileWriter Java classe.");
        System.out.println("9.  Exit");
        do{
        System.out.print("Enter your choice : ");
        int n= sc.nextInt();
        
        switch(n)
    {
        case 1: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    System.out.println("Enter the substring");
                    String str= sc.next();
                    System.out.println("Enter the startIndex and EndIndex");
                    int startIndex= sc.nextInt();
                    int endIndex= sc.nextInt();
                    sb.replace(startIndex, endIndex, str);
                    System.out.println("StringBuffer Content after replacement: "+sb);

                }
                break;
        case 2: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    sb.reverse();
                    System.out.println("StringBuffer Content after reverse: "+sb);
                }
                break;

        case 3: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    System.out.println("Enter the substring");
                    String str= sc.next();
                    sb.append(str);
                    System.out.println("StringBuffer Content after append: "+sb);

                }
                break;
        case 4: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    System.out.println("Enter the character  index");
                    int index= sc.nextInt();
                    sb.deleteCharAt(index);
                    System.out.println("StringBuffer Content after removal: "+sb);
                }
                break;
        case 5: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    System.out.println("Enter the substring");
                    String str= sc.next();
                    System.out.println("Enter the startIndex to insert substring");
                    int index= sc.nextInt();
                    sb.insert(index, str);
                    System.out.println("StringBuffer Content after insertion: "+sb);

                }
                break;

        case 6: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    System.out.println(sb.toString());
                
                }
                break;
        case 7: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                    String str = sb.substring(2,6);
                    System.out.println(str);
                }break;
        case 8: {
                    StringBuffer sb= new StringBuffer("STRINGBUFFER");
                }
        case 9: {
                System.exit(0);
                }
        }
        System.out.println();
    }while(true);
       

 }
}