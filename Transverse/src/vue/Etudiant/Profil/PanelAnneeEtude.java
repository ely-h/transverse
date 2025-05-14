package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelAnneeEtude extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	JLabel _type;
	JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelAnneeEtude(String val){
		_type = new JLabel("Année Étude : ");
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
		
		PanelAnneeEtude p = new PanelAnneeEtude("5");
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
