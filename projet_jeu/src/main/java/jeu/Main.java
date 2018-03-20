package jeu;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        char reponse = 'O'; // On initialise la variable pour rentrer dans la boucle.
        
        
        ArrayList<Personnage> perso = new ArrayList<Personnage>(); // sortir de la boucle car réinitialise la variable perso
        
        while (reponse == 'O'){  
                Personnage pers;
                System.out.println("Veuillez choisir un personnage (magicien/guerrier)");
                String typePerso = sc.nextLine();            
                if(typePerso.equals("magicien")){
                    //listePerso[i] = 
                    pers = createMagician();            
                    }else{                
                        //listePerso[i] = 
                       pers =  createWarrior();
                }
                System.out.println(pers.toString()); // permet d'afficher les attributs du perso créé.
                System.out.println("Voulez-vous créer un nouveau personnage ? (O/N)");
                //On récupère la réponse de l'utilisateur
                reponse = sc.nextLine().charAt(0);
                perso.add(pers); // Ajoute le perso à l'ArrayList

                for(int i = 0; i < perso.size(); i++)
                    {  
                    System.out.println( "" + i + "" + perso.get(i));
                    }       
            
        }



        System.out.println("Vos personnages sont crées"); // Quand la réponse est N, la boucle s'arrête. 
        //Fin de la boucle

        SelectAction();

        


    }

    public static void SelectAction(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Que souhaitez-vous faire ? ");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add(" Afficher un personnage");
        menu.add(" Modifier un personnage");
        menu.add(" Ajouter une arme ou un sort");
        menu.add(" Attaquer");
        menu.add(" Supprimer un personnage");

        

        for(int i = 0; i < menu.size(); i++)
                    {  
                    System.out.println( "" + i + "" + menu.get(i));
                    }

        String reponse = sc.nextLine();
            if(reponse.equals("Afficher un personnage")){
                System.out.println("Je veux afficher un perso");
            }else if
                (reponse.equals("Modifier un personnage")){
                System.out.println("Je veux modifier un perso");
            }else if
                (reponse.equals("Ajouter une arme ou un sort")){
                System.out.println("Je veux ajouter une arme ou un sort");
            }else if
                (reponse.equals("Attaquer")){
                System.out.println("Je veux attaquer");
            }else if
                (reponse.equals("Supprimer un personnage")){
                System.out.println("Je veux supprimer un perso");
            }else{
                System.out.println("ERREUR ! Votre réponse est incorrecte");
            }

    }

    

    

    public static void CreatePersonnage(Personnage p) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir un nom :");
        p.setNomPerso(sc.nextLine());
        //System.out.println("Vous avez saisi le nom : " + name);

        System.out.println("Veuillez saisir un avatar :");
        p.setImgPerso(sc.nextLine());
       // System.out.println("Vous avez saisi un avatar : " + avatar);

        System.out.println("Veuillez saisir un niveau de vie :");
        p.setLife_level(sc.nextInt());
        //System.out.println("Vous avez saisi un niveau de vie : " + life_level);

        System.out.println("Veuillez saisir un niveau d'attaque :");
        p.setAttack_level(sc.nextInt());
        sc.nextLine();
        //System.out.println("Vous avez saisi un niveau d'attack : " + attack_level);
    }

    public static Personnage createWarrior() {
        Scanner sc = new Scanner(System.in);
                Guerrier p1 = new Guerrier();
                CreatePersonnage(p1);
                System.out.println("Veuillez saisir une arme:");
                p1.setArme(sc.nextLine());
               // System.out.println("Vous avez saisi une arme : " + arme);
        
                System.out.println("Veuillez saisir un bouclier :");
                p1.setBouclier(sc.nextLine());
               // System.out.println("Vous avez saisi un bouclier : " + bouclier);
             return p1;
    }

    public static Personnage createMagician() {
        Scanner sc = new Scanner(System.in);
        Magicien p2 = new Magicien();
        CreatePersonnage(p2);
        System.out.println("Veuillez saisir un sort :");
        p2.setSort(sc.nextLine());
        //System.out.println("Vous avez saisi un sort : " + sort);

        System.out.println("Veuillez saisir un philtre :");
        p2.setPhiltre(sc.nextLine());
        //System.out.println("Vous avez saisi un philtre : " + philtre);

        
      
        //System.out.println(p2.toString()); 
        return p2;
    }


}
