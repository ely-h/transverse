package vue.Etudiant.Liste.ListeEtudiant.EtuDisplayData;

import javax.swing.*;

import vue.Etudiant.Liste.ListeEtudiant.PanelLigneEtudiant;

public class PanelNom extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _nom;

	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelNom(String nom){
		_nom = new JLabel(nom);
		add(_nom);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		JFrame liste = new JFrame("liste");
		liste.setSize(50, 100);
		liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelNom pn = new PanelNom("Johns");
		
		liste.add(pn);
		liste.setVisible(true);
		
}

}
