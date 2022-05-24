import java.applet.Applet;
import java.awt.*;
public class Program20 extends Applet{
    Image pic;
    MediaTracker tr;
    @Override
    public void paint(Graphics g) {
        tr = new MediaTracker(this);
        pic = getImage(getCodeBase(),"flower.jpg");

        tr.addImage(pic, 0);
        g.drawImage(pic,0, 0, this);
    }
}

/*
 <applet code = "Program20" height = 400 width  = 500>
 </applet>
 */