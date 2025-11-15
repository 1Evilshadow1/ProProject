package User;

import java.util.List;

public class Administrateur {
    protected List <String> problemeAGerer;

    public Administrateur( List<String> problemeAGerer) {
        this.problemeAGerer = problemeAGerer;
    }
    public List<String> getProblemeAGerer() {
        return problemeAGerer;
    }
}
