package controller.RestoU;
import vue.RestoU.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;

/**
 * Écouteur pour gérer les sélections dans une JComboBox de filtrage des plats.
 * Met à jour la vue associée en fonction de l'élément sélectionné.
 * 
 * @author hassine
 */
public class EcouteurComboBox implements ActionListener {

    //--------------------------
    // ATTRIBUTS
    //--------------------------
    
    /** 
     * La vue à mettre à jour lors du filtrage 
     */
    private VueDUnMenu vue;

    //--------------------------
    // CONSTRUCTEUR
    //--------------------------
    
    /**
     * Construit l'écouteur avec la vue à contrôler
     * 
     * @param vue La vue des menus qui sera filtrée
     * @throws NullPointerException si la vue est null
     */
    public EcouteurComboBox(VueDUnMenu vue) {
        this.vue = vue;
    }

    //--------------------------
    // MÉTHODES
    //--------------------------
    
    /**
     * Méthode appelée lors de la sélection dans la combo box.
     * Déclenche le filtrage de la vue selon le critère choisi.
     * 
     * @param e L'événement contenant la source du déclenchement
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() instanceof JComboBox) {
            JComboBox<?> box = (JComboBox<?>)e.getSource();
            vue.FiltrerPar((String)box.getSelectedItem());
        }
    }
}