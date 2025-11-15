package Projet;

import java.util.Date;
import java.util.List;
import java.util.Map;

public class Rapport {
    protected String id;
    protected Project project;
    protected Date dateGeneration;
    protected Map<TaskStatue, Integer> statistiquesTaches;
    protected List<Membre> membresActifs;
    protected double tauxAvancement;

    public Rapport(String id, Project project, Date dateGeneration,
                   Map<TaskStatue, Integer> statistiquesTaches,
                   List<Membre> membresActifs, double tauxAvancement) {
        this.id = id;
        this.project = project;
        this.dateGeneration = dateGeneration;
        this.statistiquesTaches = statistiquesTaches;
        this.membresActifs = membresActifs;
        this.tauxAvancement = tauxAvancement;
    }

    public String getId(){
        return id;
    }

    public Project getProject(){
        return project;
    }
}
