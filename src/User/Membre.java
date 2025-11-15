package User;

public class Membre extends User{
    String dispo;

    public Membre(String id , String nom, String prenom,String email,String mdp,String dispo ){
        super(id,nom,prenom,email,mdp);
        this.dispo =dispo;
    }

    public String getid(){
        return getId();
    }
}