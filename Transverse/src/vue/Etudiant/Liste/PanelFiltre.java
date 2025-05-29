package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.*;

import modele.Maison;
import modele.FactoryCIUP;
import vue.Etudiant.Component.*;

public class PanelFiltre extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private ComponentInfo _label;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelFiltre(ArrayList<Maison> alMaison){
		_label = new ComponentInfo("Filtre");
		
		add(_label);
		
		for (int i=0; i < alMaison.size(); i++) {
			ComponentButton _button = new ComponentButton(alMaison.get(i).getNationalite().getNom());
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
