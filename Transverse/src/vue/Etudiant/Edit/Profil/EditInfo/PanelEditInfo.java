package vue.Etudiant.Edit.Profil.EditInfo;

import java.awt.GridLayout;
import javax.swing.*;

public class PanelEditInfo extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelModification _pNom;
	private PanelModification _pPrenom;
	private PanelModification _pMail;
	private PanelModification _pAnnee;
	private PanelModification _pNationalitee;
	private PanelModification _pLogement;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelEditInfo(){
		_pNom = new PanelModification("Nom :");
		_pPrenom = new PanelModification("Prénom :");
		_pMail = new PanelModification("Mail :");
		_pAnnee = new PanelModification("Année Étude :");
		_pNationalitee = new PanelModification("Nationalitée :");
		_pLogement = new PanelModification("Logement :");
		
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
		
		PanelEditInfo p = new PanelEditInfo();
		
		frame.add(p);
		
		frame.setVisible(true);
	}
	//---------------
	//METHODE
	//---------------
}
