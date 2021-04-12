package practicals;
import java.io.*;

public class Practical23 {
    public static void main(String args[]) throws Exception
    {
        FileOutputStream f1= new FileOutputStream("C://Users/skt/Desktop/MCA/JAVA/practicals/file1.txt");

        try{
            String msg="Writing to a file using FileOutputStream method";
            byte f[]= msg.getBytes();
            f1.write(f);
        }
        catch(IOException e)
        {
            System.out.println("An i/o error occured");
        }
        finally{
            try{
            if(f1!=null)
                f1.close();
            }
            catch(IOException e)
            {
                System.out.println("Error closing file");
            }
        }

        FileWriter writer = new FileWriter("C://Users/skt/Desktop/MCA/JAVA/practicals/file2.txt");  
        BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write("Writing to a file using Buffered writer method");  
        buffer.close();  
    }
    
}
