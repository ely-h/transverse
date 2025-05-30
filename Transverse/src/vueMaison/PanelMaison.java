package vueMaison;

import javax.imageio.ImageIO;
import javax.swing.*;
import modele.Maison;
import modele.Nationnalite;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelMaison extends JPanel {
	
	//-------------------------
	// ATTRIBUTS
	//-------------------------
	
    private JLabel labelImage;
    private JLabel labelNom;
    private JButton btnInformation;
    private JButton btnSupprimer;
    private Maison maison;
    
	//-------------------------
	// CONSTRUCTEUR
	//-------------------------
    
    public PanelMaison(Maison maison) {
        this.maison = maison;
        initializeComponents();
        setupLayout();
    }
    
	//-------------------------
	// METHODES
	//-------------------------
    
    private void initializeComponents() {
        // Image maison
        try {
            String imagePath = "img/" + maison.getNom() + ".jpg";
            BufferedImage bufferedImg = ImageIO.read(new File(imagePath));
            Image image = bufferedImg.getScaledInstance(200, 150, Image.SCALE_SMOOTH);
            labelImage = new JLabel(new ImageIcon(image));
            labelImage.setHorizontalAlignment(JLabel.CENTER);
        	} catch (IOException e) {
        		e.printStackTrace();
        }
        
        // Nom maison
        labelNom = new JLabel(maison.getNom());
        labelNom.setHorizontalAlignment(JLabel.CENTER);
        
        // Boutons
        btnInformation = new JButton("Information");
        btnSupprimer = new JButton("Supprimer");
        
        // Apparence boutons
        btnInformation.setPreferredSize(new Dimension(90, 30));
        btnSupprimer.setPreferredSize(new Dimension(90, 30));
        
        btnInformation.setBackground(new Color(33, 150, 243));
        btnInformation.setForeground(Color.WHITE);
        
        btnSupprimer.setBackground(new Color(244, 67, 54));
        btnSupprimer.setForeground(Color.WHITE);
    }
    
    private void setupLayout() {
        setLayout(new BorderLayout(5, 5));
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(220, 280));
        
        // Panel central
        JPanel panelCentre = new JPanel(new BorderLayout(5, 5));
        panelCentre.add(labelImage, BorderLayout.CENTER);
        panelCentre.add(labelNom, BorderLayout.SOUTH);
        
        // Panel boutons
        JPanel panelBoutons = new JPanel(new GridLayout(2, 1, 5, 5));
        panelBoutons.setOpaque(false);
        panelBoutons.add(btnInformation);
        panelBoutons.add(btnSupprimer);
        
        add(panelCentre, BorderLayout.CENTER);
        add(panelBoutons, BorderLayout.SOUTH);
    }
    
	//-------------------------
	// GETTERS
	//-------------------------
    
    public Maison getMaison() {
        return maison;
    }
    
    public JButton getBtnInformation() {
        return btnInformation;
    }
    
    public JButton getBtnSupprimer() {
        return btnSupprimer;
    }

}
