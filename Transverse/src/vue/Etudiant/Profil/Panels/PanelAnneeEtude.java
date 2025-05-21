package vue.Etudiant.Profil.Panels;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelAnneeEtude extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelAnneeEtude(int val){
		
		String s = Integer.toString(val); 
		
		_type = new JLabel("Année Étude : ");
		_valeur = new JLabel(s);
		
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
		
		PanelAnneeEtude p = new PanelAnneeEtude(5);
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
