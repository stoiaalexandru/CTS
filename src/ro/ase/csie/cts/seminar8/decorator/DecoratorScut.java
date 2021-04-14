package ro.ase.csie.cts.seminar8.decorator;

import ro.ase.csie.cts.seminar8.adapter.ACMECaracterJoc;

public class DecoratorScut extends DecoratorCaracter{

    int nivelScut;

    public DecoratorScut(ACMECaracterJoc caracterJoc, int nivelScut) {
        super(caracterJoc);
        this.nivelScut=nivelScut;
    }

    @Override
    public void esteLovit(int puncte) {
       int puncteLovitura = puncte - this.nivelScut;
       if (puncteLovitura > 0){
           super.esteLovit(puncteLovitura);
       }
    }
}
