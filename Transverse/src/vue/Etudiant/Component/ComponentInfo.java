package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class ComponentInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JLabel _valeur;
	
	//---------------
	//CONSTRUCTEURS
	//---------------
	public ComponentInfo(String val){
		_valeur = new JLabel(val);
		add(_valeur);
	}
	
	public ComponentInfo(int val){
		_valeur = new JLabel(String.valueOf(val));
		add(_valeur);
	}
	
	
	public ComponentInfo(String type, int val){
		_type = new JLabel(type + " : ");
		_valeur = new JLabel(Integer.toString(val));
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
	
	public ComponentInfo(String type, String val){
		_type = new JLabel(type + " : ");
		_valeur = new JLabel(val);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
}
