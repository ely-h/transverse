public class BandeHaut extends JPanel {

    public BandeHaut() {
        setLayout(new BorderLayout());
        setBackground(new Color(77, 111, 122)); // fond bleu-gris

        // Chargement du logo avec redimensionnement
        ImageIcon logoIcon = new ImageIcon("img/logo-cite.png");
        Image scaledImage = logoIcon.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH); // ← plus petit ici
        JLabel logoLabel = new JLabel(new ImageIcon(scaledImage));
        logoLabel.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10)); // marges internes


        JLabel titre = new JLabel("Admin Dashboard");
        titre.setForeground(Color.BLACK);
        titre.setFont(new Font("Avenir", Font.PLAIN, 20));
        titre.setHorizontalAlignment(SwingConstants.RIGHT);
        titre.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 20));

        // Permet d'avoir le texte admindashboard aligné à droite
        JPanel textePanel = new JPanel(new BorderLayout());
        textePanel.setOpaque(false);
        textePanel.add(titre, BorderLayout.EAST);

        add(logoLabel, BorderLayout.WEST);
        add(textePanel, BorderLayout.CENTER);

        // Définir une taille préférée plus petite
        setPreferredSize(new Dimension(800, 70)); //permet d'avoir une taille de bordereau plus petit
    }
}
