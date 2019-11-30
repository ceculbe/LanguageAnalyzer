import java.awt.*;
import javax.swing.*;

public class GUIPanel extends JPanel{
  static final long serialVersionUID = 1;

  public GUIPanel(){
    setPreferredSize(new Dimension(250,200));
    setBackground(Color.BLACK);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.setColor(Color.WHITE);
    g.drawRect(80,20,100,20);
    g.drawString("Hello World!",100,35);
    }
}