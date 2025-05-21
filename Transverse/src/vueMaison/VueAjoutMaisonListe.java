package vueMaison;
import modele.FactoryCIUP;
import javax.swing.*;
import java.awt.*; 
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class VueAjoutMaisonListe extends JPanel{
	private JPanel panelMaisons;
    private JButton btnSelectAll;
    private JButton btnConfirm;
    private JButton btnCancel;
    private List<PanelSelection> selectionPanels;
    
    private PanelSelection maisonInternationale;
    private PanelSelection maisonFR;
    private PanelSelection maisonES;
    private PanelSelection maisonJP;
    private PanelSelection maisonTU;
    
    public VueAjoutMaisonListe() {
        setLayout(new BorderLayout(20,20));
        selectionPanels = new ArrayList<>();

        panelMaisons = new JPanel();
        panelMaisons.setLayout(new GridLayout(2, 5, 10, 10));
        
        FactoryCIUP factory = FactoryCIUP.getInstance();
        factory.CreationObjets();
        
        try 
		{
			maisonInternationale = new PanelSelection( "Maison Internationale", "img/maison-internationale");
			maisonFR = new PanelSelection( "Maison France", "img/maison-france");
			maisonES = new PanelSelection( "Maison Espagne", "img/maison-espagne");
			maisonJP = new PanelSelection( "Maison Japon", "img/maison-japon");
			maisonTU = new PanelSelection( "Maison Tunisie", "img/maison-tunisie");
			
            selectionPanels.add(maisonInternationale);
            selectionPanels.add(maisonFR);
            selectionPanels.add(maisonES);
            selectionPanels.add(maisonJP);
            selectionPanels.add(maisonTU);
			
			for (PanelSelection panel : selectionPanels) {
	            panelMaisons.add(panel);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        add(panelMaisons, BorderLayout.CENTER);
        
        JPanel panelActions = new JPanel(); //new GridLayout(4,1)
        panelActions.setLayout(new BoxLayout(panelActions, BoxLayout.Y_AXIS));
        JLabel confirmation = new JLabel("Création de la liste");
        btnSelectAll = new JButton("Tout sélectionner");
        
        btnConfirm = new JButton("Confirmer");
        btnCancel = new JButton("Annuler");
        
        panelActions.add(btnSelectAll);
        
        panelActions.add(Box.createVerticalStrut(250));
        panelActions.add(confirmation);
        panelActions.add(btnConfirm);
        panelActions.add(btnCancel);
 
        JPanel espace = new JPanel();
        espace.setPreferredSize(new Dimension(0, 20));
        
        add(espace, BorderLayout.SOUTH);
        add(panelActions, BorderLayout.EAST);
        
        //ECOUTEURS
        btnSelectAll.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (PanelSelection panel : selectionPanels) {
                    panel.checkbox.setSelected(true);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame fenetre = new JFrame("Calcul Perimètre");
        fenetre.setSize(700, 700);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.add(new VueAjoutMaisonListe());
        fenetre.setVisible(true);
    }
}
