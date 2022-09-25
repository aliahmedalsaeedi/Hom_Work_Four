import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setSize(600,1000);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Draw name=new Draw();
        frame.add(name);
        frame.setVisible(true);
    }
}
