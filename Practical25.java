package practicals;
import java.io.*;

public class Practical25 
{
    public static void main(String args[]) throws IOException
    {
        FileWriter writer = new FileWriter("C://Users/skt/Desktop/MCA/JAVA/practicals/file4.txt");  
        BufferedWriter buffer = new BufferedWriter(writer);  
        buffer.write("\n Appending to a file using Buffered writer method");  
        buffer.close();

        // PrintWriter pw = new PrintWriter("C://Users/skt/Desktop/MCA/JAVA/practicals/file4.txt");
        // // String msg1="\n Appending to a file using PrintWriter";
        // //     char c1[]= new char[msg.length()];
        // pw.append("a");

        FileWriter fw = new FileWriter("C://Users/skt/Desktop/MCA/JAVA/practicals/file4.txt", true );
      
        try{
            String msg="\n Appending to a file using FileWriter";
            char c[]= new char[msg.length()];
            msg.getChars(0, msg.length(), c, 0);

            
                fw.write(c);
        }
        catch(IOException e)
        {
            System.out.println("An i/o error occured");
        }
        finally{
            try{
            if(fw!=null)
                fw.close();
            }
            catch(IOException e)
            {
                System.out.println("Error closing file");
            }
        }



}
}
