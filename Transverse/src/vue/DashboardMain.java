package vue;
import javax.swing.*;
import java.awt.*;

public class DashboardMain extends  JFrame {
    public DashboardMain() {
        setTitle("Admin Dashboard");
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Bordereau déjà créée dans une autre classe
        add(new adminDashboard(), BorderLayout.NORTH);

        JPanel centre = new JPanel();
        centre.setBackground(Color.WHITE);
        centre.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 100));

        // Utilisation des blocs
        centre.add(new Block("Résidences"));
        centre.add(new Block("Étudiants"));
        centre.add(new Block("Resto U"));

        add(centre, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new DashboardMain();
    }
}
