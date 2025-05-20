package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.*;

import modele.Maison;

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
	
	//---------------
	//METHODE
	//---------------
}
