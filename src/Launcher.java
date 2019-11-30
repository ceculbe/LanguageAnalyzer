import javax.swing.JFrame;

public class Launcher {

  public static void main(String[] args) {
    JFrame f = new JFrame("Put Frame Title Here"); 
    GUIPanel p = new GUIPanel();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.add(p);
    f.pack();
    f.setVisible(true);
  }
}