package controleur;

import vue.vueGestionDeListe;
import vue.vueListeEtudiants;
import vue.vueMenuRestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
*création de l ecouteur pour la réssidence
*/
public class EcouteurBlocResidences implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        new vueGestionDeListe().setVisible(true);
    }
}
