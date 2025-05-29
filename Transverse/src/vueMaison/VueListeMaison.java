package vueMaison;

import modele.FactoryCIUP;
import modele.Maison;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VueListeMaison extends JPanel {
    private JPanel panelMaisons;
    private JScrollPane scrollPane;
    private ArrayList<PanelMaison> panelsMaison;
    private FactoryCIUP factory;
    
    public VueListeMaison() {
        factory = FactoryCIUP.getInstance();
        panelsMaison = new ArrayList<>();
        
        initializeComponents();
        setupLayout();
        chargerMaisons();
        ajouterEcouteurs();
    }
    
    private void initializeComponents() {
        panelMaisons = new JPanel();
        panelMaisons.setLayout(new GridLayout(0, 3, 10, 10)); // 3 colonnes, lignes automatiques
        panelMaisons.setBackground(Color.WHITE);
        
        scrollPane = new JScrollPane(panelMaisons);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        
        // Titre
        JLabel titre = new JLabel("Liste des Maisons Sélectionnées", JLabel.CENTER);
        titre.setFont(new Font("Arial", Font.BOLD, 18));
        titre.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));
        
        add(titre, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);
    }
    
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
        
        // Rafraîchir l'affichage
        panelMaisons.revalidate();
        panelMaisons.repaint();
    }
    
    private void ajouterEcouteurs() {
        // Les écouteurs seront ajoutés dynamiquement lors du chargement des maisons
        for (PanelMaison panelMaison : panelsMaison) {
            // Écouteur pour le bouton Information
            EcouteurInformation ecouteurInfo = new EcouteurInformation(panelMaison.getMaison(), this);
            panelMaison.getBtnInformation().addActionListener(ecouteurInfo);
            
            // Écouteur pour le bouton Supprimer
            EcouteurSupprimer ecouteurSuppr = new EcouteurSupprimer(panelMaison.getMaison(), this);
            panelMaison.getBtnSupprimer().addActionListener(ecouteurSuppr);
        }
    }
    
    // Méthodes publiques pour être appelées par les écouteurs
    public void afficherInformations(Maison maison) {
        JFrame frameInfo = new JFrame("Informations - " + maison.getNom());
        frameInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameInfo.setSize(400, 300);
        frameInfo.setLocationRelativeTo(this);
        
        PanelInformation panelInfo = new PanelInformation(maison);
        frameInfo.add(panelInfo);
        frameInfo.setVisible(true);
    }
    
    public void afficherConfirmationSuppression(Maison maison) {
        JFrame frameSuppression = new JFrame("Supprimer - " + maison.getNom());
        frameSuppression.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frameSuppression.setSize(350, 200);
        frameSuppression.setLocationRelativeTo(this);
        
        PanelSuppression panelSuppression = new PanelSuppression(maison, this, frameSuppression);
        frameSuppression.add(panelSuppression);
        frameSuppression.setVisible(true);
    }
    
    // Méthode pour rafraîchir la liste après suppression
    public void actualiserListe() {
        chargerMaisons();
        ajouterEcouteurs();
    }
    
    // Test de la classe
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Liste des Maisons");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);
            
            // Initialiser la factory et ajouter quelques maisons à la liste pour le test
            FactoryCIUP factory = FactoryCIUP.getInstance();
            factory.CreationObjets();
            
            // Ajouter quelques maisons à la liste pour tester
            ArrayList<Maison> lesMaisons = factory.getLesMaisons();
            if (!lesMaisons.isEmpty()) {
                factory.addMaisonToListe(lesMaisons.get(0));
                factory.addMaisonToListe(lesMaisons.get(1));
            }
            
            VueListeMaison vueListeMaison = new VueListeMaison();
            frame.add(vueListeMaison);
            frame.setVisible(true);
        });
    }
}