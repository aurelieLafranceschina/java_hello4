package jeu;

public class Guerrier extends Personnage {
    private String arme;
    private String bouclier;

    public String getArme()
    {
        return this.arme;
    }
  
    public void setArme(String a)
    {
        this.arme = a;
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
          return super.toString() + " Arme : " + arme + " Bouclier " + bouclier; 
      }


    //Constructeur par défaut
   /* public Guerrier(String userChoiceName, String userImgChoice){
        super(userChoiceName, userImgChoice);
        System.out.println("Vous avez crée un guerrier !");      
        arme = "arc";
        bouclier = "ok";
        
      } */
}