import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame wd = new JFrame();
        wd.setSize(250,100);
        wd.setTitle("graphic window");
        wd.setVisible(true);
        wd.addWindowListener(new WndCls());
    }
    static class WndCls extends WindowAdapter {
        public  void windwoClosing(WindowEvent e){
            System.exit(0);
        }
    }
}
