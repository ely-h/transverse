package vue.Etudiant.Component;

import java.awt.GridLayout;
import javax.swing.*;

public class CompsButtonTitle extends JPanel{
	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _title;
	private JButton _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	public CompsButtonTitle(String title, String val){
		_title = new JLabel(title);
		_valeur = new JButton(val);
		
		add(_title);
		add(_valeur);
		
		setLayout(new GridLayout(2, 1, 3, 3));
	}
}
