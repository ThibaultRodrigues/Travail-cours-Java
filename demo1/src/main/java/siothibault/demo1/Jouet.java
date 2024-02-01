package siothibault.demo1;

class ²Jouet {
    private String nom;
    private String matiere;
    private int prix;
    private int categorie;

    // constructeur
    public Jouet(String unNom, String uneMatiere, int unPrix, int uneCategorie) {
        this.nom = unNom;
        this.matiere = uneMatiere;
        this.prix = unPrix;
        this.categorie = uneCategorie;
    }

    // autres méthodes
    public void setNom(String unNom) {

        this.nom = unNom;
    }

    public String getNom() {

        return this.nom;
    }

    public void setPrix(int unPrix) {

        this.prix = unPrix;
    }

    public int getPrix() {

        return this.prix;
    }

    public void setMatiere(String uneMatiere) {

        this.matiere = uneMatiere;
    }

    public String getMatiere() {

        return this.matiere;
    }

    public void setCategorie(int uneCategorie) {

        this.categorie = uneCategorie;
    }

    public int getCategorie() {

        return this.categorie;
    }

    public String getPublic() {
        switch (this.categorie) {
            case 1:
                return "Bébé";

            case 2:
                return "Enfant";

            case 3:
                return "Ado";

            case 4:
                return "Adulte";

            default:
                return "Inconnu";
        }
    }
}
