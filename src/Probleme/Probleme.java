package Probleme;
import java.time.LocalDate;
public sealed abstract class Probleme 
        permits Bug, ProblemeSysteme {

    protected String idProbleme;
    protected String message;
    protected StatutProbleme statut;
    protected LocalDate dateApparition;
    protected LocalDate dateResolution;

    public Probleme(String idProbleme, String message) {
        this.idProbleme = idProbleme;
        this.message = message;
        this.statut = StatutProbleme.NonResolu;
        this.dateApparition = LocalDate.now();
        this.dateResolution = null;
    }

    public String getId() {
        return idProbleme;
    }

    public String getMessage() {
        return message;
    }

    public StatutProbleme getStatut() {
        return statut;
    }

    public LocalDate getDateApparition() {
        return dateApparition;
    }

    public LocalDate getDateResolution() {
        return dateResolution;
    }

    public abstract void updateStatutProbleme();
}
