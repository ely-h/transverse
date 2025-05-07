package vueMaison;
import javax.swing.JButton;
import javax.swing.JPanel;

public class PanelBouton extends JPanel {
	JButton b;
	
	PanelBouton(String s) {
		b = new JButton(s);
		add(b);
	}
}
