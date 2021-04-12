package src;
class Rect extends Shape
{
    int a,b;
    public Rect(){ a=0; b=0;}
     int getcoord(int x, int y)
    {
        System.out.println("Enter x cordinate : ");
        Scanner sc = new Scanner(System.in);
        x= sc.nextInt();
        System.out.println("Enter y cordinate : ");
        y=sc.nextInt();
    }
     int howcoord(int x, int y){
        System.out.println(x);
        System.out.println(y);
    }
    public void showcoord()
    {
        System.out.println("Rect class showcoord()"); 
    }
    super.showcoord(x,y);
}