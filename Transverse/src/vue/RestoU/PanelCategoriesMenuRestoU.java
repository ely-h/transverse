package vue.RestoU;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import modele.*;
import vue.BandeHaut;

public class PanelCategoriesMenuRestoU extends JPanel{
	public static int ENTREES=0;
	public static int PLATS=1;
	public static int DESSERTS=2;
	public static int EXTRAS=3;
	
	protected ArrayList<VueMenuRestoUParCategorie> lesVuesDeMenu;
	protected ArrayList<String> lesCheminsDesImages;
	
	public PanelCategoriesMenuRestoU(ArrayList<MenuRestoUParCategorie> lesMenus) {
		this.lesVuesDeMenu=new ArrayList<VueMenuRestoUParCategorie>(lesMenus.size());
		
		this.inititializeLesImages();
		
		for(int i=0;i<this.lesCheminsDesImages.size();i++) {
			this.lesVuesDeMenu.add(new VueMenuRestoUParCategorie (lesMenus.get(i).getCategorie(),this.lesCheminsDesImages.get(i)));
			this.add(this.lesVuesDeMenu.get(i));
		}
		GridLayout grid=new GridLayout(1,4);
		this.setLayout(grid);
		grid.setHgap(20);
		Border empty = new EmptyBorder(100, 200, 100, 200);
		this.setBorder(empty);
		
		
		
		
	}
	
	private void inititializeLesImages() {
		this.lesCheminsDesImages=new ArrayList<String>(4);
		this.lesCheminsDesImages.add(ENTREES,"img/tartare-crevette.jpg");
		this.lesCheminsDesImages.add(PLATS,"img/spaghetti.jpg");
		this.lesCheminsDesImages.add(DESSERTS,"img/Raspberry-Mousse.jpg");
		this.lesCheminsDesImages.add(EXTRAS,"img/pizza.jpg");
		
	}
	
	public static void main(String[] args) {
		FactoryCIUP f=FactoryCIUP.getInstance();
		f.CreationObjets();
		
			PanelCategoriesMenuRestoU vueTest=new PanelCategoriesMenuRestoU(f.getLesCategories());
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
