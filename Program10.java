import java.applet.Applet;

import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.w3c.dom.events.Event;
public class Program10 extends Applet implements ActionListener {
    TextField t[] = new TextField[10];
    Button b1;
    public void init(){
        for(int i = 0; i < 10; i++){
            t[i] = new TextField(8);
            add(t[i]);
        }
        b1 = new Button("Sort");
        add(b1);
        b1.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource() == b1)
        repaint();
    }

    public void paint(Graphics g){
        int a[] = new int[10];
        int i = 0, j , x, r = 60;

        // String s1,s;
        g.drawString("Input a number in each box", 10, 40);

        try{
            for( i = 0; i < 10; i++){
               String s1 = t[i].getText();
                a[i] = Integer.parseInt(s1);
            }
        }catch(Exception e){}

        for( i = 0; i < 9; i++){
            for(j = i+1; j < 10;j++){
                if(a[i] > a[j]){
                    x = a[i];
                    a[i] = a[j];
                    a[j]  = x;
                }
            }
        }

        r = 60;
        for(i = 0;i < 10;i++){
            String s = String.valueOf(a[i]);
            g.drawString(s, 50, r);
            r+=20;
        }
    }

    public boolean Action(Event e,Object obj){
        repaint();
        return true;
    }
}
/*
<applet code="Program10" width=500 height = 300>
</applet>
*/