##Définition d'une classe HelloWord

public class HelloWorld {
     public static void main(String[] args) {
           System.out.println("Hello, World!"); 
           }
     } 


## Commandes 

La commande ​javac (Java Compiler) produit le fichier compilé ​HelloWord.class. La
commande ​java HelloWorld exécute ces étapes :
- cherche la classe HelloWorld dans l’environnement (par défaut dans le répertoire
courant => définie dans ​HelloWord.class
- charge cette classe
- cherche la méthode par défaut, ​main et l’exécute

## Class 

Une classe peut être comparée à un moule qui, lorsque nous le remplissons, nous donne un objet ayant la forme du moule ainsi que toutes ses caractéristiques.

class ClasseMain{

  public static void main(String[] args){ 
    //Vos données, variables, différents traitements…
  }//Fin de la méthode main

}//Fin de votre classe

## Les constructeurs 

Un constructeur est une méthode d'instance qui va se charger de créer un objet et, le cas échéant, d'initialiser ses variables de classe !

public class Ville{
  String nomVille;
  String nomPays;
  int nbreHabitants; 

  //Constructeur par défaut
  public Ville(){
    System.out.println("Création d'une ville !");      
    nomVille = "Inconnu";
    nomPays = "Inconnu";
    nbreHabitants = 0;
  } 
}

## Constructeur avec paramètres 
 
 public Ville(String pNom, int pNbre, String pPays)
  {
    System.out.println("Création d'une ville avec des paramètres !");
    nomVille = pNom;
    nomPays = pPays;
    nbreHabitants = pNbre;
  }        

** Trois sortes de  variables **

      1) Les variables d'instance : ce sont elles qui définiront les caractéristiques de notre objet.

      2) Les variables de classe : celles-ci sont communes à toutes les instances de votre classe.

      3) Les variables locales : ce sont des variables que nous utiliserons pour travailler dans notre objet

## Initialisation d'un objet Ville

//L'ordre est respecté -> aucun souci

Ville ville1 = new Ville("Marseille", 123456789, "France");

## Accesseurs (permet d'accéder aux variables des objets en lecture)

  //Retourne le nom de la ville
  public String getNom()  {  
    return nomVille;
  }

## Mutateurs (permet de faire pareil, en écriture)

 //Définit le nom du pays
  public void setNomPays(String pPays)
  {
    nomPays = pPays;
  }

  ## En gros

1) les constructeurs -> méthodes servant à créer des objets ;

2) les accesseurs -> méthodes servant à accéder aux données des objets ;

3) les méthodes d'instance → méthodes servant à la gestion des objets.

## Héritage (une classe mère ne peut hériter que d'une seule classe fille)

class Capitale extends Ville {

}






