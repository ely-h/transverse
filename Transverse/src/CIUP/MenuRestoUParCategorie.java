package CIUP;
import java.util.*;

public class MenuRestoUParCategorie {

	Maison saMaison;
	ArrayList<Plat> sesPlats = new ArrayList();
	private String categorie;


	public Maison getSaMaison() {
		return saMaison;
	}

	public void setSaMaison(Maison saMaison) {
		this.saMaison = saMaison;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public MenuRestoUParCategorie(Maison maison, String categorie) {
		this.saMaison = maison;
		this.categorie = categorie;
	}
	
	public MenuRestoUParCategorie(Plat plat) {
		this.sesPlats.add(plat); 
	}

	public void consulterLaCategories() {
		for(Plat plat: sesPlats)
			System.out.print(plat);
	}
	
	public void consultationPlat(Plat plat) {
		System.out.print(plat.getNomDuPlat());
		System.out.print(plat.getIngredientsDuPlat());
		System.out.print(plat.getValeursNutritionnelle());
		for(String allergene : getAllergenes())
			System.out.print(allergene);
		for(String etiquette : getEtiquettes())
			System.out.print(etiquette);
	}

	public void filtrerUnPlat(String filtre) {
		ArrayList<Plat> platFiltreParEtiquette = new ArrayList<Plat>();
		for(Plat plat: sesPlats) {
			if(filtre == plat.getEtiquette()) {
				platFiltreParEtiquette.add(plat)
			}
		}
		for(Plat plat: platFiltreParEtiquette)
			System.out.print(plat);
	}
	



}