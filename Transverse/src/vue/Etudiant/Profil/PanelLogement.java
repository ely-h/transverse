package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelLogement extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	JLabel _type;
	JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelLogement(String val){
		_type = new JLabel("Logement : ");
		_valeur = new JLabel(val);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void mainPanelNom (String arg[]) {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(50, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelLogement p = new PanelLogement("USA House");
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
