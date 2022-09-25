import javax.swing.*;
import java.awt.*;

public class Draw extends JComponent{
    public void panitComponent(Graphics g){
        Graphics2D g2=(Graphics2D) g;
        Rectangle r=new Rectangle();

        g2.setColor(Color.RED);
        g2.fillRect(50,50,150,100);

        g2.setColor(Color.RED);
        g2.drawString("Ali_Ahmed",70,100);
    }
}
