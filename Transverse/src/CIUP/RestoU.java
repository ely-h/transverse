package CIUP;

import java.util.ArrayList;

//C'est la classe mère du menu restoU
public class RestoU {
	Maison saMaison;
	private ArrayList<MenuRestoUParCategorie> sesCategories = new ArrayList();

	public Maison getSaMaison() {
		return saMaison;
	}

	public void setSaMaison(Maison saMaison) {
		this.saMaison = saMaison;
	}
	
	public RestoU(Maison maison) {
		this.saMaison = maison;
	}
	
	public void addCategorieRestoU(MenuRestoUParCategorie categorie) {
		sesCategories.add(categorie);
	}
	
	public void consulterCategoriesDuResto() {
		for(MenuRestoUParCategorie categorie: sesCategories )
		{
			System.out.print(categorie);
		}
	}
}
