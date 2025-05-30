package vueMaison;

import modele.FactoryCIUP;
import modele.Maison;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelSuppression extends JPanel {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------

    private Maison maison;
    private VueListeMaison vueParent;
    private JFrame frameParent;
    private JLabel labelQuestion;
    private JButton btnSupprimer;
    private JButton btnAnnuler;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------

    
    public PanelSuppression(Maison maison, VueListeMaison vueParent, JFrame frameParent) {
        this.maison = maison;
        this.vueParent = vueParent;
        this.frameParent = frameParent;
        
        initializeComponents();
        setupLayout();
        ajouterEcouteurs();
    }
    
	//-------------------------
	// METHODES
	//-------------------------

    
    private void initializeComponents() {
        // Message de confirmation
        labelQuestion = new JLabel("<html><center>Êtes-vous sûr de vouloir supprimer<br>" + 
                                  maison.getNom() + " de la liste ?</center></html>");
        labelQuestion.setHorizontalAlignment(JLabel.CENTER);
        labelQuestion.setFont(new Font("Arial", Font.PLAIN, 14));
        
        // Boutons
        btnSupprimer = new JButton("Supprimer");
        btnAnnuler = new JButton("Annuler");
        
        // Style des boutons
        btnSupprimer.setPreferredSize(new Dimension(100, 35));
        btnAnnuler.setPreferredSize(new Dimension(100, 35));
        
        btnSupprimer.setBackground(new Color(244, 67, 54));
        btnSupprimer.setForeground(Color.WHITE);
        btnSupprimer.setFont(new Font("Arial", Font.BOLD, 12));
        
        btnAnnuler.setBackground(new Color(158, 158, 158));
        btnAnnuler.setForeground(Color.WHITE);
        btnAnnuler.setFont(new Font("Arial", Font.BOLD, 12));
        
        btnSupprimer.setFocusPainted(false);
        btnAnnuler.setFocusPainted(false);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout());
        setBackground(Color.WHITE);
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        
        JPanel panelQuestion = new JPanel();
        panelQuestion.setBackground(Color.WHITE);
        panelQuestion.add(labelQuestion);
        
        JPanel panelBoutons = new JPanel(new FlowLayout(FlowLayout.CENTER, 20, 10));
        panelBoutons.setBackground(Color.WHITE);
        panelBoutons.add(btnAnnuler);
        panelBoutons.add(btnSupprimer);
        
        add(panelQuestion, BorderLayout.CENTER);
        add(panelBoutons, BorderLayout.SOUTH);
    }
    
    private void ajouterEcouteurs() {
        // Écouteur pour le bouton Supprimer
        EcouteurSupprimerConfirmer ecouteurSuppr = new EcouteurSupprimerConfirmer(maison, vueParent, frameParent);
        btnSupprimer.addActionListener(ecouteurSuppr);
        
        // Écouteur pour le bouton Annuler
        EcouteurAnnuler ecouteurAnnul = new EcouteurAnnuler(frameParent);
        btnAnnuler.addActionListener(ecouteurAnnul);
    }
    
    public JButton getBtnSupprimer() {
        return btnSupprimer;
    }
    
    public JButton getBtnAnnuler() {
        return btnAnnuler;
    }
}