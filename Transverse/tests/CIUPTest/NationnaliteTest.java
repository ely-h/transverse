package CIUPTest;
import CIUP.*;
import java.util.*;

public class NationnaliteTest {
	static void addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur() {
		Nationnalite nationnaliteTest=new Nationnalite("test");
		Etudiant etudiantTest=new Etudiant("","","",0,nationnaliteTest);
	}

}
