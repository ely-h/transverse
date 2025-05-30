package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
public class panelNavigationBar extends JPanel {
    private JButton backButton;
    private JLabel titleLabel;

    public panelNavigationBar(String titre) {
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(800, 60));

        // Bouton retour
        backButton = new JButton("←"); // Flèche Unicode
        backButton.setFont(new Font("SansSerif", Font.BOLD, 16));
        backButton.setBackground(new Color(0, 173, 181));
        backButton.setForeground(Color.WHITE);
        backButton.setFocusPainted(false);
        backButton.setPreferredSize(new Dimension(40, 40));
        backButton.setBorder(BorderFactory.createEmptyBorder());

        // Label titre centré dans une bordure arrondie
        titleLabel = new JLabel(titre);
        titleLabel.setFont(new Font("SansSerif", Font.PLAIN, 18));
        titleLabel.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 1, true),
                BorderFactory.createEmptyBorder(5, 15, 5, 15)
        ));

        add(backButton);
        add(titleLabel);
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setTitle(String text) {
        titleLabel.setText(text);
    }
    public void addBackActionListener(ActionListener listener) {
        backButton.addActionListener(listener);
    }
  /*  // Méthode d'exemple pour l'intégration avec blocPanel
    public static void setupBlocPanelListeners(blocPanel panel) {
        panel.getBlocResidences().addManageListener(e -> {
            new vueGestionDeListe().setVisible(true);
        });*/
/*
        panel.getBlocEtudiants().addManageListener(e -> {
            new vueListeEtudiants().setVisible(true);
        });

        panel.getBlocRestoU().addManageListener(e -> {
            new vueMenuRestoU().setVisible(true);
        });*/
    }
}



