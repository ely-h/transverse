package vue.Etudiant.Liste.ListeEtudiant;

import javax.swing.*;
import java.awt.GridLayout;
import java.io.IOException;
import java.util.*;

import modele.Etudiant;

public class PanelListeEtudiant extends JPanel{
	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelListeEtudiant(ArrayList<Etudiant> _lE) throws IOException{
		
		for(int i=0; i<_lE.size();i++) {
			add(new PanelLigneEtudiant(_lE.get(i)));
		}
		
		setLayout(new GridLayout(_lE.size(),1));
	}
}