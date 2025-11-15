package Probleme;

import User.Membre;
import java.time.LocalDate;
public final class Bug extends Probleme {

    private Membre membreAssigne;

    public Bug(String id, String message,StatutProbleme statut,LocalDate dateApparition ,LocalDate dateResolution, Membre membreAssigne) {
        super(id, message);
        this.statut = StatutProbleme.NonResolu;
        this.dateApparition = LocalDate.now();
        this.dateResolution = null;
        this.membreAssigne = membreAssigne;
    }

    @Override
    public void updateStatutProbleme() {
        this.statut = StatutProbleme.Resolu;
        this.dateResolution = LocalDate.now();
    }

    public void afficherDetailsBug() {
        System.out.println("ID Bug: " + idProbleme);
        System.out.println("Message: " + message);
        System.out.println("Statut: " + statut);
        System.out.println("Date d'apparition: " + dateApparition);
        System.out.println("Date de résolution: " + dateResolution);
        System.out.println("Membre assigné: " + membreAssigne.getName() + " " + membreAssigne.getPrenom());
    }
}
