package main.java.jeu;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type [] = {"magicien","guerrier"};
        Personnage pers;
        
        System.out.println("Veuillez choisir un personnage (magicien/guerrier)");
        String typePerso = sc.nextLine();
            
        if(typePerso.equals("magicien")){
            
                pers = createMagician();
              

            }else{
                
                pers = createWarrior();
        }

        System.out.println(pers.toString());



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
