package User;
import Projet.Project;
import java.util.List;

public final class chefprojet extends User {
    protected List <Project> projetAGerer;

    public chefprojet(String id, String nom, String prenom, String email, String mdp, List<Project> projetAGerer) {
        super(id, nom, prenom, email, mdp);
        this.projetAGerer = projetAGerer;
    }

    public List<Project> getProjetAGerer() {
        return projetAGerer;
    }

    public void creerProjet(Project p) {
        projetAGerer.add(p);
    }

    public void supprimerProjet(Project p) {
        projetAGerer.remove(p);
    }

    public void assignerMembreAuProjet(Project p, Membre m) {
        p.ajouterMembre(m);
    }

}
