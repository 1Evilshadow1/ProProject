package User;

import java.util.List;

public class Administrateur extends User {
    protected List <String> problemeAGerer;

    public Administrateur( String id , String nom, String prenom, String email, String mdp, List<String> problemeAGerer) {
        super(id, nom, prenom, email, mdp);
        this.problemeAGerer = problemeAGerer;
    }
    public List<String> getProblemeAGerer() {
        return problemeAGerer;
    }
}
