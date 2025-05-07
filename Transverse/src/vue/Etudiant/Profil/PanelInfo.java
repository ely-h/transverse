package vue.Etudiant.Profil;

import javax.swing.*;

public class PanelInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	PanelText _pt1;
	PanelText _pt2;
	PanelText _pt3;
	PanelText _pt4;
	PanelText _pt5;
	PanelText _pt6;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelInfo(String typePT1, String valPT1, String typePT2, String valPT2, String typePT3, String valPT3, String typePT4, String valPT4, String typePT5, String valPT5, String typePT6, String valPT6){
		_pt1 = new PanelText(typePT1, valPT1);
		_pt2 = new PanelText(typePT2, valPT2);
		_pt3 = new PanelText(typePT3, valPT3);
		_pt4 = new PanelText(typePT4, valPT4);
		_pt5 = new PanelText(typePT5, valPT5);
		_pt6 = new PanelText(typePT6, valPT6);
		
		add(_pt1);
		add(_pt2);
		add(_pt3);
		add(_pt4);
		add(_pt5);
		add(_pt6);
	}
	//---------------
	//MAIN
	//---------------
	public static void main (String arg[]) {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelInfo p = new PanelInfo("Nom", "Jones", "Prénom", "Felicia", "Mail", "felicia.jones@gmail.com", "Année d'étude", "5", "Logement", "USA House", "Nationalité", "Américaine");
		
		frame.add(p);
		
		frame.setVisible(true);
	}
	//---------------
	//METHODE
	//---------------
}
