package vueMaison;
import javax.swing.JFrame;
import javax.swing.JCheckBox;

public class PanelCheckbox extends JFrame {
	JCheckBox c;
	
	PanelCheckbox(String s) {
		c = new JCheckBox(s);
		add(c);
	}
}
