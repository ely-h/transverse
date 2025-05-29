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
    
    private ArrayList<modele.Maison> lesMaisons;
    private PanelSelection maisonInternationale;
    private PanelSelection maisonFR;
    private PanelSelection maisonES;
    private PanelSelection maisonJP;
    private PanelSelection maisonTU;
    private PanelSelection maisonKR;
    
    public VueAjoutMaisonListe() {
        setLayout(new BorderLayout(20,20));
        selectionPanels = new ArrayList<>();

        panelMaisons = new JPanel();
        panelMaisons.setLayout(new GridLayout(2, 5, 10, 10));
        
        FactoryCIUP factory = FactoryCIUP.getInstance();
        factory.CreationObjets();
        
        lesMaisons = factory.getLesMaisons();

        try 
		{
			maisonFR = new PanelSelection(lesMaisons.get(0), lesMaisons.get(0).getNom(), "img/" + lesMaisons.get(0).getNom() );
			maisonES = new PanelSelection(lesMaisons.get(1), lesMaisons.get(1).getNom(), "img/" + lesMaisons.get(1).getNom() );
			maisonJP = new PanelSelection(lesMaisons.get(2), lesMaisons.get(2).getNom(), "img/" + lesMaisons.get(2).getNom() );
			maisonTU = new PanelSelection(lesMaisons.get(3), lesMaisons.get(3).getNom(), "img/" + lesMaisons.get(3).getNom() );
			maisonKR = new PanelSelection(lesMaisons.get(4), lesMaisons.get(4).getNom(), "img/" + lesMaisons.get(4).getNom() );
			maisonInternationale = new PanelSelection(lesMaisons.get(5), lesMaisons.get(5).getNom(), "img/" + lesMaisons.get(5).getNom() ); 
			
            selectionPanels.add(maisonInternationale);
            selectionPanels.add(maisonFR);
            selectionPanels.add(maisonES);
            selectionPanels.add(maisonJP);
            selectionPanels.add(maisonTU);
            selectionPanels.add(maisonKR);
			
			for (PanelSelection panel : selectionPanels) {
	            panelMaisons.add(panel);
	        }
		} catch (IOException e) {
			e.printStackTrace();
		}
        add(panelMaisons, BorderLayout.CENTER);
        
        JPanel panelActions = new JPanel();
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

    public List<PanelSelection> getSelectionPanels() {
		return selectionPanels;
	}
    
	public JButton getBtnConfirm() {
		return btnConfirm;
	}
	
	public static void main(String[] args) {
        JFrame fenetre = new JFrame("Calcul Perimètre");
        fenetre.setSize(700, 700);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        VueAjoutMaisonListe vueAjout = new VueAjoutMaisonListe();
        fenetre.add(vueAjout);
        EcouteurConfirmation ecouteur = new EcouteurConfirmation(vueAjout, fenetre);
        vueAjout.getBtnConfirm().addActionListener(ecouteur);
        fenetre.setVisible(true);
    }
}
