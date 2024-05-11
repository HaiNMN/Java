import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test extends JFrame {

    public test ()
    {
        setSize(400,400);
        setLocationRelativeTo(null);
        JPanel panel = new JPanel();
        add(panel);

        JLabel label = new JLabel("Caculater");
        panel.add(label);
    }

    public static void main(String[] agnt)
    {
        new test().setVisible(true);
        
    }
}