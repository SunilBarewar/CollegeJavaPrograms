import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import javax.swing.border.Border;
public class swingDemo {
   public static void main(String args[]) {
      JFrame frame = new JFrame("Demo");
      JLabel label;
      label = new JLabel("This is demo label!",JLabel.CENTER);
      label.setVerticalAlignment(JLabel.TOP);
      label.setFont(new Font("Verdana", Font.BOLD,50));
      label.setForeground(new Color(120, 90, 40));
      label.setBackground(new Color(100, 20, 70));
      label = new JLabel("This is demo ",JLabel.CENTER);
      label.setFont(new Font("Verdana", Font.BOLD,50));
      label.setForeground(new Color(120, 90, 40));
      label.setBackground(new Color(100, 20, 70));
      Border border = BorderFactory.createLineBorder(Color.RED);
      label.setBorder(border);
      frame.add(label);
      frame.setSize(600,600);
      frame.setVisible(true);
     
   }
}
