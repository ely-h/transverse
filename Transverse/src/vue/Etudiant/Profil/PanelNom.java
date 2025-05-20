package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelNom extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelNom(String val){
		_type = new JLabel("Nom : ");
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
		
		PanelNom p = new PanelNom("Jones");
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
