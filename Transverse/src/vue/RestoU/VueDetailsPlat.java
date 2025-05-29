package vue.RestoU;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

import modele.Allergene;
import modele.Plat;

public class VueDetailsPlat extends JPanel{

	//--------------------------
	// ATTRIBUTS
	//--------------------------
	
	private JPanel ingredients;
	private JPanel allergenes;
	private JPanel valsNutritionnelles;

	//--------------------------
	// CONSTRUCTEUR
	//--------------------------
	
	public VueDetailsPlat(Plat lePlat) {
		JLabel nIngredients=new JLabel("Ingrédients :");
		nIngredients.setFont(new Font(getFont().toString(),Font.BOLD,20));
		
		String lIngredients="";
		for(int i=0;i<lePlat.getIngredientsDuPlat().size();i++) {
			lIngredients=lIngredients+lePlat.getIngredientsDuPlat().get(i)+" ";
		}
		JLabel listeIngredients=new JLabel(lIngredients);
		
		
		ingredients=new JPanel(new BorderLayout());
		ingredients.add(listeIngredients,BorderLayout.CENTER);
		ingredients.add(nIngredients,BorderLayout.NORTH);
		
		JLabel nAllergenes=new JLabel("Allergènes :");
		nAllergenes.setFont(new Font(getFont().toString(),Font.BOLD,20));
		
		String lAllergenes="";
		if(lePlat.getAllergenes().size()==0) {
			lAllergenes="Le Plat ne possède pas d'allergènes";
		}
		for(Allergene a:lePlat.getAllergenes()) {
			lAllergenes+=a.getNom()+" ";
		}
		JLabel listeAllergenes=new JLabel(lAllergenes);
		
		allergenes=new JPanel(new BorderLayout());
		allergenes.add(listeAllergenes,BorderLayout.CENTER);
		allergenes.add(nAllergenes,BorderLayout.NORTH);
		
		JLabel nValNut=new JLabel("Valeurs Nutrionnelles :");
		nValNut.setFont(new Font(getFont().toString(),Font.BOLD,20));
		JLabel ValNutPlat=new JLabel(lePlat.getValeursNutritionnelles());
		
		this.valsNutritionnelles=new JPanel(new BorderLayout());
		this.valsNutritionnelles.add(ValNutPlat,BorderLayout.CENTER);
		this.valsNutritionnelles.add(nValNut,BorderLayout.NORTH);
		
		this.setLayout(new GridLayout(3,1));
		this.add(ingredients);
		this.add(allergenes);
		this.add(valsNutritionnelles);
	}

}
