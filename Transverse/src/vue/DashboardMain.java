import javax.swing.*;
import java.awt.*;

public class DashboardMain extends JFrame {
    public DashboardMain() {
        setTitle("Admin Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // BandeHaut déjà créée ailleurs
        add(new BandeHaut(), BorderLayout.NORTH);

        JPanel centre = new JPanel();
        centre.setBackground(Color.WHITE);
        centre.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 100));

        // Utilisation des blocs
        centre.add(new Bloc("Résidences"));
        centre.add(new Bloc("Étudiants"));
        centre.add(new Bloc("Resto U"));

        add(centre, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DashboardMain();
    }
}
