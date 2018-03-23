package jeu;
import java.util.ArrayList;

public class Guerrier extends Personnage {
    private ArrayList<Arme> armes;
    private String bouclier;

    public ArrayList<Arme> getArme()
    {
        return this.armes;
    }
  
  public void setArme(ArrayList<Arme> a)
    {
        this.armes = a;
    }
   
    public String getBouclier()
    {
        return this.bouclier;
    }
  
  public void setBouclier(String b)
    {
        this.bouclier = b;
    }

    public String toString ()
      {          
          return super.toString() + "Arme" + armes.toString() + " Bouclier " + bouclier; 
      }


    //Constructeur par défaut
   /* public Guerrier(String userChoiceName, String userImgChoice){
        super(userChoiceName, userImgChoice);
        System.out.println("Vous avez crée un guerrier !");      
        arme = "arc";
        bouclier = "ok";
        
      } */
}