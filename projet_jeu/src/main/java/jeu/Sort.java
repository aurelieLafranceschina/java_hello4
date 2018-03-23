package jeu;

public class Sort {

    private String name;
    private int niveau;


   Sort(String sortName, int attaque) {
    this.name = sortName;
    this.niveau = attaque;

}

    public String toString() {
    return "\n son Sort: " + this.name + "\n niveau du Sort: " + this.niveau;

    }
}
//Création class Sort avec 2 attributs name et niveau.