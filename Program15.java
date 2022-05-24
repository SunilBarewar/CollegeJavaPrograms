import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
public class Program15 extends Applet implements ActionListener{
    TextField t1,t2,t3;
    Button b1;
    int n1,n2,sum;

    public void init(){
        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(20);

        b1 = new Button("Add");

        add(t1);
        add(t2);
        add(t3);
        add(b1);

        b1.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            try{
                n1 = Integer.parseInt(t1.getText());
                n2 = Integer.parseInt(t2.getText());
                sum = n1 + n2;
                t3.setText(String.valueOf(sum));
            }catch(NumberFormatException e1){
                t3.setText("Sorry Invalid Data Entry");
            }
        }
    }
}


/*
 <applet code = "Program15" height = 400 width  = 500>
 </applet>
 */