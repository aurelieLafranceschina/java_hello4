package jeu;
import java.util.ArrayList;

public class Magicien extends Personnage {
    private ArrayList<Sort> sorts;
    private String philtre;
    
    //Constructeur par défaut
/*    public Magicien(String userChoiceName, String userImgChoice){
        super(userChoiceName, userImgChoice);
    System.out.println("Vous avez crée un magicien !");      
    sort = "abracadabra";
    philtre = "invincible";
    
  } */
  
  public ArrayList<Sort> getSort()
      {
          return this.sorts;
      }
    
  public void setSort(ArrayList<Sort> s)
      {
          this.sorts = s;
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
          return super.toString() + sorts.toString() + " Philtre " + philtre ;
      }
}