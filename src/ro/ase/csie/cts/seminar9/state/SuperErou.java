package ro.ase.csie.cts.seminar9.state;

public class SuperErou {

    public static final int NIVEL_CRITIC = 10;

    String nume;
    int puncteViata;

    InterfataMiscare modMiscare;

    public SuperErou(String nume, int puncteViata) {
        this.nume = nume;
        this.puncteViata = puncteViata;
        this.modMiscare =  new MiscareNormala();
    }

    void seDeplaseaza(){
        this.modMiscare.seDeplaseaza();
    }

    void esteAtacat(int puncte){
        this.puncteViata -= puncte;
        if (this.puncteViata < NIVEL_CRITIC){
            this.modMiscare = new MiscareRanit();
        }
    }

    void seVindeca(int puncte){
        this.puncteViata+= puncte;
        if(this.puncteViata > NIVEL_CRITIC){
            this.modMiscare = new MiscareNormala();
        }
    }
}
