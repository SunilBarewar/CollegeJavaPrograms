import java.applet.Applet;
import java.awt.*;
public class Program17 extends Applet{
    public void paint(Graphics g){
        g.drawOval(40,40, 120,150);
        g.drawOval(57, 75, 30, 20);
        g.drawOval(110, 75, 30,20);
        g.fillOval(68,81,10,10);
        g.fillOval(121,81,10,10);

        g.drawOval(85,100,30,30);
        g.fillArc(60,125,80,40,180,180);
        g.drawOval(25,92,15,30);
        g.drawOval(160,92,15,30);
        g.drawRect(20,200, 190, 30);
        g.drawRect(35,205,160,20);
        g.fillRect(35,205,160,20);
        g.drawLine(210,210,210,20);
        g.drawLine(20, 200, 20, 20);
        g.drawLine(20,20,210, 20);
    }
}
/*
 <applet code = "Program17" height = 400 width  = 500>
 </applet>
 */