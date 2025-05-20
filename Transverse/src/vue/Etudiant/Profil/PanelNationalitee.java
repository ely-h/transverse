package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelNationalitee extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelNationalitee(String val){
		_type = new JLabel("Nationalitée : ");
		_valeur = new JLabel(val);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void mainPanelNationalitee(String arg[]) {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(50, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelNationalitee p = new PanelNationalitee("Américaine");
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
