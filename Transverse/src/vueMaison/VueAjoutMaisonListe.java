package vueMaison;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*; 

public class VueAjoutMaisonListe extends JPanel{


	
	
	
	
	
	public static void main(String[] args) {
		JPanel panelMaisons = new JPanel();
		
		PanelSelection maisonInternationale = new PanelSelection( "Maison Internationale", "maison-internationale");
		PanelSelection maisonFR = new PanelSelection( "Maison France", "maison-france");
		PanelSelection maisonES = new PanelSelection( "Maison Espagne", "maison-espagne");
		PanelSelection maisonJP = new PanelSelection( "Maison Japon", "maison-japon");
		PanelSelection maisonTU = new PanelSelection( "Maison Tunisie", "maison-tunisie");

		/*JLabel lblInter = new JLabel("");
		lblInter.setIcon(new ImageIcon ("maison-internationale.jpg"));
		
		JLabel lblFR = new JLabel("");
		lblFR.setIcon(new ImageIcon ("maison-france.jpg"));
		
		JLabel lblES = new JLabel("");
		lblES.setIcon(new ImageIcon ("maison-espagne.jpg"));
		
		JLabel lblJP = new JLabel("");
		lblJP.setIcon(new ImageIcon ("maison-japon.jpg"));
		
		JLabel lblTUN = new JLabel("");
		lblTUN.setIcon(new ImageIcon ("maison-tunisie.jpg"));*/

		
		/*JCheckBox cbxInter = new JCheckBox("Maison Internationale");
		JCheckBox cbxFRA = new JCheckBox("Maison France");
		JCheckBox cbxES = new JCheckBox("Maison Espagne");
		JCheckBox cbxJP = new JCheckBox("Maison japon");
		JCheckBox cbxTUN = new JCheckBox("Maison Tunisie");*/
		
		
		///FENETRE
		JFrame fenetre;
		fenetre = new JFrame ("Calcul Perimètre");
		fenetre.setSize(2400,1080);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		fenetre.add(maisonInternationale);
		fenetre.add(maisonFR);
		fenetre.add(maisonES);
		fenetre.add(maisonJP);
		fenetre.add(maisonTU);
		
		//fenetre.setResizable(false);
		
		//PanelSelection maisonInternationale = new PanelSelection
		
	}
}
