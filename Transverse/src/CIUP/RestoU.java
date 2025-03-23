package CIUP;

import java.util.ArrayList;

public class RestoU {
	Maison saMaison;
	private ArrayList<MenuRestoUParCategorie> sesCategories = new ArrayList<MenuRestoUParCategorie>(4);

	public Maison getSaMaison() {
		return saMaison;
	}

	public ArrayList<MenuRestoUParCategorie> getSesCategories() {
		return sesCategories;
	}

	public void setSaMaison(Maison saMaison) {
		this.saMaison = saMaison;
	}
	
	public RestoU(Maison maison) {
		this.saMaison = maison;
		maison.addRestoU(this);
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
