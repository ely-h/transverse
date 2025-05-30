package vue;

import javax.swing.*;
import java.awt.*;

/**
 * Barre de navigation avec un bouton retour et un titre.
 */

public class panelNavigationBar extends JPanel {
    private JButton backButton;
    private JLabel titleLabel;
    
    /**
     * Construit une barre de navigation.
     * @param titre Le titre à afficher dans la barre
     */  

    public panelNavigationBar(String titre) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(800, 60));

        // Bouton retour
        //backButton = new JButton("←"); // Flèche Unicode
//        backButton.setFont(new Font("SansSerif", Font.BOLD, 16));
//        backButton.setBackground(new Color(0, 173, 181));
//        backButton.setForeground(Color.WHITE);
//        backButton.setFocusPainted(false);
//        backButton.setPreferredSize(new Dimension(40, 40));
//        backButton.setBorder(BorderFactory.createEmptyBorder());

        // Label titre centré dans une bordure arrondie
        titleLabel = new JLabel(titre);
        titleLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        titleLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1, true),
                BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));

        //add(backButton);
        add(titleLabel);
    }
    
    /**
     * @return Le bouton de retour
     */

    public JButton getBackButton() {
        return backButton;
    }
    
    /**
     * Modifie le titre de la barre.
     * @param text Le nouveau texte à afficher
     */

    public void setTitle(String text) {
        titleLabel.setText(text);
    }
}




