package User;

import Projet.Tache;

import java.util.List;

public final  class Membre extends User {
    List<Tache> tachesAssignes;
    String dispo;

    public Membre(String id, String nom, String prenom, String email, String mdp, String dispo, List<Tache> tachesAssignes) {
        super(id, nom, prenom, email, mdp);
        this.tachesAssignes = tachesAssignes;
        this.dispo = dispo;
    }

    public String getid() {
        return getId();
    }

    public List<Tache> getTaches() {
        return tachesAssignes;
    }

    public String getDispo() {
        return dispo;
    }

    public int getNbrTache(){return tachesAssignes.size() ;}




}


