package CIUP;
import java.util.*;

/*-----------------------------
 * Classe représentant une catégorie de menu dans un RestoU.
 * Contient une liste de plats appartenant à cette catégorie et permet de consulter ou filtrer les plats selon des critères spécifiques.
 *---------------------------*/
public class MenuRestoUParCategorie {

	private ArrayList<Plat> sesPlats = new ArrayList<Plat>();
	private String categorie;


	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	
	public ArrayList<Plat> getSesPlats() {
		return sesPlats;
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
		System.out.print(plat.getValeursNutritionnelles());
		for(Allergene allergene : plat.getAllergenes())
			System.out.print(allergene);
		for(Etiquette etiquette : plat.getEtiquettes())
			System.out.print(etiquette.getNom());
	}

	@Override
	public String toString() {
		return "MenuRestoUParCategorie [saMaison=" + ", sesPlats=" + sesPlats + ", categorie=" + categorie
				+ "]";
	}

	public void filtrerUnPlat(Etiquette filtre) {
		ArrayList<Plat> platFiltreParEtiquette = new ArrayList<Plat>();
		for(Plat plat: sesPlats) 
		{
			for(Etiquette etiquette: plat.getEtiquettes()) 
			{
				if(filtre == etiquette)
					platFiltreParEtiquette.add(plat);
			}
		}
		for(Plat plat: platFiltreParEtiquette)
			System.out.print(plat);
	}
	
	 public void addPlat(Plat plat) {
		 this.sesPlats.add(plat);
	 }
	



}