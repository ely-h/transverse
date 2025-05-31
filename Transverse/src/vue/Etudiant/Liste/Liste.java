package vue.Etudiant.Liste;

import javax.swing.*;

import controller.RestoU.*;

import java.awt.BorderLayout;
import java.io.IOException;
import java.util.*;

import modele.FactoryCIUP;
import modele.Maison;
import modele.Etudiant;
import vue.Etudiant.PanelRetour;
import vue.Etudiant.Liste.ListeEtudiant.PanelListeEtudiant;

public class Liste extends JPanel{

	//---------------
	//ATTRIBUTS
	//---------------
	private PanelFiltre _pFiltre;
	private PanelListeEtudiant _pListeEtu;
	
	//---------------
	//CONSTRUCTEUR
	//---------------
	public Liste(ArrayList<Maison> alMaison, ArrayList<Etudiant> alEtu) throws IOException{
		_pFiltre = new PanelFiltre(alMaison);
		_pListeEtu = new PanelListeEtudiant(alEtu);
		
		setLayout(new BorderLayout());
		
		PanelRetour bouttonRetour=new PanelRetour ();
		add(bouttonRetour,BorderLayout.LINE_START);
		
		bouttonRetour.getButton().addActionListener(new EcouteurRetour((JPanel)this));
		add(_pFiltre, BorderLayout.WEST);
		add(_pListeEtu, BorderLayout.CENTER);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg){
		try {
			FactoryCIUP facto = FactoryCIUP.getInstance();
			facto.CreationObjets();
			
			
			JFrame liste = new JFrame("liste");
			liste.setSize(700, 300);
			liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			Liste pl = new Liste(facto.getLesMaisons(), facto.getLesEtudiants());
			
			liste.add(pl);
			liste.setVisible(true);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
}
