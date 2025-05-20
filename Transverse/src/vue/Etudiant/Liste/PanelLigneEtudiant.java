package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.GridLayout;
import java.io.IOException;

import vue.Etudiant.Liste.EtuDisplayData.*;
import vue.Etudiant.Profil.Profil;


public class PanelLigneEtudiant extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private JButton _button;
	private PanelNom _nom;
	private PanelPrenom _prenom;
	private PanelPays _pays;
	private PanelAnnee _annee;
	
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelLigneEtudiant(String nom, String prenom, String pays, int annee){
		_button = new JButton("Profil");
		_nom = new PanelNom(nom);
		_prenom = new PanelPrenom(prenom);
		_pays = new PanelPays(pays);
		_annee = new PanelAnnee(annee);
		
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
			JFrame liste = new JFrame("liste");
			liste.setSize(500, 100);
			liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			PanelLigneEtudiant ple = new PanelLigneEtudiant("Jones", "Felicia", "Amerique", 5);
			
			liste.add(ple);
			liste.setVisible(true);
			
	}
	
	//---------------
	//METHODE
	//---------------
}
