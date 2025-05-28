package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.*;

import modele.Maison;
import modele.MaisonInternationale;
import modele.Nationnalite;
import vue.Etudiant.Profil.Profil;
import modele.FactoryCIUP;

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
			PanelFiltreButton _button = new PanelFiltreButton(alMaison.get(i).getNationalite().getNom());
			add(_button);
		}
		
		setLayout(new GridLayout(alMaison.size()+1, 1));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main (String[] arg) {
		
		FactoryCIUP facto = FactoryCIUP.getInstance();
		facto.CreationObjets();
		
		JFrame profil = new JFrame("Profil");
		profil.setSize(100, 300);
		profil.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelFiltre pf = new PanelFiltre(facto.getLesMaisons());
		
		profil.add(pf);
		profil.setVisible(true);
		
	}
}
