package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class CompsTextField extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JTextField _valeur;
	
	//---------------
	//ACCESSEUR
	//---------------
	public JTextField getTextField() {return  _valeur;}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public CompsTextField(){ 
		_valeur = new JTextField(20);
		
		add(_valeur);
	}

	public CompsTextField(String type){ 
		
		_type = new JLabel(type);
		_valeur = new JTextField(20);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
}
