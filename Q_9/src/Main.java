import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame();

        frame.setSize(700,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Traffic_Light b=new Traffic_Light();
        frame.add(b);
        frame.setVisible(true);
    }
}
