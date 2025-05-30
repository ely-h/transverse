package controller.RestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import modele.MenuRestoUParCategorie;
import vue.RestoU.VueDUnMenu;

public class EcouteurChangementMenu implements ActionListener{
	JPanel panelPrincipal;
	MenuRestoUParCategorie leMenu;
	
	
	public EcouteurChangementMenu(JPanel panel,MenuRestoUParCategorie MenuAAfficher) {
		this.panelPrincipal=panel;
		this.leMenu=MenuAAfficher;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton && leMenu!=null) {
			this.panelPrincipal.removeAll();
			this.panelPrincipal.add(new VueDUnMenu(leMenu));
			this.panelPrincipal.revalidate();
			this.panelPrincipal.repaint();
		}
		
	}

}
