package vue.RestoU;
import modele.*; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.*;

import controller.RestoU.EcouteurComboBox;

/**
 * Classe représentant la vue graphique des plats d'un menu RestoU
 * qui nous permet également de filtrer selon les allergènes
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

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	/**
	 * Constructeur de la classe VueDUnMenu.
	 * Initialise l'affichage des plats, configure la ComboBox et initialise l'arraylist des filtres
	 */
	public VueDUnMenu(MenuRestoUParCategorie leMenu) {
		this.leMenu=leMenu;
		
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		lesFiltres=f.getLesFiltres();
		lesFiltres.add(0, "Tous");
		
		plats=new JPanel();
		this.plats.setLayout(new FlowLayout(FlowLayout.LEADING));
		for(Plat plat : leMenu.getSesPlats()) {
			this.plats.add(new VuePlat(plat));
		}
		this.setLayout(new BorderLayout());
		this.add(plats,BorderLayout.CENTER);
		
		String[] filtres=new String[lesFiltres.size()];
		filtres=this.lesFiltres.toArray(filtres);
		
		JComboBox<String> box=new JComboBox<String>(filtres);
		box.setPreferredSize(new java.awt.Dimension(150,50));
		box.addActionListener(new EcouteurComboBox(this));
		JPanel p=new JPanel(new FlowLayout());
		p.add(box);
		p.setBackground(new Color(78, 94, 99));
		this.add(p,BorderLayout.WEST);
		this.setBorder(BorderFactory.createEmptyBorder(0,0,0,150));
		
		
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
		if(filtre==null|| filtre.equals("Tous")) {
			for(Plat plat : leMenu.getSesPlats()) {
				this.plats.add(new VuePlat(plat));
			}
		}
		else {
			for(Plat plat:leMenu.getSesPlats()) {
				if(plat.getAllergenes().contains(filtre)||plat.getEtiquettes().contains(filtre)) {
					this.plats.add(new VuePlat(plat));
				}
			}
			
		}
		this.plats.revalidate();
		this.plats.repaint();
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
