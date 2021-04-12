package src;
/* Create an abstract base class called Shape. It should contain 2 abstract methods : getCoord() and
howCoord() to accept X and Y coordinates, and one normal method to display the coordinates (i.e.
showCoord()). Create a sub class called Rect that inherit the Shape class and define its abstract functions and
call the showCoord() method of its superclass using super keyword. In main method, execute the
showCoord() method of the Rect class by applying the dynamic method dispatch concept. */
public class App {
    public static void main(String[] args)  {
       Rect rec =new Rect();
       Shape sha;
       sha=rec;
        int c,d;
       rec.getCoord(c,d);
       rec.showCoord();
    //    rec=s;
    //    rec.showCoord();
    
    //    s.getCoord(c,d);
    }
}
