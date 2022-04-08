import java.applet.Applet;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.w3c.dom.events.Event;
public class Program2 extends Applet implements ActionListener {
    TextField t1,t2;
    Button b1;
    public void init(){
        t1 = new TextField(8);
        t2 = new TextField(8);
        add(t1);
        add(t2);
        b1 = new Button("Sum");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1)
        repaint();
    }

    public void paint(Graphics g){       
        g.drawString("Input a number in each box", 10, 40);
        int x = 0, y = 0;
        try{
            String s1 = t1.getText();
            String s2 = t2.getText();
            x = Integer.parseInt(s1);
            y = Integer.parseInt(s2);
        }catch(Exception e){}
        int z = x+y;
        
        String s = String.valueOf(z);
        g.drawString(s, 100,75);
            
        
    }

    public boolean Action(Event e,Object obj){
        repaint();
        return true;
    }
}
/*
<applet code="Program2" width=500 height = 300>
</applet>
*/