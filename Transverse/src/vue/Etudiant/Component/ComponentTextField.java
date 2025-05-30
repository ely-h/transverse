package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class ComponentTextField extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JTextField _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public ComponentTextField(){ 
		_valeur = new JTextField(20);
		
		add(_valeur);
	}

	public ComponentTextField(String type){ 
		
		_type = new JLabel(type);
		_valeur = new JTextField(20);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
}
