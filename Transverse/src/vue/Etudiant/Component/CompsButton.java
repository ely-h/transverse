package vue.Etudiant.Component;

import javax.swing.*;

public class CompsButton extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _button;
	
	//---------------
	//ACCESSEUR
	//---------------
	public JButton getButton() {return _button;}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public CompsButton(String s){
		_button = new JButton(s);
		
		add(_button);
	}
}
