##### M2 IL. TAA TP à la découverte de JPA
##### Shcherbakova Kateryna
##### Tkachenko Oleksii

# Partie 1: Initier le projet à partir d’un exemple

La tâche principale de ce projet était de créer une application permettant de prendre rendez-vous avec un enseignant.

## Structure du projet
Le projet peut être divisé en deux paquets principaux :
- **DAO**: Fournissent un accès unifié aux données dans une application en séparant le code de la logique commerciale des méthodes de la base de données. Elles vous permettent d'effectuer de manière sûre et efficace des opérations de lecture, d'écriture, de mise à jour et de suppression sur les données, ce qui simplifie le développement et améliore la testabilité du code logiciel.
- **business**: Ils sont utilisés pour décrire les données et les relations entre elles afin de les stocker dans une base de données à l'aide de JPA. Ils fournissent une structure pour travailler avec les données dans une application. Ils représentent la logique d'entreprise.


## Utilisation
1. Assurez-vous d'avoir les dépendances nécessaires et Java installé.
2. Importez le projet dans votre IDE.
3. Exécutez le serveur `run-hsqldb-server.sh`, qui est nécessaire pour la base de données.
4. Exécuter JpaTest pour saisir des éléments dans la base de données et exécuter des commandes avec ces éléments.
5. Pour afficher les résultats de l'exécution des commandes dans la base de données, exécutez le fichier show-hsqldb.sh. Sélectionnez HSQL Database Engine Server, entrez le nom d'utilisateur SA. Une fenêtre s'ouvre alors avec la possibilité de saisir des requêtes SQL.

---

## JPA

Dans ce projet, nous avons mis en œuvre une application utilisant JPA. Cette technologie nous a permis d'interagir efficacement avec la base de données en sauvegardant, récupérant, mettant à jour et supprimant des objets Java. Par conséquent, cette approche a grandement simplifié le processus de manipulation des données et réduit la nécessité d'écrire des requêtes SQL directes.

---




