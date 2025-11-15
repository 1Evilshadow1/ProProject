package Projet;

import java.util.Date;
public class Commentaire {
    protected String id;
    protected String contenue;
    protected Membre auteur;
    protected Date dateCreation;
    protected Task tacheliee;

    public Commentaire(String id, String contenue , Membre auteur, Task tacheliee) {
        this.id = id;
        this.contenue = contenue;
        this.auteur = auteur;
        this.tacheliee = tacheliee;
        this.dateCreation = new Date();
    }

    public void editer(String nouveauContenue) {
        this.contenue = nouveauContenue;
    }

    public Membre getAuteur(){
        return auteur;
    }

    public String getContenue(){
        return contenue;
    }
}
