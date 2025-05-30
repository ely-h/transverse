package vue.RestoU;
import javax.swing.*;
import javax.swing.border.Border;

import modele.MenuRestoUParCategorie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.*;
import javax.imageio.*;
import java.io.File;
import java.io.IOException;

/**
 * Vue représentant une catégorie de menu du restaurant universitaire avec son image et un bouton de sélection.
 * Combine une image de présentation et un PanelLabelBoutton pour l'interaction.
 * 
 * @author hassine
 */
public class VueMenuRestoUParCategorie extends JPanel {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Bouton de sélection de la catégorie */
    protected JButton bouttonChoisir;
    
    /** Label affichant le nom de la catégorie */
    protected JLabel categorie;
    
    /** Label contenant l'image représentative de la catégorie */
    protected JLabel imgCategorie;
    
    /** Panel combinant le label et le bouton de la catégorie */
    protected PanelLabelBoutton panelCatBoutton;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------

    /**
     * Crée une vue pour une catégorie de menu avec son image et son bouton de sélection.
     * 
     * @param categorie La catégorie de menu à afficher (ne doit pas être null)
     * @param imageCat Chemin d'accès à l'image représentant la catégorie
     * 
     * @throws NullPointerException si la catégorie est null
     */
    public VueMenuRestoUParCategorie(MenuRestoUParCategorie categorie, String imageCat) {
        // Chargement de l'image
        BufferedImage bufferedImg;
        try {
            bufferedImg = ImageIO.read(new File(imageCat));
            Image imgCat = bufferedImg.getScaledInstance(300, 250, Image.SCALE_DEFAULT);
            imgCategorie = new JLabel(new ImageIcon(imgCat));
        } catch (IOException e) {
            // Image de remplacement si le chargement échoue
            imgCategorie = new JLabel(new ImageIcon("img/placeholder-food.png"));
        }
        
        // Configuration du layout
        this.setLayout(new GridLayout(2, 1));
        
        // Ajout des composants
        this.add(imgCategorie);
        this.panelCatBoutton = new PanelLabelBoutton("Choisir", categorie.getCategorie());
        this.add(panelCatBoutton);
        
        // Style
        this.setBorder(BorderFactory.createLineBorder(Color.DARK_GRAY, 3));
    }

    //--------------------------
    // ACCESSEURS
    //--------------------------
    
    /**
     * Retourne le bouton de sélection de la catégorie.
     * 
     * @return Le bouton JButton permettant de sélectionner cette catégorie
     */
    public JButton getBoutton() {
        return this.panelCatBoutton.getBoutton();
    }
}