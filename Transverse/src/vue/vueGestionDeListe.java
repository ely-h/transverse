import javax.swing.*;
import java.awt.*;

public class vueGestionDeListe extends JFrame {

    public PageGestionListe() {
        setTitle("Gestion de liste");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Bande du haut déjà existante
        add(new BandeHaut(), BorderLayout.NORTH);

        // Titre de la page
        JPanel panelTitre = new JPanel();
        JLabel titre = new JLabel("Gestion de liste");
        titre.setFont(new Font("Avenir", Font.PLAIN, 18));
        panelTitre.add(titre);
        add(panelTitre, BorderLayout.CENTER);

        // Les deux blocs : Créer une liste et Voir la liste
        JPanel panelBloc = new JPanel();
        panelBloc.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 20));
        panelBloc.setBackground(Color.WHITE);

        // Bloc Créer une liste
        JPanel creerPanel = new JPanel();
        creerPanel.setPreferredSize(new Dimension(180, 150));
        creerPanel.setBackground(new Color(250, 248, 245));
        creerPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        creerPanel.setLayout(new BorderLayout());

        JLabel creerLabel = new JLabel("Créer une liste", SwingConstants.CENTER);
        creerLabel.setFont(new Font("Avenir", Font.PLAIN, 16));
        JButton creerButton = new JButton("Choisir");

        creerPanel.add(creerLabel, BorderLayout.CENTER);
        creerPanel.add(creerButton, BorderLayout.SOUTH);

        // Bloc Voir la liste
        JPanel voirPanel = new JPanel();
        voirPanel.setPreferredSize(new Dimension(180, 150));
        voirPanel.setBackground(new Color(250, 248, 245));
        voirPanel.setBorder(BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1, true));
        voirPanel.setLayout(new BorderLayout());

        JLabel voirLabel = new JLabel("Voir la liste", SwingConstants.CENTER);
        voirLabel.setFont(new Font("Avenir", Font.PLAIN, 16));
        JButton voirButton = new JButton("Choisir");

        voirPanel.add(voirLabel, BorderLayout.CENTER);
        voirPanel.add(voirButton, BorderLayout.SOUTH);

        // Ajout des blocs au panneau
        panelBloc.add(creerPanel);
        panelBloc.add(voirPanel);

        // Ajout au centre (en dessous du titre)
        JPanel centrePanel = new JPanel();
        centrePanel.setLayout(new BorderLayout());
        centrePanel.setBackground(Color.WHITE);
        centrePanel.add(panelTitre, BorderLayout.NORTH);
        centrePanel.add(panelBloc, BorderLayout.CENTER);

        add(centrePanel, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new PageGestionListe().setVisible(true));
    }
}
