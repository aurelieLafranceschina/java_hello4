package jeu;

public abstract class Personnage  {
    private String typePerso;
    private String nomPerso;
    private String imgPerso;
    private int life_level;
    private int attack_level;

 /*   public Personnage(String userChoiceName, String userImgChoice){
        //System.out.println("Création d'un personnage !");    
        this.nomPerso = userChoiceName;
        this.imgPerso = userImgChoice;  
    
       
      } */
      public String getTypePerso()
      {
          return this.typePerso;
      }

      public void setTypePerso(String typePerso)
      {
          this.typePerso = typePerso;
      }


      public String getNomPerso()
      {
          return this.nomPerso;
      }

      public void setNomPerso(String nomPerso)
      {
          this.nomPerso = nomPerso;
      }

      public String getImgPerso()
      {
          return this.imgPerso;
      }

      public void setImgPerso(String imgPerso)
      {
          this.imgPerso = imgPerso;
      }

      public int getAttack_level()
      {
          return this.attack_level;
      }

      public void setAttack_level(int attack_level)
      {
          this.attack_level = attack_level;
      }

      public int getLife_level()
      {
          return this.life_level;
      }

      public void setLife_level(int life_level)
      {
          this.life_level = life_level;
      }

       public String toString()
       {
           return "Type : " + typePerso + " Nom : " + nomPerso + " Image " + imgPerso + " Niveau de vie : " + life_level + " Attaque : " + attack_level;
       }
}