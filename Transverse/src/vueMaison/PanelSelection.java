package vueMaison;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PanelSelection extends JFrame {
	JLabel l;
	
	PanelSelection(String s1, String s2){
		l = new JLabel(s1);
		l.setIcon(new ImageIcon(s2));
		add(l);
	}
}
