package vueMaison;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.io.IOException; 

public class VueAjoutMaisonListe extends JPanel{
	
	public static void main(String[] args) {
		JPanel panelMaisons = new JPanel();
		GridLayout gridLayout  = new GridLayout(2,5);
		gridLayout.setHgap(15);
		gridLayout.setVgap(10);
		panelMaisons.setLayout(gridLayout);
		
		JPanel panelTitre = new JPanel();
		
		JPanel panelConfirmation = new JPanel();
		
		JPanel panelPrincipal = new JPanel(new BorderLayout());
		

		try 
		{
		PanelSelection maisonInternationale = new PanelSelection( "Maison Internationale", "img/maison-internationale");
		PanelSelection maisonFR = new PanelSelection( "Maison France", "img/maison-france");
		PanelSelection maisonES = new PanelSelection( "Maison Espagne", "img/maison-espagne");
		PanelSelection maisonJP = new PanelSelection( "Maison Japon", "img/maison-japon");
		PanelSelection maisonTU = new PanelSelection( "Maison Tunisie", "img/maison-tunisie");
		
		JFrame fenetre;
		fenetre = new JFrame ("Calcul Perimètre");
		fenetre.setSize(500,200);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		panelMaisons.add(maisonInternationale);
		panelMaisons.add(maisonFR);
		panelMaisons.add(maisonES);
		panelMaisons.add(maisonJP);
		panelMaisons.add(maisonTU);
		panelPrincipal.add(panelMaisons, BorderLayout.CENTER);
		fenetre.add(panelPrincipal);
		} catch (IOException e) {
			e.printStackTrace();
		}

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

		
		//fenetre.setResizable(false);
		
		//PanelSelection maisonInternationale = new PanelSelection
		
	}
}
