package vue.Etudiant.Component;

import java.awt.Color;

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
		_button.setBackground(new Color(78, 94, 99));
		_button.setForeground(Color.WHITE);
		
		add(_button);
	}
}
