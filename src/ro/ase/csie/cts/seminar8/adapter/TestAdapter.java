package ro.ase.csie.cts.seminar8.adapter;

import java.util.ArrayList;

public class TestAdapter {
    public static void main(String[] args) {
        CaracterFantastic dragon = new CaracterFantastic("Dragonul albastru", 1000);
        dragon.seDeplaseaza();
        dragon.esteLovit(100);
        dragon.seVindeca(100);

        DonaldDuck donaldDuck =new DonaldDuck(500);
        donaldDuck.move(100,100);
        donaldDuck.primesteLovitura(100);
        donaldDuck.reincarca(200);

        ArrayList<ACMECaracterJoc> caractere= new ArrayList<>();
        caractere.add(dragon);

        AdaptorDisneyLaAcme adaptorDonald = new AdaptorDisneyLaAcme(donaldDuck);
        caractere.add(adaptorDonald);

        System.out.println("-----");

        for (ACMECaracterJoc caracter : caractere){
            caracter.seDeplaseaza();
            caracter.esteLovit(50);
        }
    }
}