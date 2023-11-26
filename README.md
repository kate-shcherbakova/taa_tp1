##### M2 IL. TAA TP Des Servlets à la notion de service Web
##### Shcherbakova Kateryna 
##### Tkachenko Oleksii 

# Partie 1: Servlet "https://github.com/kate-shcherbakova/taa_tp1/tree/servlet"

Cette partie du projet est consacrée à l'utilisation des servlets pour le traitement des requêtes HTTP, la mise en œuvre de la logique commerciale, la création de pages web dynamiques et l'interaction avec la base de données.

## Structure du projet
Le code de cette partie du projet se trouve sur la branche `servlet`. 
Le projet peut être divisé en trois paquets principaux :
- **dao**: Fournir des méthodes pour effectuer des opérations de base de données via JPA (Java Persistence API) telles que la recherche, l'enregistrement, la mise à jour et la suppression d'entités.
- **business**: Ils sont utilisés pour décrire les données et les relations entre elles afin de les stocker dans une base de données à l'aide de JPA. Ils fournissent une structure pour travailler avec les données dans une application. Ils représentent la logique d'entreprise.
- **servlet**: Ils traitent les requêtes des clients côté serveur. Ils sont responsables de la modification dynamique des pages et de l'interaction avec les bases de données.

## Utilisation
1. Assurez-vous d'avoir les dépendances nécessaires et Java installé.
2. Importez le projet dans votre IDE.
3. Exécutez le serveur `run-hsqldb-server.sh`, qui est nécessaire pour la base de données. (En cas de problème, utilisez un serveur avec TAA_TP1.`https://github.com/kate-shcherbakova/taa_tp1`.)
4. Il est également souhaitable d'utiliser le fichier JpaTest du TP1 pour remplir la base de données avec des valeurs initiales.
5. Clic droit sur votre projet. run as -> maven build …-> mettre compile jetty:run dans le goal.
6. Lancez votre navigateur et tapez http://localhost:8080/myform.html dans la barre d'adresse.

---

# Partie 2. JaxRS et OpenAPI "https://github.com/LexaProInvoke/TAA_TP2_JaxRS_OpenAPI"

Le projet est un service web, qui est basé sur l'architecture REST et donne la possibilité d'accéder à la base de données par de simples requêtes url.

## Structure du Projet

Le projet est organisé en plusieurs packages :

- `dao.generic`: Contient des classes et des interfaces permettant d'interagir avec la base de données.
- `domain`: Contient des descriptions des modèles commerciaux de base de l'application.
- `rest`: contient des fichiers qui traitent les demandes via l'API REST, y compris des classes de ressources avec des méthodes pour traiter les demandes HTTP (GET, POST, PUT, DELETE), des annotations pour la gestion des demandes et la logique de traitement des demandes.

## Fonctionnalités Principales

- **Client** Envoie des requêtes à la base de données pour interagir avec les données relatives aux conférences et aux membres.
- **Server**: Contrôler les demandes "Rest" entrantes et renvoyer la réponse et les données appropriées. Peut accéder à la base de données pour récupérer et enregistrer des informations.
- **Base de données** Contient des informations sur tous les rendez-vous et les utilisateurs.

## Utilisation

Pour exécuter l'application :
1. Assurez-vous d'avoir les dépendances nécessaires et Java installé.
2. Importez le projet dans votre IDE.
3. Exécutez le serveur `run-hsqldb-server.sh`, qui est nécessaire pour la base de données. (En cas de problème, utilisez un serveur avec TAA_TP1.`https://github.com/kate-shcherbakova/taa_tp1`.)
4. Il est également souhaitable d'utiliser le fichier JpaTest du TP1 pour remplir la base de données avec des valeurs initiales.
5. Démarrer `RestServer`, il surveillera les commandes des utilisateurs et les enverra pour exécution.
6. Ouvrez le navigateur et dans la ligne d'adresse tapez `http://localhost:8080/api/` cela lancera notre api ainsi qu'un swager qui simplifiera l'utilisation des commandes.
7. Envoyez les commandes dont vous avez besoin pour travailler avec la base de données.

## Rest API

Dans ce projet, l'utilisation de la technologie Rest a été le point clé, car elle a permis d'échanger des données entre le client et le serveur à l'aide du protocole HTTP. À l'avenir, nous pourrons également utiliser facilement cette API lors de la mise à l'échelle du projet.

---



