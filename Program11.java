import java.applet.Applet;
import java.awt.*;    
import java.awt.event.*;    

public class Program11 extends Applet implements ItemListener {

    List mybooks;
    public void init(){
        mybooks = new List(5,true);
        mybooks.add("java");
        mybooks.add("v.B");
        mybooks.add("web disigning");
        mybooks.add("C++");
        mybooks.add("oracle");
        add(mybooks);
        mybooks.addItemListener(this);

    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        repaint();
    }

    public void paint(Graphics g){
        int idx[];
        String msg = "Current Mybooks : ";
        idx = mybooks.getSelectedIndexes();
        for(int i =0 ; i < idx.length;i++){
            msg += mybooks.getItem(idx[i]) + " ";
        }
        g.drawString(msg, 100, 150);
    }
    
}

/*
    <applet code = "Program11" width = 500 height = 300>
    </applet>
*/