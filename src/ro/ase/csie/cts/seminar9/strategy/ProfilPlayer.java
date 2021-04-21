package ro.ase.csie.cts.seminar9.strategy;

public class ProfilPlayer {
    String username;
    double playtime;
    int nrNiveluri;

    InterfataBonus strategieBonus = null;

    public ProfilPlayer(String username, double playtime, int nrNiveluri) {
        this.username = username;
        this.playtime = playtime;
        this.nrNiveluri = nrNiveluri;
    }

    public void setStrategieBonus(InterfataBonus strategieBonus){
        this.strategieBonus=strategieBonus;
    }

    public void getBonus(){
        if (this.strategieBonus !=null){
            int puncteBonus = this.strategieBonus.getPuncteBonus(this);
            System.out.println("Ai primit puncte bonus: " + puncteBonus);
        }
        else
            throw new UnsupportedOperationException();
    }
}
