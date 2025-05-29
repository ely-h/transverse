package vue.Etudiant.Liste.ListeEtudiant.EtuDisplayData;

import javax.swing.*;

import vue.Etudiant.Liste.ListeEtudiant.PanelLigneEtudiant;

public class PanelPays extends JPanel {

	//---------------
	//ATTRIBUTS
	//---------------
	private JLabel _pays;

	//---------------
	//CONSTRUCTEUR
	//---------------
	public PanelPays(String pays){
		_pays = new JLabel(pays);
		add(_pays);
	}
	
	//---------------
	//MAIN
	//---------------
	public static void main(String[] arg) {
		JFrame liste = new JFrame("liste");
		liste.setSize(700, 300);
		liste.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		PanelPays pp = new PanelPays("Amérique");
		
		liste.add(pp);
		liste.setVisible(true);
		
}

}
