package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.*;

import modele.Maison;
import modele.MaisonInternationale;
import modele.Nationnalite;
import vue.Etudiant.Profil.Profil;

public class PanelFiltre extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelFiltreLabel _label;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	PanelFiltre(ArrayList<Maison> alMaison){
		_label = new PanelFiltreLabel();
		
		add(_label);
		
		for (int i=0; i < alMaison.size(); i++) {
			PanelFiltreButton _button = new PanelFiltreButton(alMaison.get(i).getNationalite());
			add(_button);
		}
		
		setLayout(new GridLayout(alMaison.size()+1, 1));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main (String[] arg) {
		ArrayList<Maison> listeMaison = new ArrayList<Maison>();
		
		Nationnalite FR = new Nationnalite ("Française");
		Nationnalite ES = new Nationnalite ("Espagnole");			
		Nationnalite JP = new Nationnalite ("Japonaise");
		Nationnalite TN = new Nationnalite ("Tunisienne");
		Nationnalite KR = new Nationnalite ("Coréenne"); 
		Nationnalite INT = new Nationnalite ("Internationale"); 
	
		Maison maisonFrance = new Maison("Maison France", FR, 48, 2, 50);
		Maison maisonEspagne = new Maison("Maison Espagnole", ES, 40, -3, 30);
		Maison maisonJapon = new Maison("Maison Japon", JP, 35, 139, 40);
		Maison maisonTunisie = new Maison ("Maison Tunisie", TN, 36, 10, 35);
		Maison maisonCoree = new Maison ("Maison Coree", KR, 37, 127, 45);
		MaisonInternationale maisonInternationale = new MaisonInternationale ("Maison Internationale", INT, 0, 0, 100 );
		maisonInternationale.addService("bibliotheque");
		maisonInternationale.addService("RestoU");
		maisonInternationale.addService("Theatre");
		
		listeMaison.add(maisonFrance);
		listeMaison.add(maisonEspagne);
		listeMaison.add(maisonJapon);
		listeMaison.add(maisonTunisie);
		listeMaison.add(maisonCoree);
		listeMaison.add(maisonInternationale);
		
		JFrame profil = new JFrame("Profil");
		profil.setSize(100, 300);
		profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelFiltre pf = new PanelFiltre(listeMaison);
		
		profil.add(pf);
		profil.setVisible(true);
		
	}
	
	//---------------
	//METHODE
	//---------------
}
