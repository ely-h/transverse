package CIUP;
import java.util.*;

public class MenuRestoUParCategorie {

	private ArrayList<Plat> sesPlats = new ArrayList();
	private String categorie;


	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
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
	



}