package src;
abstract class Shape 
{
    int x,y;
    public abstract int getcoord(int x, int y);
    public abstract int howcoord(int x, int y);
    public void showcoord()
    {
        System.out.println("X = "+x+"\tY + "+y); 
    }
}
