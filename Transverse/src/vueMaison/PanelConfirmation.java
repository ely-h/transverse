package vueMaison;
import javax.swing.*;
import java.awt.*;
import java.util.List;
import modele.Maison;

public class PanelConfirmation extends JPanel {
	private JLabel titleLabel;
	private JTextArea selectedHousesArea;
	private JButton btnRetour;
	private JButton btnValider;
	private List<Maison> selectedMaisons;
	
	 public PanelConfirmation(List<Maison> selectedMaisons) {
		 initializeComponents();
	     this.selectedMaisons = selectedMaisons;
	 }
	 
    private void initializeComponents() {
        titleLabel = new JLabel("Confirmation de la sélection");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        
        selectedHousesArea = new JTextArea(15, 30);
        selectedHousesArea.setEditable(false);
        selectedHousesArea.setFont(new Font("Arial", Font.PLAIN, 12));
        selectedHousesArea.setBackground(new Color(245, 245, 245));
        selectedHousesArea.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(Color.GRAY),BorderFactory.createEmptyBorder(10, 10, 10, 10)
        ));
        
        btnRetour = new JButton("Retour");
        btnValider = new JButton("Valider la liste");
        
        // Styling/apparence des boutons
        btnRetour.setPreferredSize(new Dimension(120, 35));
        btnValider.setPreferredSize(new Dimension(120, 35));
        btnValider.setBackground(new Color(76, 175, 80));
        btnValider.setForeground(Color.WHITE);
        btnRetour.setBackground(new Color(158, 158, 158));
        btnRetour.setForeground(Color.WHITE);
    }
}
