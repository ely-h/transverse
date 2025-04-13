package CIUP;
public class Etudiant {

	Nationnalite _saNationnalite;
	Maison _saMaison;
	private String _nom;
	private String _prenom;
	private String _mail;
	private int _anneeEtude;
	private static int _numTotalEtudiants = 0;
	private int _num;
	private String _statuLogement;

	/*------------------------------------------------/ 
	/EL CONSTRUCTOR
	/-----------------------------------------------♠*/
	
	Etudiant(String nom, String prenom, String mail, int anneeEtude , Nationnalite Nation) {
		_nom = nom;
		_mail = mail;
		_prenom = prenom;
		_anneeEtude = anneeEtude;
		_statuLogement = "Attente";
		_saNationnalite = Nation;
		_saNationnalite.AddEtudiant(this);
		_numTotalEtudiants ++;
		_num=_numTotalEtudiants;
	}
	
	/*------------------------------------------------/ 
	/METHODES
	/------------------------------------------------*/
	
	public String toString() {
		return ("Étudians numéro : " + _num + "\n" + "Nom : " + _nom + "\n" + "Prénom : " + _prenom + "\n" + "Année d'étude : " + _anneeEtude + "\n" + "Nationnalité : " + _saNationnalite.getNom() + "\n" + "Résidence : " + _saMaison + "\n");
	}
	

	/*------------------------------------------------/ 
	/GETTERS
	/------------------------------------------------*/
	
	public String get_nom() {return _nom;}
	public String get_mail() {return _mail;}
	public String get_prenom() {return _prenom;}
	public Maison get_saMaison() {return _saMaison;}
	public int get_anneeEtude() {return _anneeEtude;}
	public String get_statuLogement() {return _statuLogement;}
	public Nationnalite get_saNationnalite() {return _saNationnalite;}
	public int getNum() {return _num;}
	public static int getNumTotalEtudiants() {return _numTotalEtudiants;}
	
	/*------------------------------------------------/ 
	/SETTERS
	/------------------------------------------------*/
	
	public void set_nom(String nom) {_nom = nom;}
	public void set_mail(String mail) {_mail = mail;}
	public void set_prenom(String prenom) {_prenom = prenom;}
	public void set_saMaison(Maison saMaison) {_saMaison = saMaison;}
	public void set_anneeEtude(int anneeEtude) {_anneeEtude = anneeEtude;}
	public void get_statuLogment(String newStatu) {_statuLogement = newStatu;}
	public void set_saNationnalite(Nationnalite saNationnalite) {_saNationnalite = saNationnalite;}
	
	
	
}