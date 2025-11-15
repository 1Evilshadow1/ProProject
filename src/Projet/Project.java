package Projet;

import User.chefprojet;
import User.Membre;
import java.util.List;
import java.util.Map;

public class Project {
    protected String info;
    protected chefprojet chefProjet;
    protected List<Membre> equipe;
    protected List<Tache> taches;
    protected Map<Tache,Integer> avancement;

    public Project(String info, chefprojet chefProjet, List<Membre> equipe,
                   List<Tache> taches, Map<Tache, Integer> avancement) {
        this.info = info;
        this.chefProjet = chefProjet;
        this.equipe = equipe;
        this.taches = taches;
        this.avancement = avancement;
    }

    public void ajouterMembre(Membre membre) {
        equipe.add(membre);
    }

    public void retirerMembre(Membre membre) {
        equipe.remove(membre);
    }

    public void creerTache(Tache tache) {
        taches.add(tache);
    }

    public void calculerAvancement(Tache tache, int pourcentage) {
        avancement.put(tache, pourcentage);
    }

    public String getInfo(){
        return info;
    }

    public List<Membre> getEquipe(){
        return equipe;
    }

    public List<Tache> getTaches(){
        return taches;
    }

}
