package vue.RestoU;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.*;

import controller.RestoU.EcouteurChangementMenu;
import modele.*;

/**
 * Panel affichant les catégories de menu d'un restaurant universitaire (entrées, plats, desserts, extras)
 * sous forme de boutons cliquables avec des images représentatives.
 * 
 * @author hassine
 */
public class PanelCategoriesMenuRestoU extends JPanel {

    //--------------------------
    // CONSTANTES
    //--------------------------
    
    /** Identifiant pour la catégorie "Entrées" */
    public static final int ENTREES = 0;
    
    /** Identifiant pour la catégorie "Plats" */
    public static final int PLATS = 1;
    
    /** Identifiant pour la catégorie "Desserts" */
    public static final int DESSERTS = 2;
    
    /** Identifiant pour la catégorie "Extras" */
    public static final int EXTRAS = 3;

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Liste des vues graphiques pour chaque catégorie de menu */
    protected ArrayList<VueMenuRestoUParCategorie> lesVuesDeMenu;
    
    /** Chemins d'accès aux images représentant les catégories */
    protected ArrayList<String> lesCheminsDesImages;
    
    /** Panel principal contenant les boutons des catégories */
    protected JPanel panelPrincipal;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit le panel en initialisant les catégories de menu,
     * charge les images associées et crée les composants graphiques.
     * 
     * @see FactoryCIUP#getInstance()
     * @see FactoryCIUP#getLesCategories()
     */
    public PanelCategoriesMenuRestoU() {
        FactoryCIUP f = FactoryCIUP.getInstance();
        f.CreationObjets();
        this.lesVuesDeMenu = new ArrayList<VueMenuRestoUParCategorie>(f.getLesCategories().size());
        
        this.inititializeLesImages();
        
        GridLayout grid = new GridLayout(1, 4);
        this.panelPrincipal = new JPanel(grid);
        for (int i = 0; i < this.lesCheminsDesImages.size(); i++) {
            VueMenuRestoUParCategorie vue = new VueMenuRestoUParCategorie(f.getLesCategories().get(i), this.lesCheminsDesImages.get(i));
            vue.getBoutton().addActionListener(new EcouteurChangementMenu(this, f.getLesCategories().get(i)));
            this.lesVuesDeMenu.add(vue);
            this.panelPrincipal.add(this.lesVuesDeMenu.get(i));
        }
        grid.setHgap(20);
        Border empty = new EmptyBorder(100, 200, 100, 200);
        this.panelPrincipal.setBorder(empty);
        
        this.setLayout(new BorderLayout());
        this.add(panelPrincipal, BorderLayout.CENTER);
    }

    //--------------------------
    // METHODES
    //--------------------------
    
    /**
     * Initialise les chemins d'accès aux images représentant 
     * chaque catégorie de menu (entrées, plats, desserts, extras).
     */
    private void inititializeLesImages() {
        this.lesCheminsDesImages = new ArrayList<String>(4);
        this.lesCheminsDesImages.add(ENTREES, "img/tartare-crevette.jpg");
        this.lesCheminsDesImages.add(PLATS, "img/spaghetti.jpg");
        this.lesCheminsDesImages.add(DESSERTS, "img/Raspberry-Mousse.jpg");
        this.lesCheminsDesImages.add(EXTRAS, "img/pizza.jpg");
    }
    
    /**
     * Méthode main pour tester l'affichage du panel en plein écran.
     * 
     * @param args Arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        PanelCategoriesMenuRestoU vueTest = new PanelCategoriesMenuRestoU();
        JFrame fenetre = new JFrame("Les Menus");
        Toolkit tk = Toolkit.getDefaultToolkit();
        int xSize = ((int) tk.getScreenSize().getWidth());
        int ySize = ((int) tk.getScreenSize().getHeight());
        fenetre.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fenetre.setSize(xSize, ySize);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panelGlobal = new JPanel(new BorderLayout());
        panelGlobal.add(vueTest, BorderLayout.CENTER);
        fenetre.add(panelGlobal);
        fenetre.setVisible(true);
    }
}