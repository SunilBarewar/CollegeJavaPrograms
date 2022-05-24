import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

/*
<applet code = "Program12.class" width = "500" height ="300">
</applet>
*/
class MenuFrame extends Frame{
    String message = "";
    MenuFrame(String title){
        super(title);
        MenuBar mbar = new MenuBar();

        Menu file = new Menu("File");
        MenuItem item1 = new MenuItem("New...");
        MenuItem item2 = new MenuItem("Open...");
        MenuItem item3 = new MenuItem("Close...");
        MenuItem item4 = new MenuItem("-");
        MenuItem item5 = new MenuItem("Quit");

        file.add(item1);
        file.add(item2);
        file.add(item3);
        file.add(item4);
        file.add(item5);
        
        mbar.add(file);

        Menu edit = new Menu("Edit");
        MenuItem item6 = new MenuItem("Cut");
        MenuItem item7 = new MenuItem("Copy");
        MenuItem item8 = new MenuItem("Paste");
        MenuItem item9 = new MenuItem("Cut");

        edit.add(item6);
        edit.add(item7);
        edit.add(item8);
        edit.add(item9);

        mbar.add(edit);

        MyMenuHandler handler = new MyMenuHandler(this);

        item1.addActionListener(handler);
        item2.addActionListener(handler);
        item3.addActionListener(handler);
        item4.addActionListener(handler);
        item5.addActionListener(handler);
        item6.addActionListener(handler);
        item7.addActionListener(handler);
        item8.addActionListener(handler);
        item9.addActionListener(handler);
    }

    public void paint(Graphics g){
        g.drawString(message,10,200);
    }
}

class MyMenuHandler implements ActionListener,ItemListener{

    MenuFrame menuFrame;
    public MyMenuHandler(MenuFrame menuFrame){
        this.menuFrame = menuFrame;
    }

    public void windowClosing (WindowEvent we){
        menuFrame.setVisible(false);
    }
    @Override
    public void itemStateChanged(ItemEvent e) {
        menuFrame.repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String message = "You Selected : ";
        String arg = e.getActionCommand();

        if(arg.equals("New...")){
            message += "New.";
        }
        if(arg.equals("Open...")){
            message += "Open.";
        }
        if(arg.equals("Close...")){
            message += "Close.";
        }
        if(arg.equals("Quit")){
            message += "Quit";
        }
        if(arg.equals("Edit")){
            message += "Edit";
        }
        if(arg.equals("Cut")){
            message += "Cut";
        }
        if(arg.equals("Copy")){
            message += "Copy";
        }
        if(arg.equals("Paste")){
            message += "Paste";
        }

        menuFrame.message = message;
        menuFrame.repaint();
       
    }
}

public class Program12 extends Applet{
    Frame f;
   @Override
   public void init() {
       f = new MenuFrame("Menu Demo");

       int width = Integer.parseInt(getParameter("width"));
       int height = Integer.parseInt(getParameter("height"));
       setSize(new Dimension(width,height));
       f.setSize(width,height);
       f.setVisible(true);
   }
   @Override
   public void start() {
       f.setVisible(true);
   }
   @Override
   public void stop() {
       f.setVisible(false);
   }
}
