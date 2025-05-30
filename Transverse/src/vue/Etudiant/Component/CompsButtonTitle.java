package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class CompsButtonTitle extends JPanel{
	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _title;
	private JButton _button;
	
	//---------------
	//ACCESSEUR
	//---------------
	public JButton getButton() {return _button;}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	public CompsButtonTitle(String title, String val){
		_title = new JLabel(title);
		_button = new JButton(val);
		
		add(_title);
		add(_button);
		
		setLayout(new GridLayout(2, 1, 3, 3));
	}
}
