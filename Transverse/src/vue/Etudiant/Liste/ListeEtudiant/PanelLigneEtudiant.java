package vue.Etudiant.Liste.ListeEtudiant;

import javax.swing.*;
import java.awt.GridLayout;
import java.io.IOException;

import modele.Etudiant;
import modele.FactoryCIUP;
import controller.Etudiant.ListenerBoutonProfil;
import vue.Etudiant.Liste.ListeEtudiant.EtuDisplayData.*;
import vue.Etudiant.Profil.Profil;

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
	private Etudiant _etudiant;
	private Profil _profil;
	
	//---------------
	//ACCESSEUR
	//---------------
	public Etudiant getEtudiant() {return _etudiant;}
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelLigneEtudiant(Etudiant e0) throws IOException{
		_button = new PanelButton();
		_nom = new PanelNom(e0.get_nom());
		_prenom = new PanelPrenom(e0.get_prenom());
		_pays = new PanelPays(e0.get_saNationnalite().getNom());
		_annee = new PanelAnnee(e0.get_anneeEtude());
		_etudiant = e0;
		_profil = new Profil(e0);
		
		_lbp = new ListenerBoutonProfil();
		 
		 _button.getButton().addActionListener(_lbp);
		 
		add(_button);
		add(_nom);
		add(_prenom);
		add(_pays);
		add(_annee);
		
		setLayout(new GridLayout(1,6));
	}

	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		try {
			FactoryCIUP facto = FactoryCIUP.getInstance();
			facto.CreationObjets();
		
			JFrame liste = new JFrame("liste");
			liste.setSize(500, 100);
			liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			PanelLigneEtudiant ple = new PanelLigneEtudiant(facto.getLesEtudiants().get(1));
			
			liste.add(ple);
			liste.setVisible(true);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	//---------------
	//METHODE
	//---------------
	public void displayProfil() {
		_profil.openProfil();
	}
}
