# Transverse - Application CIUP

## Description
Ce projet est une application Java réalisée dans le cadre d’une SAE universitaire au semestre 2 en première année de BUT Informatique.  
L’application permet de manipuler plusieurs fonctionnalités autour de la **Cité Internationale Universitaire de Paris (CIUP)** :

- gestion des maisons / résidences
- gestion des étudiants
- consultation d’un Resto U et de ses menus

L’application possède une interface graphique réalisée en **Java Swing** et suit une organisation proche du modèle **MVC**.

Projet réalisé en équipe de 4 étudiants.

---

## Répartition du travail
Projet réalisé en groupe de 4.

Ma contribution principale concerne :
- la partie **Maisons**
- la **sérialisation / sauvegarde des données**
- une partie du modèle associé aux maisons
- conception des maquettes

---

## Prototype Figma

[Voir le prototype Figma](https://www.figma.com/proto/BOg6OEb9hyVsTtbGB9kvm0/SAE1256-GRP-CD1?node-id=19-506&starting-point-node-id=37%3A1157&t=w9aawNQkDx8zhdqm-1)

---

## Fonctionnalités principales de l'application
- affichage d’un tableau de bord principal
- consultation de la liste des maisons
- ajout / suppression / validation d’éléments liés aux maisons
- sauvegarde et chargement des maisons par sérialisation
- affichage d’une liste d’étudiants
- consultation d’un profil étudiant
- consultation des menus du Resto U par catégorie

---

## Problèmes connus

⚠️ L’interface **Étudiant** possède actuellement un problème de navigation.  
Dans certains cas, changer de vue depuis cette interface peut provoquer la fermeture de l’application.

Ce bug n’affecte pas le reste de l'application, qui fonctionne correctement.

---

## Structure du projet

- `src/modele` → classes métier (Maison, Etudiant, RestoU…)
- `src/vue` → interfaces graphiques Swing
- `src/controller` → gestion des événements / interactions
- `src/serialisation` → sauvegarde et chargement des données
- `img/` → images utilisées dans l’interface
- `data/` → fichiers sérialisés
- `javadoc/` → documentation générée

---

## Technologies utilisées

- Java 17
- Java Swing
- Eclipse
- Sérialisation Java

---

## Lancer le projet

### Depuis Eclipse

1. Importer le projet dans Eclipse
2. Vérifier que le JDK utilisé est Java 17
3. Lancer la classe principale :

```
vue.ApplicationCIUP
```

---

## Données

Au démarrage, l’application charge les données des maisons.

Si aucune donnée n’est trouvée, des données par défaut sont créées automatiquement.

Les fichiers sont sauvegardés dans :

```
data/
```

La sérialisation est utilisée pour conserver les maisons entre deux lancements.

---

## Organisation du code

### Modèle
Contient les classes métier :

- Maison
- MaisonInternationale
- Etudiant
- RestoU
- Plat
- MenuRestoUParCategorie
- FactoryCIUP

### Vue
Contient les différentes fenêtres Swing.

### Controller
Contient les écouteurs et la logique de navigation.

### Serialisation
Gestion de la sauvegarde et du chargement des maisons.

---

## Auteur

Projet réalisé dans le cadre d’une SAE universitaire  
Équipe de 4 étudiants

Contribution personnelle :
- gestion des maisons
- sérialisation
- modèle associé aux maisons
- maquettes sur Figma

---

## Remarques

- certaines ressources sont nécessaires pour le bon fonctionnement (images, données)
- une documentation JavaDoc est disponible dans le dossier `javadoc/`
- l’interface étudiant peut provoquer une fermeture de l’application lors de la navigation
