import Probleme.Bug;
import Probleme.ProblemeSysteme;
import Probleme.StatutProbleme;
import Projet.Commentaire;
import Projet.Project;
import Projet.Tache;
import User.Membre;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import User.Administrateur;
import User.Membre;
import User.chefprojet;

public class App {
    public static void main(String[] args) {
        /*
       System.out.println("ProProject");

        Membre azizM = new Membre("123","aziz","benothmen","aziz.benothmen2002@gmail.com","Aziz123","dispo",Taches);
        Bug bug1 = new Bug("1", "This is a bug message",StatutProbleme.Resolu, LocalDate.of(2022,10,10), LocalDate.of(2023,12,1), azizM);
        bug1.afficherDetailsBug();
        bug1.updateStatutProbleme();
        bug1.afficherDetailsBug();
        List<String> prb = List.of("tache1","tache2");
        Administrateur adminAssigne = new Administrateur("999","2","3","4","5", prb);
        ProblemeSysteme ps = new ProblemeSysteme("11", "message",  adminAssigne);
        ps.updateStatutProbleme();
        */

        List<Tache> tachesAssignes =new ArrayList<>();
        Membre azizM = new Membre("123","aziz","benothmen","aziz.benothmen2002@gmail.com","Aziz123","developpeur","MEMBRE","dispo",tachesAssignes);
        System.out.println(azizM.getNbrTache());

        List<Project>  ProjetAgerer= new ArrayList<>();


    }
}

