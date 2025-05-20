package vue.RestoU;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import modele.*;

public class PanelCategoriesMenuRestoU extends JPanel{
	public static int ENTREES=0;
	public static int PLATS=1;
	public static int DESSERTS=2;
	public static int EXTRAS=3;
	
//	VueMenuRestoUParCategorie vueEntrees;
//	VueMenuRestoUParCategorie vuePlat;
//	VueMenuRestoUParCategorie vueDessert;
//	VueMenuRestoUParCategorie vueExtra;
	ArrayList<VueMenuRestoUParCategorie> lesVuesDeMenu;
	ArrayList<String> lesCheminsDesImages;
	
	public PanelCategoriesMenuRestoU(ArrayList<MenuRestoUParCategorie> lesMenus) throws IOException {
		this.lesVuesDeMenu=new ArrayList<VueMenuRestoUParCategorie>(lesMenus.size());
		
		this.inititializeLesImages();
		
		for(int i=0;i<this.lesCheminsDesImages.size();i++) {
			this.lesVuesDeMenu.add(new VueMenuRestoUParCategorie (lesMenus.get(i).getCategorie(),this.lesCheminsDesImages.get(i)));
			this.add(this.lesVuesDeMenu.get(i));
		}
		
		
	}
	
	private void inititializeLesImages() {
		this.lesCheminsDesImages=new ArrayList<String>(4);
		this.lesCheminsDesImages.add(ENTREES,"img/tartare-crevette.jpg");
		this.lesCheminsDesImages.add(PLATS,"img/spaghetti.jpg");
		this.lesCheminsDesImages.add(DESSERTS,"img/Raspberry-Mouse.jpg");
		this.lesCheminsDesImages.add(EXTRAS,"img/pizza.jpg");
		
	}
	
	public static void main(String[] args) {
		FactoryCIUP f=new FactoryCIUP();
		try {
			PanelCategoriesMenuRestoU vueTest=new PanelCategoriesMenuRestoU(f.getLesCategories());
			JFrame fenetre=new JFrame("Les Menus");
			fenetre.setSize(300,500);
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.add(vueTest);
			fenetre.setVisible(true);
		}
		catch (IOException e)
	}

}
