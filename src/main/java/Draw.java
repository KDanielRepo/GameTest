import javax.swing.*;
import java.awt.*;

public class Draw extends JPanel {
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(100,100,100,100);
        g.setColor(Color.BLACK);
        g.fillRect(100,100,100,100);
    }
}
