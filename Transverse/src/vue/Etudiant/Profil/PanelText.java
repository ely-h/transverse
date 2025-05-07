package vue.Etudiant.Profil;

import javax.swing.*;

public class PanelText extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	JLabel _type;
	JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//Overload pour prendre en charge les différents type des attributs d un etudiant
	//---------------
	
	
	/* Trouver un moyen de convertir le int en string
	 * 
	 * cast : marche pas
	 * toString() : marche pas
	 * 
	 * PanelText(String type, int val ){
		_type = new JLabel(type);
		_valeur = new JLabel();
	}
	*/
	
	
	PanelText(String type, String val){
		
		type += " : ";
		
		_type = new JLabel(type);
		_valeur = new JLabel(val);
		
		add(_type);
		add(_valeur);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main (String arg[]) {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(50, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelText p = new PanelText("Nom", "Fitzgerald");
		
		frame.add(p);
		
		frame.setVisible(true);
	}
}
