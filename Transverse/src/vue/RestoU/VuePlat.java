package vue.RestoU;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.*;
import controller.RestoU.EcouteurPlat;
import modele.*;

/**
 * Vue représentant un plat avec son image et un bouton pour voir les détails.
 * Affiche une image du plat et son nom avec un bouton d'action.
 * 
 * @author hassine
 */
public class VuePlat extends JPanel {

    //--------------------------
    // CONSTANTES
    //--------------------------
    private static final int IMAGE_WIDTH = 300;
    private static final int IMAGE_HEIGHT = 250;
    private static final int PANEL_HEIGHT = 300;
    private static final int PANEL_WIDTH = 300;
    private static final Color BORDER_COLOR = Color.DARK_GRAY;
    private static final int BORDER_THICKNESS = 3;
    private static final String DEFAULT_IMAGE = "img/pizza.jpg";
    private static final String IMAGE_DIR = "img/";
    private static final String IMAGE_EXT = ".png";

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** Label contenant l'image du plat */
    protected JLabel image;
    
    /** Panel combinant le nom du plat et le bouton d'action */
    protected PanelLabelBoutton nomEtBoutton;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit une vue pour le plat spécifié.
     * 
     * @param lePlat Le plat à afficher (ne doit pas être null)
     * @throws NullPointerException si le plat est null
     */
    public VuePlat(Plat lePlat) {
        // Configuration de l'image
        chargerImagePlat(lePlat);
        
        // Configuration du panel nom + bouton
        this.nomEtBoutton = new PanelLabelBoutton("Voir", lePlat.getNomDuPlat());
        
        // Configuration du layout
        this.setLayout(new BorderLayout());
        this.add(image, BorderLayout.CENTER);
        this.add(nomEtBoutton, BorderLayout.SOUTH);

        // Configuration des dimensions
        Dimension size = new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
        this.setPreferredSize(size);
        this.setMinimumSize(size);
        this.setMaximumSize(size);
        
        // Configuration de la bordure
        this.setBorder(BorderFactory.createLineBorder(BORDER_COLOR, BORDER_THICKNESS));
        
        // Ajout de l'écouteur
        this.nomEtBoutton.getBoutton().addActionListener(new EcouteurPlat(lePlat));
    }
    
    //--------------------------
    // METHODES PRIVEES
    //--------------------------
    
    /**
     * Charge l'image du plat ou utilise une image par défaut si non trouvée.
     * 
     * @param lePlat Le plat dont on veut charger l'image
     */
    private void chargerImagePlat(Plat lePlat) {
        try {
            BufferedImage bufferedImg = ImageIO.read(new File(IMAGE_DIR + lePlat.getNomDuPlat() + IMAGE_EXT));
            Image imgPlat = bufferedImg.getScaledInstance(IMAGE_WIDTH, IMAGE_HEIGHT, Image.SCALE_SMOOTH);
            image = new JLabel(new ImageIcon(imgPlat));
        } catch (IOException e) {
            image = new JLabel(new ImageIcon(DEFAULT_IMAGE));
            System.err.println("Avertissement: L'image du plat " + lePlat.getNomDuPlat() + " n'a pas été trouvée");
        }
    }

    //--------------------------
    // MAIN (Méthode de test)
    //--------------------------
    
    /**
     * Méthode main pour tester l'affichage d'un plat.
     * 
     * @param args Arguments de la ligne de commande (non utilisés)
     */
    public static void main(String[] args) {
        Plat pizza = new Plat("pizza", null, null);
        JFrame fenetre = new JFrame();
        fenetre.setSize(PANEL_WIDTH, PANEL_HEIGHT);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VuePlat vueTest = new VuePlat(pizza);
        fenetre.add(vueTest);
        fenetre.setVisible(true);
    }
}