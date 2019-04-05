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

Reprenons la classe `Employe` que vous avez écrite pour le [TP5](https://github.com/IUTInfoMontp-M2103/TP5). Pour éviter d'altérer le code du TP5, copiez cette classe dans ce projet (TP10). Le but de ce TP est de proposer différentes organisations des employés dans l'entreprise en fonction des besoins du client. 

### Exercice 1 - mise en place

1. Ajoutez un attribut `dateEmbauche` de type `LocalDate` dans la classe `Employe` et faites les modifications nécessaires pour la construction d'un objet de type `Employe`. Ajoutez également un accesseur à cet attribut.

2. Créez une classe `Entreprise` contenant une collection d'employés (la plus générale possible) que l'on va appelé `lePersonnel`. Ajoutez un constructeur sans paramètres instanciant cette collection en tant que `ArrayList`.  

3. Ajoutez-y les méthodes `void embaucher(Employe e)` et `void licencier(Employe e)` pour mettre à jour la liste d'employés de manière correspondante.

4. Redéfinissez la méthode `String toString()` de la classe `Entreprise`.

5. Vérifiez votre programme en créant dans la classe principale une entreprise et en embauchant plusieurs employés. Vous afficherez l'état de l'entreprise après chacune des opérations.


### Exercice 2 - organisation des employés

L'entreprise souhaite mieux organiser ses employés. Le problème c'est que la collection `lePersonnel` peut avoir la même personne plusieurs fois si elle occupe des postes différents. Et donc il ne faut surtout pas changer cela.

1. Redéfinissez les méthodes `equals(Object o)` et `hashCode()` de la classe `Employe` afin de distinguer deux employés en fonction de leur numéro INSEE.
Vous pouvez utiliser la méthode `hashCode()` de la classe `String`.

2. Maintenant l'entreprise souhaite pouvoir retrouver l'ensemble de ses employés sans les doublons. De plus il serait souhaitable de pouvoir récuperer l'ensemble des employés dans l'ordre. L'ordre choisi est l'orde croissant suivant leur nom et qui en cas d'égalité, applique l'ordre décroissant en fonction du numéro INSEE. Sans trier explicitement les éléments, ajoutez une méthode `Collection<Employe> getEmployes()` qui, à partir de la collection `lePersonnel`, retourne une autre collection respectant cette contrainte. afin de n'embaucher que des employés avec des numéros INSEE différents et de préserver l'ordre indiqué.
  **Attention** : Pas de modifications du code précédemment écrit (et donc de l'attribut `lePersonnel`).  

3. Ecrivez des tests unitaires vérifiant que l'on ne peut insérer deux employés de même numéro INSEE, et que le parcours du personnel d'une entreprise s'effectue bien dans l'odre souhaité.

### Exercice 3 - priorité aux anciens

L'entreprise souhaite distribuer des bonus à ses employés en fonction de la date d'embauche. Le problème est que cette somme est évidemment limitée, donc on risque de ne pas pouvoir distribuer des bonus à chaque employé... 

1. Ajoutez un attribut `double bonusTotal` à la classe `Entreprise` et un _setter_ afin que l'utilisateur puisse fixer la somme d'argent disponible pour distribuer un bonus aux employés.

2. Ajoutez à la classe `Employe` un attribut `double bonus` et une méthode _setter_ `void setBonus(double bonus)`.
 
3. Ajoutez à la classe `Employe` une méthode `int getMoisAncienneté()` qui renvoient le nombre de mois correspondant à l'intervalle de temps entre la date d'embauche et maintenant. L'ancienneté est calculée sur le nombre de mois complets depuis la date d'embauche (un mois complet est compté du 1er au 30/31).
    
    **Astuce :** pour calculer l'ancienneté vous pouvez utiliser la classe `ChronoUnit` qui permet d'effectuer des calculs en fonction de différentes unités temporelles (jours, mois, années etc.). Voici un exemple de code qui permet de calculer le nombre de mois entre la date d'embauche et la date d'aujourd'hui :
 
    ```java
    import java.time.LocalDate;
 
    class GestionEtudiants {
        public static void main(String args[]) {
            LocalDate dateEmbauche = LocalDate.of(2013, Month.NOVEMBER, 2);
            long nbMois = ChronoUnit.MONTHS.between(dateEmbauche, LocalDate.now());
        }
    }
    ```
 
4. Le patron a décidé de donner la priorité aux anciens pour la distribution du bonus. Ainsi, le bonus sera d'abord distribué aux personnes avec l'ancienneté la plus élevée. Le bonus qu'un employé va recevoir est égal à `3*ancienneté`. Ajoutez à la classe `Entreprise` une méthode `void distribuerBonus()` qui effectue cette tâche **sans utiliser explicitement** un algorithme de tri et sans modifier la classe `Employe`.

5. Modifiez la méthode `toString()` de `Employe` afin qu'elle affiche également le bonus que l'employé a reçu et testez votre solution.

6. L'entreprise traverse une période de crise et décide de se séparer d'une partie de ses employés. Afin de fidéliser les anciens employés, ce qui a été décidé c'est de licencier les employés ayant travaillé le moins longtemps dans l'entreprise. Sans modifier le code précédemment écrit, ajoutez dans la classe `Entreprise` une méthode `void remercier(int n)` qui permet de licencier `n` personnes les plus  anciennes dans l'ordre décroissant.

### Exercice 4 - ???

