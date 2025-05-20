package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelMail extends JPanel{


	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _type;
	private JLabel _valeur;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelMail(String val){
		_type = new JLabel("Mail : ");
		_valeur = new JLabel(val);
		
		add(_type);
		add(_valeur);
		
		setLayout(new GridLayout(1,2));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void mainPanelMail(String arg[]) {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(50, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelMail p = new PanelMail("felicia.jones@gmail.com");
		
		frame.add(p);
		
		frame.setVisible(true);
	}

}
