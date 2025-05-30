package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class vueDashboard extends JFrame {
    public vueDashboard() {
        setTitle("Admin Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // ---- BORDEREAU AVEC SELECTEUR ----
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.add(new adminDashboard(), BorderLayout.NORTH);

        // ComboBox de navigation
        String[] pages = {" Sélectionner une page ", "Résidences", "Étudiants", "Resto U", "Gestion Liste", "Menu Resto"};
        JComboBox<String> pageSelector = new JComboBox<>(pages);
        pageSelector.setPreferredSize(new Dimension(200, 30));

        // Panel d'accueil pour la ComboBox à droite
        JPanel rightSelectorPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        rightSelectorPanel.setOpaque(false);
        rightSelectorPanel.add(pageSelector);

        topPanel.add(rightSelectorPanel, BorderLayout.SOUTH);

        add(topPanel, BorderLayout.NORTH);

        // ---- NAVIGATION BAR ----
        add(new panelNavigationBar("Tableau de Bord"), BorderLayout.CENTER);

        // ---- BLOCS CENTRAUX ----
        JPanel centre = new JPanel();
        centre.setBackground(Color.WHITE);
        centre.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 100));
        centre.add(new panelBlockMenu("Résidences"));
        centre.add(new panelBlockMenu("Étudiants"));
        centre.add(new panelBlockMenu("Resto U"));

        add(centre, BorderLayout.SOUTH);

        // ---- LISTENER POUR LA COMBOBOX ----
        pageSelector.addActionListener((ActionEvent e) -> {
            String selected = (String) pageSelector.getSelectedItem();
            switch (selected) {
                case "Résidences":
                    JOptionPane.showMessageDialog(this, "Vers Résidences");
                    break;
                case "Étudiants":
                    JOptionPane.showMessageDialog(this, "Vers Étudiants");
                    break;
                case "Resto U":
                    JOptionPane.showMessageDialog(this, "Vers Resto U");
                    break;
                case "Gestion Liste":
                    JOptionPane.showMessageDialog(this, "Vers Gestion de liste");
                    break;
                case "Menu Resto":
                    JOptionPane.showMessageDialog(this, "Vers Menu Resto U");
                    break;
                default:
                    break;
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new vueDashboard();
    }
}
