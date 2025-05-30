package controller;

import vue.vueGestionDeListe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*--------------------------------------
*création de l ecouteur pour la résidence
*----------------------------------------
*/
public class EcouteurBlocResidences implements ActionListener {
    
    public void actionPerformed(ActionEvent e) {
        new vueGestionDeListe().setVisible(true);
    }
}
