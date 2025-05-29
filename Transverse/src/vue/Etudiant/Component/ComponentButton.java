package vue.Etudiant.Component;

import javax.swing.*;

public class ComponentButton extends JPanel{

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
	public ComponentButton(String s){
		_button = new JButton(s);
		
		add(_button);
	}
}
