package vue.Etudiant.Profil;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelNom _pNom;
	private PanelPrenom _pPrenom;
	private PanelMail _pMail;
	private PanelAnneeEtude _pAnnee;
	private PanelNationalitee _pNationalitee;
	private PanelLogement _pLogement;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelInfo(String nom, String prenom, String mail, int annee, String nationalitee, String logement){
		_pNom = new PanelNom(nom);
		_pPrenom = new PanelPrenom(prenom);
		_pMail = new PanelMail(mail);
		_pAnnee = new PanelAnneeEtude(annee);
		_pNationalitee = new PanelNationalitee(nationalitee);
		_pLogement = new PanelLogement(logement);
		
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
		
		PanelInfo p = new PanelInfo("Jones", "Felicia", "felicia.jones@gmail.com", 5, "USA House", "Américaine");
		
		frame.add(p);
		
		frame.setVisible(true);
	}
	//---------------
	//METHODE
	//---------------
}
