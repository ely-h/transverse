package vue.RestoU;
import modele.*; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.*;

import controller.RestoU.EcouteurComboBox;
import controller.RestoU.EcouteurRetour;

/**
 * Classe représentant la vue graphique des plats d'un menu RestoU
 * qui nous permet également de filtrer selon les allergènes
 * 
 * @author hassine
 */
public class VueDUnMenu extends JPanel{
	
	

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	/**
	 * Panel contenant les plats à afficher
	 */
	JPanel plats;
	/**
	 * ArrayList de chaines de caractères qui contiennent les différents allergènes et etiquettes disponibles
	 */
	ArrayList<String> lesFiltres;
	/**
	 * Référence au menu contenant les plats à afficher
	 */
	MenuRestoUParCategorie leMenu;
	/**
	 * Boutton retour
	 */
	JButton btnRetour;
	JPanel panelPrincipal;

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Constructeur de la classe VueDUnMenu.
	 * Initialise l'affichage des plats, configure la ComboBox et initialise l'arraylist des filtres
	 * 
	 * @param leMenu Le menu qu'on veut afficher
	 * 
	 */
	public VueDUnMenu(MenuRestoUParCategorie leMenu) {
		this.leMenu=leMenu;
		
		panelPrincipal=new JPanel();
		
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		lesFiltres=f.getLesFiltres();
		lesFiltres.add(0, "Tous");
		
		plats=new JPanel();
		this.plats.setLayout(new FlowLayout(FlowLayout.LEADING));
		for(Plat plat : leMenu.getSesPlats()) {
			this.plats.add(new VuePlat(plat));
			for(Allergene a: plat.getAllergenes()) {
				System.out.println(a.getNom());
			}
			for(Etiquette e : plat.getEtiquettes()) {
				System.out.println(e.getNom());
			}
			
		}
		this.panelPrincipal.setLayout(new BorderLayout());
		this.panelPrincipal.add(plats,BorderLayout.CENTER);
		
		String[] filtres=new String[lesFiltres.size()];
		filtres=this.lesFiltres.toArray(filtres);
		for(String s:filtres) {
			System.out.println(s);
		}
		
		JComboBox<String> box=new JComboBox<String>(filtres);
		box.setPreferredSize(new java.awt.Dimension(150,50));
		box.addActionListener(new EcouteurComboBox(this));
		JPanel p=new JPanel(new FlowLayout(FlowLayout.CENTER));
		p.setPreferredSize(new java.awt.Dimension(150,this.getHeight()));
		p.setBackground(new Color(78, 94, 99));
		
		
		
		this.btnRetour=new JButton("Retour");
		this.btnRetour.setPreferredSize(new java.awt.Dimension(150,50));
		this.btnRetour.addActionListener(new EcouteurRetour(this,f.getLesCategories()));
		p.add(btnRetour);
		p.add(box);
		this.panelPrincipal.add(p,BorderLayout.WEST);
		this.panelPrincipal.setBorder(BorderFactory.createEmptyBorder(0,0,0,150));
		this.setLayout(new GridLayout(1,1));
		this.add(panelPrincipal);
		
		
		
	}

	//--------------------------
	// MÉTHODES
	//--------------------------
	
	
	/**
	 * Fonction qui modifie le panel des plats et n'affiche que les plats qui contiennent une certaine chaine de caractère dans ses étiquettes ou allergènes.
	 * 
	 * @param filtre qui correspond à une chaine de caractère dans la ComboBox
	 */
	public void FiltrerPar(String filtre) {
	    this.plats.removeAll();

	    for (Plat plat : leMenu.getSesPlats()) {
	        if (filtre == null || filtre.equals("Tous") || platCorrespondAuFiltre(plat, filtre)) {
	            this.plats.add(new VuePlat(plat));
	        }
	    }

	    this.plats.revalidate();
	    this.plats.repaint();
	}

	/**
	 * Vérifie si un plat contient l'allergène ou l'étiquette correspondant au filtre.
	 * 
	 * @param plat   le plat à tester
	 * @param filtre le nom de l'allergène ou de l'étiquette
	 * @return true si le plat correspond au filtre
	 */
	private boolean platCorrespondAuFiltre(Plat plat, String filtre) {
	    // Vérifie dans les allergènes
	    for (Allergene allergene : plat.getAllergenes()) {
	        if (filtre.equalsIgnoreCase(allergene.getNom())) {
	            return true;
	        }
	    }

	    // Vérifie dans les étiquettes (si ce sont des Strings)
	    for (Etiquette etiquette : plat.getEtiquettes()) {
	        if (filtre.equalsIgnoreCase(etiquette.getNom())) {
	            return true;
	        }
	    }

	    return false;
	}

	
	public static void main(String[] args) {
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		JFrame fenetre=new JFrame();
		Toolkit tk = Toolkit.getDefaultToolkit();
		int xSize = ((int) tk.getScreenSize().getWidth());
		int ySize = ((int) tk.getScreenSize().getHeight());
		fenetre.setSize(xSize-100,ySize-100);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setVisible(true);
		JPanel test=new JPanel();
		test.setLayout(new BorderLayout());
		VueDUnMenu vueTest=new VueDUnMenu(f.getLesCategories().get(1));
		JScrollPane scrollPane = new JScrollPane(vueTest);
		
		test.add(scrollPane,BorderLayout.CENTER);
		
		fenetre.add(test);
	}
	

}
