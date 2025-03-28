package CIUPTest;
import CIUP.*;
import java.util.*;

public class NationnaliteTest {
	static void addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur() {
		Nationnalite nationnaliteTest=new Nationnalite("test");
		Etudiant etudiantTest=new Etudiant("","","",0,nationnaliteTest);
		assert (nationnaliteTest.getSesEtudiants().contains(etudiantTest));
		System.out.println("addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur passed");
	}
	
	static void addEtudiant_EtudiantNull_ThrowsIllegalArgumentException () {
		try {
			Nationnalite nationnaliteTest=new Nationnalite("test");
			nationnaliteTest.AddEtudiant(null);
			assert false : "no exception thrown";
		}
		catch(IllegalArgumentException e) {
			System.out.println("addEtudiant_EtudiantNull_ThrowsIllegalArgumentException passed");
		}
		catch(Exception error) {
			assert false : "Expected IllegalArgumentException";
		}
	}

}
