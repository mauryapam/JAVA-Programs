import java.applet.*;
import java.awt.Graphics;
/* <applet code= "AppletDemo.class" width=400 height="400"></applet> */
public class AppletDemo extends Applet
{
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
        msg= "Inside init()--";
    }
    public void start(){
        msg+= "Inside Start() --";
    }
    
    public void paint(Graphics g){
        msg+= "Inside paint().";
        d.drawString(msg,10,30);

    }
    public void stop(){}
    public void destroy(){}
}