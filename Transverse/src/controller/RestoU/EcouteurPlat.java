package controller.RestoU;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import modele.Plat;
import vue.RestoU.VueDetailsPlat;

public class EcouteurPlat implements ActionListener{
	Plat plat;
	
	public EcouteurPlat(Plat plat){
		this.plat=plat;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() instanceof JButton) {
			JFrame fenetre=new JFrame(plat.getNomDuPlat());
			fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			fenetre.setLocationRelativeTo((JButton)e.getSource());
			fenetre.setSize(400,300);
			
			fenetre.add(new VueDetailsPlat(plat));
			
			fenetre.setVisible(true);
		
		}
	}

}
