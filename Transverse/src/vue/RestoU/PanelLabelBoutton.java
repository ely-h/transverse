package vue.RestoU;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * Panel personnalisé combinant un JLabel et un JButton stylisés verticalement.
 * Utilisé pour afficher une catégorie de menu avec un bouton de sélection associé.
 * 
 * @author hassine
 */
public class PanelLabelBoutton extends JPanel {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Bouton permettant de choisir la catégorie */
    protected JButton bouttonChoisir;
    
    /** Label affichant le nom de la catégorie */
    protected JLabel categorie;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Crée un panel avec un label et un bouton stylisés en disposition verticale.
     * 
     * @param texteBoutton Texte à afficher sur le bouton (ex: "Choisir")
     * @param texteCategorie Texte à afficher comme catégorie (ex: "Entrées")
     */
    public PanelLabelBoutton(String texteBoutton, String texteCategorie) {
        super();
        this.bouttonChoisir = new JButton(texteBoutton);
        bouttonChoisir.setSize(100, 500);
        this.categorie = new JLabel(texteCategorie);
        categorie.setFont(new Font(getFont().toString(), Font.PLAIN, 30));
        this.categorie.setHorizontalAlignment(JLabel.CENTER);
        this.add(categorie);
        this.add(bouttonChoisir);
        this.bouttonChoisir.setBackground(new Color(78, 94, 99));
        this.bouttonChoisir.setForeground(Color.WHITE);
        this.bouttonChoisir.setFont(new Font(getFont().toString(), Font.BOLD, 25));
        
        this.setLayout(new GridLayout(2, 1));
    }

    //--------------------------
    // ACCESSEURS
    //--------------------------
    
    /**
     * Retourne le bouton de sélection de la catégorie.
     * 
     * @return Le JButton associé à ce panel
     */
    public JButton getBoutton() {
        return bouttonChoisir;
    }
}