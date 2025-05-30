package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class CompsInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JLabel _valeur;
	
	//---------------
	//CONSTRUCTEURS
	//---------------
	public CompsInfo(String val){
		_valeur = new JLabel(val);
		add(_valeur);
	}
	
	public CompsInfo(int val){
		_valeur = new JLabel(String.valueOf(val));
		add(_valeur);
	}
	
	
	public CompsInfo(String type, int val){
		_type = new JLabel(type + " : ");
		_valeur = new JLabel(Integer.toString(val));
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
	
	public CompsInfo(String type, String val){
		_type = new JLabel(type + " : ");
		_valeur = new JLabel(val);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
}
