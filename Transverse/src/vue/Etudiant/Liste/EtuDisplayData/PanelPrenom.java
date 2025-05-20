package vue.Etudiant.Liste.EtuDisplayData;

import javax.swing.*;

import vue.Etudiant.Liste.PanelLigneEtudiant;

public class PanelPrenom extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _prenom;

	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelPrenom(String prenom){
		_prenom = new JLabel(prenom);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		JFrame liste = new JFrame("liste");
		liste.setSize(700, 300);
		liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelPrenom pp = new PanelPrenom("Felicia");
		
		liste.add(pp);
		liste.setVisible(true);
		
}

}
