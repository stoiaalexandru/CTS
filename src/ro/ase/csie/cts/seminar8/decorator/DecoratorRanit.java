package ro.ase.csie.cts.seminar8.decorator;

import ro.ase.csie.cts.seminar8.adapter.ACMECaracterJoc;

public class DecoratorRanit extends DecoratorCaracter {
    public DecoratorRanit(ACMECaracterJoc caracterJoc) {
        super(caracterJoc);
    }

    @Override
    public void seDeplaseaza() {
        if (this.caracterJoc.getPuncteViata() < 200) {
            System.out.println("Este ranit, se deplaseaza incet");
        } else {
            super.seDeplaseaza();
        }
    }
}
