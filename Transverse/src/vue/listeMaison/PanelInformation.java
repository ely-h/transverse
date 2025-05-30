package vue.listeMaison;

import modele.Maison;
import javax.swing.*;
import java.awt.*;

/**
 * @author elyssa
 * 
 * Panel d'affichage détaillé des informations d'une maison.
 * Cette classe étend JPanel et présente toutes les informations importantes d'une maison dans une interface graphique claire et organisée.
 * Les informations affichées sont :
 * -Le nom de la maison (en titre mis en valeur)
 * -Le pays d'origine
 * -Le nombre de chambres disponibles
 * -Les coordonnées géographiques (latitude et longitude)
 */
public class PanelInformation extends JPanel {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private Maison maison;
    private JLabel labelNom;
    private JLabel labelPays;
    private JLabel labelChambres;
    private JLabel labelLatitude;
    private JLabel labelLongitude;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    /**
     * Constructeur du panel d'information.
     * 
     * @param maison maison La maison dont on veut afficher les informations
     */
    public PanelInformation(Maison maison) {
        this.maison = maison;
        initializeComponents();
        setupLayout();
    }
    
	//-------------------------
	// METHODES
	//-------------------------
    
    /**
     * Initialise tous les composants visuels du panel.
     * Crée les labels avec les informations de la maison et applique le style approprié (polices, couleurs) pour chaque élément.
     * Le nom de la maison est mis en évidence avec une police plus grande et une couleur bleue.
     * 
     */
    private void initializeComponents() {
        // Création des labels avec les info de la maison
        labelNom = new JLabel("Nom: " + maison.getNom());
        labelPays = new JLabel("Pays: " + maison.getNationalite().getNom());
        labelChambres = new JLabel("Nombre de chambres: " + maison.getNombreChambres());
        labelLatitude = new JLabel("Latitude: " + maison.getLattitude());
        labelLongitude = new JLabel("Longitude: " + maison.getLongitude());
        
        // Style des labels
        Font font = new Font("Arial", Font.PLAIN, 14);
        labelNom.setFont(new Font("Arial", Font.BOLD, 16));
        labelPays.setFont(font);
        labelChambres.setFont(font);
        labelLatitude.setFont(font);
        labelLongitude.setFont(font);
        
        // Couleurs
        labelNom.setForeground(new Color(33, 150, 243));
        labelPays.setForeground(Color.DARK_GRAY);
        labelChambres.setForeground(Color.DARK_GRAY);
        labelLatitude.setForeground(Color.DARK_GRAY);
        labelLongitude.setForeground(Color.DARK_GRAY);
    }
    
    /**
     * Met en place la disposition des composants dans le panel.
     * s
     * Organise les éléments avec un BorderLayout principal :
     * -Un titre au nord
     * -Les informations au centre, organisées verticalement
     * -Un espacement approprié entre les éléments
     * 
     * Le panel a un fond blanc et des marges pour une présentation aérée.
     */
    private void setupLayout() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        // Panel principal avec les informations
        JPanel panelInfos = new JPanel();
        panelInfos.setLayout(new BoxLayout(panelInfos, BoxLayout.Y_AXIS));
        panelInfos.setBackground(Color.WHITE);
        
        // Ajout des informations
        panelInfos.add(labelNom);
        panelInfos.add(Box.createVerticalStrut(15));
        panelInfos.add(labelPays);
        panelInfos.add(Box.createVerticalStrut(10));
        panelInfos.add(labelChambres);
        panelInfos.add(Box.createVerticalStrut(10));
        panelInfos.add(labelLatitude);
        panelInfos.add(Box.createVerticalStrut(10));
        panelInfos.add(labelLongitude);
        
        // disposition info
        JPanel panelCentre = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelCentre.setBackground(Color.WHITE);
        panelCentre.add(panelInfos);
        
        add(panelCentre, BorderLayout.CENTER);
        
        JLabel titre = new JLabel("Informations de la Maison", JLabel.CENTER);
        titre.setFont(new Font("Arial", Font.BOLD, 18));
        titre.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
        add(titre, BorderLayout.NORTH);
    }
    
	//-------------------------
	// GETTER
	//-------------------------
    
    public Maison getMaison() {
        return maison;
    }
}