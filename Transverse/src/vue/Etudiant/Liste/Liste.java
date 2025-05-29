package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.BorderLayout;
import java.util.*;

import modele.FactoryCIUP;
import modele.Maison;
import vue.Etudiant.Liste.Filtre.PanelFiltre;

public class Liste extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelFiltre _pFiltre;
	private PanelLigneEtudiant _pLigneEtu;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	Liste(ArrayList<Maison> alMaison){
		_pFiltre = new PanelFiltre(alMaison);
		_pLigneEtu = new PanelLigneEtudiant("Jones", "Felicia", "Amerique", 5);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		FactoryCIUP facto = FactoryCIUP.getInstance();
		facto.CreationObjets();
		
		
		JFrame liste = new JFrame("liste");
		liste.setSize(700, 300);
		liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Liste pl = new Liste(facto.getLesMaisons());
		
		liste.add(pl);
		liste.setVisible(true);
	}
}
