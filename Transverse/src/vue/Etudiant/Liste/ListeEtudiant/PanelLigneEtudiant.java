package vue.Etudiant.Liste.ListeEtudiant;

import javax.swing.*;
import java.awt.GridLayout;

import modele.Etudiant;
import modele.FactoryCIUP;
import controller.Etudiant.ListenerBoutonProfil;
import vue.Etudiant.Liste.ListeEtudiant.EtuDisplayData.*;

public class PanelLigneEtudiant extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelButton _button;
	private PanelNom _nom;
	private PanelPrenom _prenom;
	private PanelPays _pays;
	private PanelAnnee _annee;
	private ListenerBoutonProfil _lbp;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	
	PanelLigneEtudiant(Etudiant e0){
		_button = new PanelButton();
		_nom = new PanelNom(e0.get_nom());
		_prenom = new PanelPrenom(e0.get_prenom());
		_pays = new PanelPays(e0.get_saNationnalite().getNom());
		_annee = new PanelAnnee(e0.get_anneeEtude());
		
		_lbp = new ListenerBoutonProfil();
		 
		 _button.getButton().addActionListener(_lbp);
		 
		add(_button);
		add(_nom);
		add(_prenom);
		add(_pays);
		add(_annee);
		
		setLayout(new GridLayout(1,6));
	}
	
	
	/*Constructeur utilisé lors du développement et des tests
	 * 
	 * PanelLigneEtudiant(String nom, String prenom, String pays, int annee){
		_button = new PanelButton();
		_nom = new PanelNom(nom);
		_prenom = new PanelPrenom(prenom);
		_pays = new PanelPays(pays);
		_annee = new PanelAnnee(annee);
		
		
		 _lbp = new ListenerBoutonProfil();
		 
		 _button.getButton().addActionListener(_lbp);
		 
		add(_button);
		add(_nom);
		add(_prenom);
		add(_pays);
		add(_annee);
		
		setLayout(new GridLayout(1,6));
	}*/
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		FactoryCIUP facto = FactoryCIUP.getInstance();
		facto.CreationObjets();
		
			JFrame liste = new JFrame("liste");
			liste.setSize(500, 100);
			liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			PanelLigneEtudiant ple = new PanelLigneEtudiant(facto.getLesEtudiants().get(1));
			
			liste.add(ple);
			liste.setVisible(true);
			
	}
	
	//---------------
	//METHODE
	//---------------
}
