//WAP that print the biggest and smallest 3 digits numbers, which has sum of it&#39;s digits equal to product of
//those digits.

package practicals;

public class SumEqualsProduct {
    public static void main(String args[])
    {
        int  rem;
        int smallest=999,biggest=100;
        
        for(int n=100; n<=999;n++)
        {      
                int summ=0, product=1;
                int temp=n;
                    while (temp!=0)
                    {
                        rem= temp%10;
                        summ=summ+rem;
                        product= product*rem;
                        temp=temp/10;
                    }
                if(summ==product)
                {
                    if(n<smallest)
                    smallest=n;
                    else if(n>biggest)
                    biggest=n;
                }     
        } 
        System.out.println();
        System.out.println("smallest 3 digits numbers : "+smallest); 
        System.out.println("biggest 3 digits numbers  : "+biggest);  
    }
}

             

