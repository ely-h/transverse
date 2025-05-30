package vue.RestoU;
import modele.*;

import java.awt.BorderLayout;

import javax.swing.*;

public class PageMenusRestoU extends JPanel{
	//--------------------------
	// ATTRIBUTS
	//--------------------------

	PanelCategoriesMenuRestoU lesCategories;
	
	public PageMenusRestoU() {
		this.setLayout(new BorderLayout());
		
		FactoryCIUP facto=FactoryCIUP.getInstance();
		facto.CreationObjets();
		lesCategories=new PanelCategoriesMenuRestoU(facto.getLesCategories());
		
		this.add(lesCategories,BorderLayout.CENTER);
		
	}
	

}
