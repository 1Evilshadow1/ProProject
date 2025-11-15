package Probleme;
import java.util.Date;
import java.time.LocalDate;
public final class ProblemeSysteme extends Probleme {

    private Administrateur adminAssigne;

    public ProblemeSysteme(String id, String message, Administrateur adminAssigne) {
        super(id, message);
        this.adminAssigne = adminAssigne;
    }

    @Override
    public void updateStatutProbleme() {
        this.statut = StatutProbleme.Resolu;
        this.dateResolution = LocalDate.now();
    }
}
