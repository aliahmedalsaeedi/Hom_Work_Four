import javax.swing.*;
import java.awt.*;

public class Q_10 {
    public static void main(String[] args) {

        JFrame frame=new JFrame();
        frame.setSize(500,500);
        JLabel label=new JLabel("Hello you'r name..");
        label.setOpaque(true);
        label.setBackground(Color.LIGHT_GRAY);
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
