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
	private CompsInfo _label;
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelFiltre(ArrayList<Maison> alMaison){
		_label = new CompsInfo("Filtre");
		
		add(_label);
		
		for (int i=0; i < alMaison.size(); i++) {
			CompsButton _button = new CompsButton(alMaison.get(i).getNationalite().getNom());
			add(_button);
		}
		
		setLayout(new GridLayout(alMaison.size()+1, 1));
	}
}
