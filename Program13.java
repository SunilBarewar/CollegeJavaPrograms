import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Program13 extends Applet implements ActionListener{

    TextField t1,t2,t3;
    Button b1;
    Panel p1;
    
    public void init(){
        p1 = new Panel();
        p1.setLayout(new GridLayout(3,3));
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);

        b1 = new Button("calculate");

        p1.add(t1);
        p1.add(t2);
        p1.add(t3);
        p1.add(b1);

        b1.addActionListener(this);

        add(p1);
        p1.setSize(400,400);
        p1.validate();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource() == b1){
          int n1,n2,res;
          n1 = Integer.parseInt(t1.getText());
          n2 = Integer.parseInt(t2.getText());

          res = n1 + n2;
          t3.setText(String.valueOf(res));
      }
    }
    
}

/*
 <applet code = "Program13" height = 400 width  = 500>
 </applet>
 */