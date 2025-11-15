import Probleme.Bug;
import Probleme.StatutProbleme;
import User.Membre;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        System.out.println("ProProject");
        Membre azizM = new Membre("123","aziz","benothmen","aziz.benothmen2002@gmail.com","Aziz123","dispo");
        Bug haha = new Bug("1", "This is a bug message",StatutProbleme.Resolu, LocalDate.of(2022,10,10), LocalDate.of(2023,12,1), azizM);
        haha.afficherDetailsBug();
    }
}
