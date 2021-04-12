package practicals;
import java.io.*;

public class Practical24 
{
    public static void main(String args[]) throws IOException
    {
        File file3 = new File("/Users/skt/Desktop/MCA/JAVA/practicals/file3.txt");
        
        boolean flag = file3.setReadOnly();
    	if (flag==true)
    	{
    	   System.out.println("File  converted to Read only mode");
    	}
    	else
    	{
    	   System.out.println("Try Again");
        }
   
    }  
}
