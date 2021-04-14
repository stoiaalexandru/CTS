package ro.ase.csie.cts.seminar8.decorator;

import ro.ase.csie.cts.seminar8.adapter.ACMECaracterJoc;
import ro.ase.csie.cts.seminar8.adapter.CaracterFantastic;

public class TestDecorator {
    public static void main(String[] args) {
        ACMECaracterJoc dragon = new CaracterFantastic("Dragonul albastru", 1000);
        dragon.seDeplaseaza();
        dragon.esteLovit(100);
        dragon.seVindeca(100);

        dragon = new DecoratorScut(dragon,200);
        dragon.esteLovit(800);
        dragon = new DecoratorRanit(dragon);
        dragon.seDeplaseaza();

    }
}
