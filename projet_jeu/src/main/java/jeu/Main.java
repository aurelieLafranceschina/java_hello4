package jeu;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
         
       
                     
        ArrayList<Personnage> perso = new ArrayList<Personnage>(); // sortir de la boucle car réinitialise la variable perso
        Menu();
        int j = sc.nextInt();
        sc.nextLine();
        System.out.println("Vous avez choisi " + j );

        if(j == 0){
            char reponse = 'O'; // On initialise la variable pour rentrer dans la boucle.        
            while (reponse == 'O')
            {  
                Personnage pers;
                Sort sorts;
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
            

        }else if(j == 1){
        AffichePerso(perso);        
        // SelectAction(perso);
        // Menu();
        }else if(j==2)
        System.out.println("Vous sortez du programme");
        else{
            Menu();
        }

        AffichePerso(perso);
        SelectAction(perso);
        Menu();

}

    public static void Menu(){
        String menuAccueil[] = {"Créer un personnage", "Choisir un personnage", "Sortir du programme" };
        System.out.println("Que souhaitez-vous faire ? ");

        for(int a = 0; a < menuAccueil.length; a++){
            System.out.println( a + " " + menuAccueil[a]);
        }

        
    }

    // Affiche la liste des personnages créés (son type et son nom)
    public static void AffichePerso(ArrayList<Personnage> perso){
        for(int i = 0; i < perso.size(); i++)
        {
            System.out.println(i + " - " + perso.get(i).getTypePerso()+ " " + perso.get(i).getNomPerso());
        }
    }

    // Permet de choisir un personnage puis d'agir dessus via la liste des actions. 
    public static void SelectAction(ArrayList<Personnage> perso){
                
        for(int y = 0; y < perso.size(); y++)
        {   System.out.println("Choisissez un personnage");
            y = sc.nextInt();
            String personnageChoisi = perso.get(y).getNomPerso();
            String typeChoisi = perso.get(y).getTypePerso();
            System.out.println("Vous avez choisi " + personnageChoisi);
        

        
        System.out.println("Que souhaitez-vous faire ? ");

        ArrayList<String> menu = new ArrayList<String>();
        menu.add(" Afficher votre personnage");
        menu.add(" Modifier votre personnage");
        menu.add(" Ajouter une arme ou un sort");
        menu.add(" Attaquer");
        menu.add(" Supprimer un personnage");

        for(int i = 0; i < menu.size(); i++)
                    {  
                    System.out.println( "" + i + "" + menu.get(i));
                    }

        int reponse = sc.nextInt();
            if(reponse == 0){
                System.out.println(personnageChoisi);
            }else if
                (reponse == 1){
                System.out.println("Que souhaitez-vous modifier ? ");
                

            }else if
                (reponse == 2){
                System.out.println("Je veux ajouter une arme ou un sort");
                if(perso.get(y).getTypePerso().equals("Magicien")){
                    sc.nextLine();
                    System.out.println("Quel sort souhaitez-vous ajouter ?");
                    String sortName = sc.nextLine();
                    System.out.println("Niveau du Sort (0-100):");
                    int attaque = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Votre sort est " + sortName);
                    ((Magicien)perso.get(y)).getSort().add(new Sort(sortName , attaque));
                    System.out.println(((Magicien)perso.get(y)).getSort());
                    
                }else if(perso.get(y).getTypePerso().equals("Guerrier")){
                    sc.nextLine();
                    System.out.println("Quel arme souhaitez-vous ajouter ?");
                    String armeName = sc.nextLine();
                    System.out.println("Niveau de l'arme (0-100):");
                    int attaque = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Votre arme est " + armeName);

                    ((Guerrier)perso.get(y)).getArme().add(new Arme(armeName , attaque));
                    System.out.println(((Guerrier)perso.get(y)).getArme());
                }else{
                    System.out.println("ERREUR");
                }
            }else if
                (reponse == 3){
                System.out.println(personnageChoisi + "attaque !");
            }else if
                (reponse == 4){
                perso.remove(personnageChoisi);
                System.out.println(personnageChoisi + "a été supprimé");
            }else{
                System.out.println("Retour à la liste des personnages");
            }

        }

    }

    //Creation d'un personnage
    public static void CreatePersonnage(Personnage p) {

       
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

    //Création d'un guerrier (qui fait appel à CreatePersonnage)
    public static Personnage createWarrior() {
        
                Guerrier p1 = new Guerrier();
                CreatePersonnage(p1);                
                p1.setArme(ajouterArme());            
                System.out.println("Veuillez saisir un bouclier :");
                p1.setBouclier(sc.nextLine());
                return p1;
    }
    
    //Création d'un magicien (qui fait appel à CreatePersonnage)
    public static Personnage createMagician() {        
        Magicien p2 = new Magicien();
        CreatePersonnage(p2);
        p2.setSort(ajouterSort());
        System.out.println("Veuillez saisir un philtre :");
        p2.setPhiltre(sc.nextLine());
        return p2;
    }

    // Permet d'ajouter à la liste des sorts le sort que l'utilisateur a rajouté
    public static ArrayList<Sort> ajouterSort()
    {
        ArrayList<Sort> listSorts = new  ArrayList<Sort>();
        String choice;
        do {
            
            System.out.println("Veuillez saisir un nom du sort :");
            String nameSort = sc.nextLine();
            System.out.println("Veuillez saisir le niveau du sort (0-100)");
            int niveauSort = sc.nextInt();
            sc.nextLine();
            Sort s = new Sort(nameSort, niveauSort); // grace au constructeur présent dans la classe Sort
            listSorts.add(s);
            System.out.println("Voulez vous saisir d'autres sorts (O/N) ?");
            choice= sc.nextLine();
        } while(choice.equals("O"));

        return listSorts;
    }


    // Permet d'ajouter à la liste des sorts le sort que l'utilisateur a rajouté
    public static ArrayList<Arme> ajouterArme()
    {
        ArrayList<Arme> listArmes = new  ArrayList<Arme>();
        String choice;
        do {
            
            System.out.println("Veuillez saisir un nom d'arme :");
            String nameArme = sc.nextLine();
            System.out.println("Veuillez saisir le niveau de l'arme :");
            int niveauArme = sc.nextInt();
            sc.nextLine();
            Arme s = new Arme(nameArme, niveauArme); //grace au constructeur présent dans la classe sort
            listArmes.add(s);
            System.out.println("Voulez vous saisir d'autres Armes (O/N) ?");
            choice= sc.nextLine();
        } while(choice.equals("O"));

        return listArmes;
    }
}
