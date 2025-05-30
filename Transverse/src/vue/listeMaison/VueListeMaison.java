package vue.listeMaison;

import modele.FactoryCIUP;

import modele.Maison;
import javax.swing.*;

import controller.listeMaison.EcouteurConfirmation;
import controller.listeMaison.EcouteurInformation;
import controller.listeMaison.EcouteurSupprimer;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * @author elyssa
 * Vue principale pour l'affichage et la gestion d'une liste de maisons.
 * Cette classe permet de visualiser les maisons d'une liste créée précédemment, d'afficher leurs informations détaillées, de les supprimer de la liste et de retourner vers la création de nouvelles listes.
 * 
 */
public class VueListeMaison extends JPanel {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------

    private JPanel panelMaisons;
    private JScrollPane scrollPane;
    private ArrayList<PanelMaison> panelsMaison;
    private FactoryCIUP factory;
    private JButton btnRetourCreation;
    private JFrame fenetreParent; 
 
	//-------------------------
	// CONSTRUCTEURS
	//-------------------------

    public VueListeMaison() {
        this(null);
    }
    
    /**
     * Constructeur avec fenêtre parent.
     * Initialise la vue avec tous ses composants et charge les maisons depuis la factory.
     * 
     * @param fenetreParent La fenêtre parent pour permettre la navigation
     */
    public VueListeMaison(JFrame fenetreParent) {
    	this.fenetreParent = fenetreParent;
        factory = FactoryCIUP.getInstance();
        panelsMaison = new ArrayList<>();
        
        initializeComponents();
        setupLayout();
        chargerMaisons();
        ajouterEcouteurs();
    }
    
	//-------------------------
	// METHODES
	//-------------------------

    
    /**
     * Initialise tous les composants graphiques de base.
     * Crée le panel des maisons, le scroll pane et le bouton de retour si une fenêtre parent est fournie.
     */
    private void initializeComponents() {
        panelMaisons = new JPanel();
        panelMaisons.setLayout(new GridLayout(0, 3, 10, 10)); 
        panelMaisons.setBackground(Color.WHITE);
        
        scrollPane = new JScrollPane(panelMaisons);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        
        if (fenetreParent != null) {
            btnRetourCreation = new JButton("Créer une nouvelle liste");
            btnRetourCreation.setPreferredSize(new Dimension(200, 35));
            btnRetourCreation.setBackground(new Color(78, 94, 99));
            btnRetourCreation.setForeground(Color.WHITE);
        }
    }
    
    /**
     * Met en place la disposition générale de la vue.
     * Organise le titre, le bouton de retour et la zone de contenu des maisons.
     */
    private void setupLayout() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        
        JPanel panelDuHaut = new JPanel(new BorderLayout());
        
        // Titre
        JLabel titre = new JLabel("Liste des Maisons Sélectionnées", JLabel.CENTER);
        titre.setFont(new Font("Arial", Font.BOLD, 18));
        titre.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        panelDuHaut.add(titre, BorderLayout.CENTER);
        
        if (btnRetourCreation != null) {
            JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
            buttonPanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 10));
            buttonPanel.add(btnRetourCreation);
            panelDuHaut.add(buttonPanel, BorderLayout.EAST);
            
            // Écouteur pour le bouton retour
            btnRetourCreation.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    retournerVersCreation();
                }
            });
        }
        
        add(panelDuHaut, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    
    /**
     * Charge toutes les maisons depuis la factory et les affiche.
     * Vide d'abord le panel actuel puis crée un PanelMaison pour chaque maison de la liste. Affiche un message si aucune maison n'est disponible.
     */
    private void chargerMaisons() {
        // Vider le panel actuel
        panelMaisons.removeAll();
        panelsMaison.clear();
        
        // Récupérer la liste des maisons depuis la factory
        ArrayList<Maison> listeMaisons = factory.getListeMaisons();
        
        if (listeMaisons.isEmpty()) {
            JLabel messageVide = new JLabel("Aucune maison dans la liste", JLabel.CENTER);
            messageVide.setFont(new Font("Arial", Font.ITALIC, 14));
            messageVide.setForeground(Color.GRAY);
            panelMaisons.add(messageVide);
        } else {
            for (Maison maison : listeMaisons) {
                PanelMaison panelMaison = new PanelMaison(maison);
                panelsMaison.add(panelMaison);
                panelMaisons.add(panelMaison);
            }
        }
        
        // 'Rafraîchir' l'affichage
        panelMaisons.revalidate();
        panelMaisons.repaint();
    }
    
    /**
     * Ajoute les écouteurs d'événements aux boutons de chaque panel de maison.
     * Associe les boutons 'Information' et "Supprimer" à leurs écouteurs respectifs.
     */
    private void ajouterEcouteurs() {
        for (PanelMaison panelMaison : panelsMaison) {
            EcouteurInformation ecouteurInfo = new EcouteurInformation(panelMaison.getMaison(), this);
            panelMaison.getBtnInformation().addActionListener(ecouteurInfo);
            
            EcouteurSupprimer ecouteurSuppr = new EcouteurSupprimer(panelMaison.getMaison(), this);
            panelMaison.getBtnSupprimer().addActionListener(ecouteurSuppr);
        }
    }
    
    /**
     * Retourne vers la vue de création de liste.
     * Remplace le contenu de la fenêtre parent par une nouvelle VueAjoutMaisonListe avec son écouteur de confirmation.
     */
    private void retournerVersCreation() {
        if (fenetreParent != null) {
            // Retourner à la vue de sélection
            fenetreParent.getContentPane().removeAll();
            fenetreParent.setTitle("Calcul Perimètre");
            
            VueAjoutMaisonListe vueAjout = new VueAjoutMaisonListe(fenetreParent);
            fenetreParent.add(vueAjout);
            
            EcouteurConfirmation ecouteur = new EcouteurConfirmation(vueAjout, fenetreParent);
            vueAjout.getBtnConfirm().addActionListener(ecouteur);
            
            fenetreParent.revalidate();
            fenetreParent.repaint();
        }
    }
    
    // Méthodes utilisées par les écouteurs
    /**
     * Affiche les informations détaillées d'une maison dans une nouvelle fenêtre.
     * Méthode appelée par EcouteurInformation lors du clic sur "Information".
     * 
     * @param maison
     */
    public void afficherInformations(Maison maison) {
        JFrame frameInfo = new JFrame("Informations - " + maison.getNom());
        frameInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameInfo.setSize(400, 300);
        frameInfo.setLocationRelativeTo(this);
        
        PanelInformation panelInfo = new PanelInformation(maison);
        frameInfo.add(panelInfo);
        frameInfo.setVisible(true);
    }
    
    /**
     * Affiche la boîte de dialogue de confirmation de suppression.
     * Méthode appelée par EcouteurSupprimer lors du clic sur "Supprimer".
     * 
     * @param maison
     */
    public void afficherConfirmationSuppression(Maison maison) {
        JFrame frameSuppression = new JFrame("Supprimer - " + maison.getNom());
        frameSuppression.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameSuppression.setSize(350, 200);
        frameSuppression.setLocationRelativeTo(this);
        
        PanelSuppression panelSuppression = new PanelSuppression(maison, this, frameSuppression);
        frameSuppression.add(panelSuppression);
        frameSuppression.setVisible(true);
    }
    
    /**
     * Actualise l'affichage de la liste après modification.
     * Recharge les maisons depuis la factory et remet en place les écouteurs.
     * Méthode appelée après suppression d'une maison.
     */
    public void actualiserListe() {
        chargerMaisons();
        ajouterEcouteurs();
    }
}