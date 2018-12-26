import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import lombok.Setter;
import lombok.Getter;

public class MainFrame extends JFrame implements KeyListener {
    Draw draw = new Draw();
    public MainFrame(){
        addKeyListener(this);
        setTitle("tytul");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300,300,300,300);
        getContentPane();
        setVisible(true);
        setLayout(new BorderLayout());
        add(draw);
        repaint();
    }
    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        switch (key) {
            case KeyEvent.VK_W:
                draw.setLocation(draw.getLocation().x,draw.getLocation().y-10);
                System.out.println("gora");
                break;
            case KeyEvent.VK_S:
                draw.setLocation(draw.getLocation().x,draw.getLocation().y+10);
                System.out.println("dol");
                break;
            case KeyEvent.VK_A:
                draw.setLocation(draw.getLocation().x-10,draw.getLocation().y);
                System.out.println("lewo");
                break;
            case KeyEvent.VK_D:
                draw.setLocation(draw.getLocation().x+10,draw.getLocation().y);
                System.out.println("prawo");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("");
    }
}
