import java.awt.*;
import javax.swing.*;
public class TextStyle
{
  TextStyle()
  {
    JFrame frame = new JFrame();
    frame.setLayout(new GridLayout(4,1));
  
    JTextField text = new JTextField();
    // Change text font size
    text.setFont(new Font("Serif",Font.BOLD,30));
    // Change text font color
    text.setForeground(Color.RED);
  
    frame.add(text); 
    frame.setSize(300,200);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
   public static void main(String[] args)
   {
     new TextStyle();
   }
}
