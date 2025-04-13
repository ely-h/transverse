Membres : Rania Hassine, Elyssa Hallou, Ryowen Bernard, Cathya Agoubi

! Sur la section "Constitution des groupes de travail" il y a écrit que Zahra Manawi est dans notre groupe mais ce n'est pas le cas, elle est actuellement en DUCES !

## Test de la factoryCIUP


### Fichiers principaux

factoryCIUPTest.java est une classe contenant des tests simples pour valider les objets créés par FactoryCIUP.
FactoryCIUP.java est une classe simulant la logique de crétion des maisons et des étudiants.
les entités Maison, MaisonInternationale, et Etudiant représente les principaux composant du système.

### objectifs des tests

factoryCIUPTest éxecute 4 tests:
- elle vérifie que les listes de maisons et d'étudiants sont bien initialisées: 
`creationObjets_LanceInitialisation_LesMaisonsEtEtudiantsNeSontPasNull()`

-elle verifie que les 6 maisons soient bien créées et vérifie la présence des maison france et maison internationale:
`getLesMaisons_ApresInitialisation_ListeCorrecte()`
 
 -elle vérifie que 10 étudiants sont crées et verifie que l étudiant dicaprio est bien présent dans la liste :
 `getLesEtudiants_ApresInitialisation_ListeCorrecte()`

 -  elle verifie que les maisons internationale contient exactement 3 services:
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

