package vue.Etudiant.Edit.Profil.EditInfo;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelModification extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JTextField _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelModification(String type){ 
		
		_type = new JLabel(type);
		_valeur = new JTextField(20);
		
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
		
		PanelModification p = new PanelModification("Modifie");
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
