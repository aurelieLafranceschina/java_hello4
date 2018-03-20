package jeu;

public class Magicien extends Personnage {
    private String sort;
    private String philtre;
    
    //Constructeur par défaut
/*    public Magicien(String userChoiceName, String userImgChoice){
        super(userChoiceName, userImgChoice);
    System.out.println("Vous avez crée un magicien !");      
    sort = "abracadabra";
    philtre = "invincible";
    
  } */
  
  public String getSort()
      {
          return this.sort;
      }
    
  public void setSort(String s)
      {
          this.sort = s;
      }

      public String getPhiltre()
      {
          return this.philtre;
      }
    
    public void setPhiltre(String p)
      {
          this.philtre = p;
      }

      public String toString ()
      {
          return super.toString() + " sort : " + sort + " philtre " + philtre ;
      }
}