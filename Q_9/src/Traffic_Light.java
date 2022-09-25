import javax.swing.*;
import java.awt.*;

public class Traffic_Light extends JComponent {
        public void panitComponent(Graphics g){
            Graphics2D g2=(Graphics2D) g;
          //  Rectangle r=new Rectangle();

            g2.setColor(Color.BLACK);
            g2.fillRect(100,100,150,300);

            g2.setColor(Color.RED);
            g2.fillRect(125,120,100,100);
            g2.setColor(Color.YELLOW);
            g2.fillRect(125,230,100,100);
            g2.setColor(Color.GREEN);
            g2.fillRect(125,340,100,100);





    }

}
