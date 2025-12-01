package User;

import java.time.LocalDateTime;

public sealed class User permits chefprojet,Membre,Administrateur {
    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private LocalDateTime dateCreation;
    private RoleUser role;
    private TypeUser type;

    //methods
    public User(String id , String nom, String prenom, String email, String mdp){
        this.id=id;
        this.nom=nom;
        this.prenom=prenom;
        this.email=email;
        this.mdp=mdp;

    }
    public String getId(){
        return id;
    }
    public String getName(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public String getEmail(){
        return  email;
    }
    public String getMdp(){
        return mdp;
    }
    public void ChangerMDP(String mdp){
        this.mdp=mdp;
    }
}