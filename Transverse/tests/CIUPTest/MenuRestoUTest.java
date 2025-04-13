package CIUPTest;
import CIUP.*;

public class MenuRestoUTest {
    public static void main(String[] args){
        constructeur_platNonNull_sesPlatsContiensCePlat();
        constructeur_platNull_sesPlatsResteVide();
        addPlat_platNonNull_sesPlatsContientCePlat();
        addPlat_platNull_ThrowIllegalArgumentException();
        System.out.println("All tests passed");
    }

    private static void constructeur_platNonNull_sesPlatsContiensCePlat()
    {
        Plat platTest=new Plat();
        MenuRestoUParCategorie menuTest=new MenuRestoUParCategorie( platTest);
        assert(menuTest.getSesPlats().contains(platTest)) : "Le plat n'a pas été ajouté à sesPlats";
        System.out.println("constructeur_platNonNull_sesPlatsContiensCePlat passed");
    }

    private static void constructeur_platNull_sesPlatsResteVide(){
        MenuRestoUParCategorie menuTest=new MenuRestoUParCategorie(null);
        assert(menuTest.getSesPlats().isEmpty()) : "SesPlats ne sont pas vides alors qu'on a rien rajouté dedans";
        System.out.println("constructeur_platNull_sesPlatsResteVide passed");
    }

    private static void addPlat_platNonNull_sesPlatsContientCePlat(){
        Plat platTest=new Plat();
        MenuRestoUParCategorie menuTest=new MenuRestoUParCategorie( null);
        menuTest.addPlat(platTest);
        assert(menuTest.getSesPlats().contains(platTest)):"Le plat n'a pas été ajouté à sesPlats";
        System.out.println("addPlat_platNonNull_sesPlatsContientCePlat passed");
    }

    private static void addPlat_platNull_ThrowIllegalArgumentException(){
        try{
            MenuRestoUParCategorie menuTest=new MenuRestoUParCategorie(null);
            menuTest.addPlat(null);
            assert false : "Aucune exception jetée";
        }
        catch(IllegalArgumentException e){
            System.out.println("addPlat_platNull_ThrowIllegalArgumentException passed");
        }
        catch(Exception error) {
			assert false : "Expected IllegalArgumentException";
		}
    }

}
