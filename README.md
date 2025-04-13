Membres : Rania Hassine, Elyssa Hallou, Ryowen Bernard, Cathya Agoubi

! Sur la section "Constitution des groupes de travail" il y a écrit que Zahra Manawi est dans notre groupe mais ce n'est pas le cas, elle est actuellement en DUCES !

# Projet SAE

Pour lancer le projet dans Eclipse, commencez par ouvrir l’IDE et sélectionner votre espace de travail. Ensuite, importez le projet en allant dans File > Import > Existing Projects into Workspace, puis sélectionnez le dossier du projet. Une fois le projet importé, ouvrez l’arborescence jusqu’à la classe CIUP, qui contient la méthode main. Cette méthode est le point d’entrée de l’application : elle appelle une fonction de la classe FactoryCIUP, chargée de créer tous les objets nécessaires et de simuler l’application. Pour exécuter le projet, faites un clic droit sur la classe CIUP, puis sélectionnez Run As > Java Application. L’application se lancera automatiquement à partir de cette classe.

Pour lancer les tests unitaires dans Eclipse, assurez-vous d’abord que le dossier test est bien inclus dans le projet. Chaque fichier de ce dossier contient une classe de test avec une méthode main, ce qui permet de les exécuter individuellement. Pour lancer les tests, ouvrez chaque fichier du dossier test, puis faites un clic droit dans l’éditeur sur la classe de test, et sélectionnez Run As > Java Application. Répétez cette opération pour chaque fichier de test afin d’exécuter l’ensemble des tests unitaires du projet.


## Test de la factoryCIUP


### Fichiers principaux

factoryCIUPTest.java est une classe contenant des tests simples pour valider les objets créés par FactoryCIUP.
FactoryCIUP.java est une classe simulant la logique de crétion des maisons et des étudiants.
les entités Maison, MaisonInternationale, et Etudiant représente les principaux composant du système.

### objectifs des tests

factoryCIUPTest éxecute 4 tests:
- il vérifie que les listes de maisons et d'étudiants sont bien initialisées: 
`creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull()`

-il verifie que les 6 maisons soient bien créées et vérifie la présence des maison france et maison internationale:
`getLesMaisons_ApresInitialisation_ListeCorrecte()`
 
 -il vérifie que 10 étudiants sont crées et verifie que l étudiant dicaprio est bien présent dans la liste :
 `getLesEtudiants_ApresInitialisation_ListeCorrecte()`

 -  il verifie que les maisons internationale contient exactement 3 services:
 `maisonInternationale_ApresCreation_ContientServicesCorrects()`

 ### execution des tests 

 les etapes sont :

run java CIUPTest/FactoryCIUPTest.java
java CIUPTest.FactoryCIUPTest
et si tous les tests passes ont verras s'afficher :

creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull passed.
getLesMaisons_ApresInitialisation_ListeCorrecte passed.
getLesEtudiants_ApresInitialisation_ListeCorrecte passed.
maisonInternationale_ApresCreation_ContientServicesCorrects passed.
Tous les tests FactoryCIUP sont passés.

## Tests de la classe restoU

### Tests implémentés

- il verifie que le constructeur de restoU associe correctement une instance de Maison
`testConstructeur_AssocieCorrectementLaMaison()`

-il teste que la méthode setSaMaison() change correctement la maison associée:
`testSetSaMaison_ModifieCorrectementLaMaison()`

-il teste si une categorie de menu peut etre ajoutée correctement au restoU:
`testAddCategorieRestoU_ListeContientCategorie()`

-il ajoute deux catégories et affiche les catégories disponibles dans le restaurant:
`testConsulterCategoriesDuResto_AfficheToutesLesCategories()`

### exécution des tests

compilation : `java CIUPTest/RestoUTest.java`
exécution: `java CIUPTest.RestoUTest`

## Tests de la classe MaisonInternationale

### tests implémentés

- il permet l'ajout correct d un service à la liste des services proposés
-il permet la détection correcte du service ajouté via `estService(String)`
`MaisonInternationale testMI = new MaisonInternationale(...);
testMI.addService("Menage");
assert testMI.getServicesProposes().size() == 1;
assert testMI.estService("Menage");` il affiche des messages de succès ou d'erreur si les assertions echouent.

### exécution des tests

pour exécuter tous les tests: `AllTest_MaisonInternationale(String[] args)`


## Tests de la classe Maison 

###Tests implémentés

- il Vérifie que le RestoU est bien lié à la maison: `testAddRestoU()`
-il Vérifie que la maison contient bien 1 étudiant après l’ajout: `testAddEtudiant_UnSeulEtudiant()`
- il Teste l’ajout d’étudiants jusqu’au nombre maximal de chambres: `testAddEtudiant_NombreMaximum()`

### exécution
comilation :`java CIUPTest/MaisonTest.java`
exécution: `public static void main(String[] args) {
    MaisonTest.AllTest_Maison(args);
}`

## tests de la classe Menu resto U par categorie

###Tests implémentés

-il permet de Tester que le constructeur ajoute un plat non nul à la liste sesPlats:
`constructeur_platNonNull_sesPlatsContiensCePlat()`
- il Teste que si le constructeur reçoit null en argument, la liste sesPlats reste vide:
`constructeur_platNull_sesPlatsResteVide()`
- il Teste que l’ajout manuel d’un plat non nul fonctionne correctement:
`addPlat_platNonNull_sesPlatsContientCePlat()`
-il Teste que l’ajout d’un plat null déclenche bien une IllegalArgumentException:
`addPlat_platNull_ThrowIllegalArgumentException()`

## tests de la classe Nationalite 

### Tests implémentés

- Teste que lorsqu’un étudiant est créé avec une nationalité donnée, il est automatiquement ajouté à la liste sesEtudiants de cette nationalité:
`addEtudiant_EtudiantNonNull_AjouteEtudiantAPartirDuConstructeur()`

-Teste que si on essaie d’ajouter un étudiant null via la méthode AddEtudiant, une IllegalArgumentException est bien levée:
`addEtudiant_EtudiantNull_ThrowsIllegalArgumentException()`

## tests de la classe plat

###Tests implémentés
Teste que l’ajout d’allergènes à un plat fonctionne correctement.

Vérifie que les allergènes ajoutés (Gluten, Lactose) sont bien présents dans la liste.

Affiche une erreur si un allergène est manquant ou si la taille de la liste est incorrecte.
`testAddAllergenes_ListeContientAllergenes()`

Vérifie que les étiquettes telles que "Vegan" ou "Sans gluten" peuvent être associées à un plat.

S'assure que la liste des étiquettes contient bien les éléments ajoutés.
`testAddEtiquette_ListeContientEtiquettes()`

## Répartition du travail 

Maison: RYOWEN
MaisonInternationale: RYOWEN
Etudiant: RANIA
RestoU: ELYSSA
Plat: ELYSSA
FactoryCIUP: CATHYA
Nationalite: RANIA
Etiquette:X
Allergene:X
MenuRestoUParCategorie: RANIA
CIUP: X




