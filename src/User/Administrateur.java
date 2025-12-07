package User;

import java.util.List;

import Probleme.Probleme;

public final  class Administrateur extends User {
    protected List <Probleme> problemeAGerer;

    public Administrateur( String id , String nom, String prenom, String email, String mdp,String role,String type ,List<Probleme> problemeAGerer) {
        super(id, nom, prenom, email, mdp,role,type);
        this.problemeAGerer = problemeAGerer;
    }
    public List<Probleme> getProblemeAGerer() {
        return problemeAGerer;
    }
}
