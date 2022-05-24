import java.applet.Applet;
import java.awt.*;
public class Program21 extends Applet{
    Image pic;
    MediaTracker tr;
    @Override
    public void init() {
        pic = getImage(getCodeBase(),"mickey.jpg");
    }
    @Override
    public void paint(Graphics g) {
        for(int i = 0;i  <= 100; i+=2){
            g.drawImage(pic,i, 30, this);
             try{
                Thread.sleep(400);
            }catch(Exception e){}
        }

       
    }
}

/*
 <applet code = "Program21" height = 400 width  = 500>
 </applet>
 */