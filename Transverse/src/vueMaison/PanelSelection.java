package vueMaison;
import javax.swing.*;
import java.awt.GridLayout;

public class PanelSelection extends JPanel{
	JLabel label;
	JCheckBox checkbox;
	
	PanelSelection( String cbxNom, String imgNom)
	{
		label = new JLabel();	
		label.setIcon(new ImageIcon (imgNom +".jpg"));
		checkbox = new JCheckBox(cbxNom);

		setLayout(new GridLayout(3,1));
		add(label);
		add(checkbox);
	}
}
