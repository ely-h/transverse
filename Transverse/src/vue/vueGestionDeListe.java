package vue;

import vue.panelNavigationBar;
import vue.listeMaison.VueAjoutMaisonListe;
import vue.listeMaison.VueListeMaison;

import javax.swing.*;

import controller.listeMaison.EcouteurCreation;
import controller.listeMaison.EcouteurRetourMenu;
import controller.listeMaison.EcouteurVoirListe;

import java.awt.*;

/**
 * Panel pour la gestion des listes (création et visualisation).
 * 
 * @author agoubi
 */

public class vueGestionDeListe extends JPanel {
	
	private JPanel contenuCentral;
    private JFrame fenetreParent;
    
    /**
     * Constructeur par défaut.
     */
    
    public vueGestionDeListe() {
        this(null);
    }
    
    /**
     * Construit le panel de gestion de liste.
     * @param fenetreParent La fenêtre parente
     */
    
    public vueGestionDeListe(JFrame fenetreParent) {
    	this.fenetreParent = fenetreParent;
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        
        // Panel global central
        contenuCentral = new JPanel();
        contenuCentral.setLayout(new BorderLayout());
        contenuCentral.setBackground(Color.WHITE);
        
        afficherMenuPrincipal();

        // Ajout du contenu central à la fenêtre
        add(contenuCentral, BorderLayout.CENTER);
    }
    
    /**
     * Affiche le menu principal avec les options de création et visualisation.
     */  
    
    private void afficherMenuPrincipal() {
        // Nettoyer le contenu actuel
        contenuCentral.removeAll();
        
        // Barre de navigation sous le bandeau (optionnel)
        // panelNavigationBar navBar = new panelNavigationBar("Gestion de liste");
        // contenuCentral.add(navBar, BorderLayout.NORTH);

        // Panel pour les blocs Créer / Voir
        JPanel panelBloc = new JPanel();
        panelBloc.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        panelBloc.setBackground(Color.WHITE);

        // Création des écouteurs
        EcouteurCreation ecouteurCreation = new EcouteurCreation(this);
        EcouteurVoirListe ecouteurVoirListe = new EcouteurVoirListe(this);

        // Bloc Créer une liste
        JPanel creerPanel = creerBloc("Créer une liste", "Créer", ecouteurCreation);
        
        // Bloc Voir la liste
        JPanel voirPanel = creerBloc("Voir la liste", "Voir", ecouteurVoirListe);

        // Ajout des blocs
        panelBloc.add(creerPanel);
        panelBloc.add(voirPanel);

        // Ajout du panel des blocs dans le contenu central
        contenuCentral.add(panelBloc, BorderLayout.CENTER);
        
        // Rafraîchir l'affichage
        contenuCentral.revalidate();
        contenuCentral.repaint();
    }
    
    /**
     * Crée un bloc de menu.
     * @param titre Le titre du bloc
     * @param texteBouton Le texte du bouton
     * @param ecouteur L'écouteur d'événements pour le bouton
     * @return Le panel créé
     */
    
    private JPanel creerBloc(String titre, String texteBouton, java.awt.event.ActionListener ecouteur) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(180, 150));
        panel.setBackground(new Color(250, 248, 245));
        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));

        JLabel label = new JLabel(titre, SwingConstants.CENTER);
        label.setFont(new Font("Avenir", Font.PLAIN, 16));
        
        JButton bouton = new JButton(texteBouton);
        bouton.addActionListener(ecouteur);
        
        bouton.setBackground(new Color(78, 94, 99));
        bouton.setForeground(Color.WHITE);
        bouton.setFocusPainted(false);
        bouton.setBorder(BorderFactory.createEmptyBorder(8, 16, 8, 16));

        panel.add(label, BorderLayout.CENTER);
        panel.add(bouton, BorderLayout.SOUTH);
        return panel;
    }
    
    /**
     * Affiche l'interface de création de liste.
     */
    
    public void afficherVueCreation() {
        if (fenetreParent != null) {
            contenuCentral.removeAll();
            fenetreParent.setTitle("Création de liste de maisons");
            
            VueAjoutMaisonListe vueAjout = new VueAjoutMaisonListe(fenetreParent);
            contenuCentral.add(vueAjout, BorderLayout.CENTER);
            
            // Ajouter un bouton retour avec son écouteur
            JPanel panelRetour = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton btnRetour = new JButton("← Retour au menu");
            EcouteurRetourMenu ecouteurRetour = new EcouteurRetourMenu(this);
            btnRetour.addActionListener(ecouteurRetour);
            panelRetour.add(btnRetour);
            contenuCentral.add(panelRetour, BorderLayout.NORTH);
            
            contenuCentral.revalidate();
            contenuCentral.repaint();
        }
    }
    
    /**
     * Affiche l'interface de visualisation de liste.
     */
    
    public void afficherVueListe() {
        if (fenetreParent != null) {
            contenuCentral.removeAll();
            fenetreParent.setTitle("Liste des maisons");
            
            VueListeMaison vueListe = new VueListeMaison(fenetreParent);
            contenuCentral.add(vueListe, BorderLayout.CENTER);
            
            // Ajouter un bouton retour avec son écouteur
            JPanel panelRetour = new JPanel(new FlowLayout(FlowLayout.LEFT));
            JButton btnRetour = new JButton("← Retour au menu");
            EcouteurRetourMenu ecouteurRetour = new EcouteurRetourMenu(this);
            btnRetour.addActionListener(ecouteurRetour);
            panelRetour.add(btnRetour);
            contenuCentral.add(panelRetour, BorderLayout.NORTH);
            
            contenuCentral.revalidate();
            contenuCentral.repaint();
        }
    }
    
    /**
     * Retourne au menu principal.
     */
    
    public void retournerAuMenu() {
        if (fenetreParent != null) {
            fenetreParent.setTitle("Gestion de liste");
            afficherMenuPrincipal();
        }
    }
    
    /**
     * Point d'entrée pour tester le panel de gestion.
     * @param args Arguments de la ligne de commande
     */

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame fenetre = new JFrame("Gestion de liste");
            fenetre.setSize(800, 600);
            fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            fenetre.setLocationRelativeTo(null);
            
            vueGestionDeListe vueGestion = new vueGestionDeListe(fenetre);
            fenetre.add(vueGestion);
            fenetre.setVisible(true);
        });
    }
}


