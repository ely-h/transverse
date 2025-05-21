package vue.Etudiant.Liste;

import javax.swing.*;
import java.awt.GridLayout;
import java.util.*;

import modele.Maison;

public class Liste extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelFiltre _pFiltre;
	
	
	//---------------
	//ACCESSEUR
	//---------------
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	Liste(ArrayList<Maison> alMaison){
		_pFiltre = new PanelFiltre(alMaison);
	
		add(_pFiltre);
		
		setLayout(new GridLayout(1,2));
	}
	
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		
	}
}
