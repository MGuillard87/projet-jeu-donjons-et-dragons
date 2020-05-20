package com.personnages;

public abstract class Personnage {


    // Stocke le nom du guerrier et magicien (enfants de cette classe)
    // éviter un attribut avec valeur NULL !!
    // mettre les attributs en private
    private String nom = "Charlie";
    private int niveauDeVie = 5;
    private int forceAttaque = 5;
    protected String arme = "Epée";
    private int vieMax = 10;
    private int attaqueMax = 10;
    protected String sort = "Temps";

//     Constructeur

    public Personnage() {

    }

    public Personnage(String nom) {

    }


    public Personnage(String nom, int niveauDeVie, int forceAttaque) {
    }

    // méthode toString pour retourner une représentation en String des objets (magicien et guerrier)
public String toString() {
    return "Personnage: " +
            "nom => " + this.nom +
            ", niveauDeVie => " + this.niveauDeVie +
            ", forceAttaque => " + this.forceAttaque +
            ", vieMax => " + this.vieMax +
            ", attaqueMax => " + this.attaqueMax
            ;
}

    // Création des Getter
    public String getNom() {
        return this.nom;
    }

    public int getNiveauDeVie() {
        return niveauDeVie;
    }

    public int getForceAttaque() {
        return forceAttaque;
    }

    public String getArme() {
        return arme;
    }
    public String getSort() {
        return sort;
    }

    // Création des setter
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveauDeVie(int niveauDeVie) {
        this.niveauDeVie = niveauDeVie;
    }

    public void setForceAttaque(int forceAttaque) {
        this.forceAttaque = forceAttaque;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

}


