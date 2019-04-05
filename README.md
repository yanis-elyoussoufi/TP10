# ![](ressources/logo.jpeg) Bases de la programmation orientée objet 

### IUT Montpellier-Sète – Département Informatique

* **Cours:** [M2103](http://cache.media.enseignementsup-recherche.gouv.fr/file/25/09/7/PPN_INFORMATIQUE_256097.pdf) - support [ici](https://github.com/IUTInfoMontp-M2103/Ressources)
* **Enseignants:** [Marin Bougeret](mailto:marin.bougeret@umontpellier.fr), [Sébastien Gagné](mailto:sebastien.gagne@umontpellier.fr), [Victor Poupet](mailto:victor.poupet@umontpellier.fr), [Petru Valicov](mailto:petru.valicov@umontpellier.fr) 
* Le [forum Piazza](https://piazza.com/class/jpv7gf0lltk4kc) de ce cours pour poser vos questions
* [Email](mailto:petru.valicov@umontpellier.fr) pour une question d'ordre privée concernant le cours.
* Le [sujet du TP](http://pageperso.lif.univ-mrs.fr/~petru.valicov/Cours/M2103/TP10.pdf) en format .pdf téléchargeable et imprimable.

Avant de démarrer le TP, vérifiez que vous n'avez pas atteint votre quota d'espace de stockage autorisé :

* placez-vous dans votre `$HOME` et utilisez les commandes suivantes :
    * `du -sh` pour voir combien d'espace vous avez déjà utilisé
    * `du -sh *` pour voir combien d'espace vous avez déjà utilisé pour chaque fichier (sans fichiers cachés)
    * `du -sch .[!.]* *` pour voir combien d'espace vous avez déjà utilisé pour chaque fichier, y compris les fichiers cachés
* Supprimez les fichiers inutiles.
* Pour éviter des problèmes durant vos TPs d'informatique, vous devriez toujours **garder 300-400 Mo d'espace libre**.


### Consignes
- Vous respecterez les différents principes de programmation vues dans les TPs précédents
- Pour chaque exercice il faudra écrire un code à part



## TP10
#### _Thème : les Collections_

Cliquez sur le lien ci-dessous pour faire votre fork privé du TP :

LIEN CLASSROOM ICI

Date limite de rendu de votre code sur le dépôt GitHub : **Dimanche 14 avril à 23h00**

Reprenons les différentes classes modélisant les **employés** que vous avez écrites pour le [TP5](https://github.com/IUTInfoMontp-M2103/TP5). Pour éviter d'altérer le code du TP5, copiez ces classes dans ce projet (TP10). Le but de ce TP est de proposer différentes organisations des employés dans l'entreprise en fonction des besoins du client. 

# Exercice 1

1. Ajoutez un attribut `dateEmbauche` de de type `LocalDate` dans la classe `Employe`.

2. Créez une classe `Entreprise` contenant une liste d'employés. Ajoutez-y les méthodes `void embaucher(Employe e)` et `void licencier(Employe e)` pour mettre à jour la liste d'employés de manière correspondante.

3.