package jeu;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        char reponse = 'O'; // On initialise la variable pour rentrer dans la boucle.             
        ArrayList<Personnage> perso = new ArrayList<Personnage>(); // sortir de la boucle car réinitialise la variable perso
        
        while (reponse == 'O')
        {  
            Personnage pers;
            System.out.println("Veuillez choisir un personnage (magicien/guerrier)");
            String typePerso = sc.nextLine();   
            if(typePerso.equals("magicien")){
                //listePerso[i] = 
                pers = createMagician();
                pers.setTypePerso("Magicien");            
            }else{                
                    //listePerso[i] = 
                   pers =  createWarrior();
                   pers.setTypePerso("Guerrier");
            }
            System.out.println(pers.toString()); // permet d'afficher les attributs du perso créé.
            reponse =' ';
            while(reponse !='O' && reponse!='N')
            {
                System.out.println("Voulez-vous créer un nouveau personnage ? (O/N)");
                //On récupère la réponse de l'utilisateur
                reponse = sc.nextLine().charAt(0);
            }
                    perso.add(pers); // Ajoute le perso à l'ArrayList

                    for(int i = 0; i < perso.size(); i++)
                    {  
                        System.out.println(i + " " + perso.get(i));
                    }  
        }
        System.out.println("Vos personnages sont crées"); // Quand la réponse est N, la boucle s'arrête. 
        //Fin de la boucle
        AffichePerso(perso);
        SelectAction(perso);
        AffichePerso(perso);
}

    public static void AffichePerso(ArrayList<Personnage> perso){
        for(int i = 0; i < perso.size(); i++)
        {
            System.out.println(i + " - " + perso.get(i).getTypePerso()+ " " + perso.get(i).getNomPerso());
        }
    }

    public static void SelectAction(ArrayList<Personnage> perso){
        Scanner sc = new Scanner(System.in);
        for(int y = 0; y < perso.size(); y++)
        {   System.out.println("Choisissez un personnage");
            y = sc.nextInt();
            String personnageChoisi = perso.get(y).getNomPerso();
            String typeChoisi = perso.get(y).getTypePerso();
            System.out.println("Vous avez choisi " + personnageChoisi);
        

        
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

        int reponse = sc.nextInt();
            if(reponse == 1){
                System.out.println(personnageChoisi);
            }else if
                (reponse == 2){
                System.out.println("Modifier");
            }else if
                (reponse == 3){
                System.out.println("Je veux ajouter une arme ou un sort");
                if(typeChoisi.equals("magicien")){
                    ArrayList<Magicien> sort = new ArrayList();
                    sort.add("nouveau sort");
                }
            }else if
                (reponse == 4){
                System.out.println(personnageChoisi + "attaque !");
            }else if
                (reponse == 5){
                perso.remove(personnageChoisi);
                System.out.println(personnageChoisi + "a été supprimé");
            }else{
                System.out.println("Retour à la liste des personnages");
            }

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
