package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class CompsButtonTitle extends JPanel{
	//---------------
	//ATTRIBUTS
	//---------------
	private CompsInfo _title;
	private CompsButton _button;
	
	//---------------
	//ACCESSEUR
	//---------------
	public JButton getButton() {return _button.getButton();}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	public CompsButtonTitle(String title, String val){
		_title = new CompsInfo(title);
		_button = new CompsButton(val);
		
		add(_title);
		add(_button);
		
		setLayout(new GridLayout(2, 1, 3, 3));
	}
}
