package ro.ase.csie.cts.seminar8.adapter;

public class AdaptorDisneyLaAcme extends ACMECaracterJoc {
    ActiuniDisney caracterDisney = null;

    public AdaptorDisneyLaAcme( ActiuniDisney caracterDisney){
        super(caracterDisney.getNume(),caracterDisney.getPower());
        this.caracterDisney=caracterDisney;
    }

    @Override
    public void seDeplaseaza() {
        this.caracterDisney.move(0,0);
    }

    @Override
    public void esteLovit(int puncte) {
        this.caracterDisney.primesteLovitura(puncte);
    }

    @Override
    public void seVindeca(int puncte) {
        this.caracterDisney.reincarca(puncte);
    }
}
