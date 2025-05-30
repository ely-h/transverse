package vue;

import vue.panelNavigationBar;
import javax.swing.*;
import java.awt.*;

public class vueGestionDeListe extends JPanel {

    public vueGestionDeListe() {
//        setTitle("Gestion de liste");
//        setSize(800, 600);
//        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setLocationRelativeTo(null);
//        setLayout(new BorderLayout());

        // Bandeau du haut
        add(new adminDashboard(null), BorderLayout.NORTH);

        // Panel global central
        JPanel contenuCentral = new JPanel();
        contenuCentral.setLayout(new BorderLayout());
        contenuCentral.setBackground(Color.WHITE);

        // Barre de navigation sous le bandeau
        //panelNavigationBar navBar = new panelNavigationBar("Gestion de liste");
        //contenuCentral.add(navBar, BorderLayout.NORTH);

        // Panel pour les blocs Créer / Voir
        JPanel panelBloc = new JPanel();
        panelBloc.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 40));
        panelBloc.setBackground(Color.WHITE);

        // Bloc Créer une liste
        JPanel creerPanel = creerBloc("Créer une liste");
        // Bloc Voir la liste
        JPanel voirPanel = creerBloc("Voir la liste");

        // Ajout des blocs
        panelBloc.add(creerPanel);
        panelBloc.add(voirPanel);

        // Ajout du panel des blocs dans le contenu central
        contenuCentral.add(panelBloc, BorderLayout.CENTER);

        // Ajout du contenu central à la fenêtre
        add(contenuCentral, BorderLayout.CENTER);
    }

    private JPanel creerBloc(String titre) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(180, 150));
        panel.setBackground(new Color(250, 248, 245));
        panel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));

        JLabel label = new JLabel(titre, SwingConstants.CENTER);
        label.setFont(new Font("Avenir", Font.PLAIN, 16));
        JButton bouton = new JButton("Choisir");

        panel.add(label, BorderLayout.CENTER);
        panel.add(bouton, BorderLayout.SOUTH);
        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new vueGestionDeListe().setVisible(true));
    }
}


