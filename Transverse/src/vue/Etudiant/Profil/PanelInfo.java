package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	PanelNom _pNom;
	PanelPrenom _pPrenom;
	PanelMail _pMail;
	PanelAnneeEtude _pAnnee;
	PanelNationalitee _pNationalitee;
	PanelLogement _pLogement;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelInfo(String valPT1, String valPT2, String valPT3, String valPT4, String valPT5, String valPT6){
		_pNom = new PanelNom(valPT1);
		_pPrenom = new PanelPrenom(valPT2);
		_pMail = new PanelMail(valPT3);
		_pAnnee = new PanelAnneeEtude(valPT4);
		_pNationalitee = new PanelNationalitee(valPT5);
		_pLogement = new PanelLogement(valPT6);
		
		add(_pNom);
		add(_pPrenom);
		add(_pMail);
		add(_pAnnee);
		add(_pNationalitee);
		add(_pLogement);
		
		setLayout(new GridLayout(6,1));
	}
	//---------------
	//MAIN
	//---------------
	public static void main (String arg[]) {
		JFrame frame = new JFrame ("Frame");
		frame.setSize(250, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelInfo p = new PanelInfo("Jones", "Felicia", "felicia.jones@gmail.com", "5", "USA House", "Américaine");
		
		frame.add(p);
		
		frame.setVisible(true);
	}
	//---------------
	//METHODE
	//---------------
}
