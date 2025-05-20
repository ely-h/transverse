package vue.Etudiant.Liste.EtuDisplayData;

import javax.swing.*;

import vue.Etudiant.Liste.PanelLigneEtudiant;

public class PanelAnnee extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _annee;

	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelAnnee(int annee){
		_annee = new JLabel(String.valueOf(annee));
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		JFrame liste = new JFrame("liste");
		liste.setSize(700, 300);
		liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelAnnee pa = new PanelAnnee(5);
		
		liste.add(pa);
		liste.setVisible(true);
		
}

}
