package vue.RestoU;
import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.Font;

import modele.Allergene;
import modele.Plat;

/**
 * Panel affichant les détails complets d'un plat : ingrédients, allergènes et valeurs nutritionnelles.
 * L'affichage est organisé en trois sections verticales distinctes.
 * 
 * @author hassine
 */
public class VueDetailsPlat extends JPanel {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Panel contenant la liste des ingrédients */
    private JPanel ingredients;
    
    /** Panel contenant la liste des allergènes */
    private JPanel allergenes;
    
    /** Panel contenant les valeurs nutritionnelles */
    private JPanel valsNutritionnelles;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit un panel détaillant les informations du plat spécifié.
     * 
     * @param lePlat Le plat dont on veut afficher les détails (ne doit pas être null)
     * 
     */
    public VueDetailsPlat(Plat lePlat) {
        // Section Ingrédients
        JLabel nIngredients = new JLabel("Ingrédients :");
        nIngredients.setFont(new Font(getFont().toString(), Font.BOLD, 20));
        
        String lIngredients = "";
        for(int i = 0; i < lePlat.getIngredientsDuPlat().size(); i++) {
            lIngredients = lIngredients + lePlat.getIngredientsDuPlat().get(i) + " ";
        }
        JLabel listeIngredients = new JLabel(lIngredients);
        
        ingredients = new JPanel(new BorderLayout());
        ingredients.add(listeIngredients, BorderLayout.CENTER);
        ingredients.add(nIngredients, BorderLayout.NORTH);
        
        // Section Allergènes
        JLabel nAllergenes = new JLabel("Allergènes :");
        nAllergenes.setFont(new Font(getFont().toString(), Font.BOLD, 20));
        
        String lAllergenes = "";
        if(lePlat.getAllergenes().size() == 0) {
            lAllergenes = "Le plat ne possède pas d'allergènes";
        }
        for(Allergene a : lePlat.getAllergenes()) {
            lAllergenes += a.getNom() + " ";
        }
        JLabel listeAllergenes = new JLabel(lAllergenes);
        
        allergenes = new JPanel(new BorderLayout());
        allergenes.add(listeAllergenes, BorderLayout.CENTER);
        allergenes.add(nAllergenes, BorderLayout.NORTH);
        
        // Section Valeurs nutritionnelles
        JLabel nValNut = new JLabel("Valeurs Nutritionnelles :");
        nValNut.setFont(new Font(getFont().toString(), Font.BOLD, 20));
        JLabel ValNutPlat = new JLabel(lePlat.getValeursNutritionnelles());
        
        this.valsNutritionnelles = new JPanel(new BorderLayout());
        this.valsNutritionnelles.add(ValNutPlat, BorderLayout.CENTER);
        this.valsNutritionnelles.add(nValNut, BorderLayout.NORTH);
        
        // Organisation globale
        this.setLayout(new GridLayout(3, 1));
        this.add(ingredients);
        this.add(allergenes);
        this.add(valsNutritionnelles);
    }
}