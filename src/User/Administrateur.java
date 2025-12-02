package User;

import java.util.List;

public final  class Administrateur extends User {
    protected List <String> problemeAGerer;

    public Administrateur( String id , String nom, String prenom, String email, String mdp,String role,String type ,List<String> problemeAGerer) {
        super(id, nom, prenom, email, mdp,role,type);
        this.problemeAGerer = problemeAGerer;
    }
    public List<String> getProblemeAGerer() {
        return problemeAGerer;
    }
}
