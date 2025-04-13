package CIUP;

import java.util.ArrayList;

/*-----------------------------
 * Classe représentant un restaurant universitaire (RestoU) associé à une maison.
 * Contient des informations sur la maison à laquelle il appartient et les catégories de menus qu'il propose.
 *---------------------------*/
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
		if (saMaison == null) 
		{
	        throw new IllegalArgumentException("La maison ne peut pas être null.");
	    }
		this.saMaison = saMaison;
	}
	
	public RestoU(Maison maison) {
		if (maison == null) 
		{
	        throw new IllegalArgumentException("La maison associée au RestoU ne peut pas être null.");
	    }
		this.saMaison = maison;
		maison.addRestoU(this);
	}
	
	public void addCategorieRestoU(MenuRestoUParCategorie categorie) {
		if (categorie == null) 
		{
	        throw new IllegalArgumentException("La catégorie ne peut pas être null.");
	    }
		sesCategories.add(categorie);
	}
	
	public void consulterCategoriesDuResto() {
		for(MenuRestoUParCategorie categorie: sesCategories )
		{
			System.out.print(categorie);
		}
	}
}
