package vue.RestoU;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import controller.RestoU.EcouteurChangementMenu;
import modele.*;

public class PanelCategoriesMenuRestoU extends JPanel{

	//--------------------------
	// CONSTANTES
	//--------------------------
	public static int ENTREES=0;
	public static int PLATS=1;
	public static int DESSERTS=2;
	public static int EXTRAS=3;

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	protected ArrayList<VueMenuRestoUParCategorie> lesVuesDeMenu;
	protected ArrayList<String> lesCheminsDesImages;
	protected JPanel panelPrincipal;
	

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	public PanelCategoriesMenuRestoU() {
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		this.lesVuesDeMenu=new ArrayList<VueMenuRestoUParCategorie>(f.getLesCategories().size());
		
		this.inititializeLesImages();
		
		GridLayout grid=new GridLayout(1,4);
		this.panelPrincipal=new JPanel(grid);
		for(int i=0;i<this.lesCheminsDesImages.size();i++) {
			VueMenuRestoUParCategorie vue=new VueMenuRestoUParCategorie (f.getLesCategories().get(i),this.lesCheminsDesImages.get(i));
			vue.getBoutton().addActionListener(new EcouteurChangementMenu(this,f.getLesCategories().get(i)));
			this.lesVuesDeMenu.add(vue);
			this.panelPrincipal.add(this.lesVuesDeMenu.get(i));
		}
		grid.setHgap(20);
		Border empty = new EmptyBorder(100, 200, 100, 200);
		this.panelPrincipal.setBorder(empty);
		
		this.setLayout(new BorderLayout());
		this.add(panelPrincipal,BorderLayout.CENTER);
		
		
		
		
	}

	//--------------------------
	// METHODES
	//--------------------------
	
	private void inititializeLesImages() {
		this.lesCheminsDesImages=new ArrayList<String>(4);
		this.lesCheminsDesImages.add(ENTREES,"img/tartare-crevette.jpg");
		this.lesCheminsDesImages.add(PLATS,"img/spaghetti.jpg");
		this.lesCheminsDesImages.add(DESSERTS,"img/Raspberry-Mousse.jpg");
		this.lesCheminsDesImages.add(EXTRAS,"img/pizza.jpg");
		
	}
	
	public static void main(String[] args) {
		
			PanelCategoriesMenuRestoU vueTest=new PanelCategoriesMenuRestoU();
			JFrame fenetre=new JFrame("Les Menus");
			Toolkit tk = Toolkit.getDefaultToolkit();
			int xSize = ((int) tk.getScreenSize().getWidth());
			int ySize = ((int) tk.getScreenSize().getHeight());
			fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
			fenetre.setSize(xSize,ySize);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JPanel panelGlobal=new JPanel(new BorderLayout());
			panelGlobal.add(vueTest,BorderLayout.CENTER);
			fenetre.add(panelGlobal);
			fenetre.setVisible(true);
		
	}

}
