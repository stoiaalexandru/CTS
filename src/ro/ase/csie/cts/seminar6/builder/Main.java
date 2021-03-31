package ro.ase.csie.cts.seminar6.builder;

public class Main {
    public static void main(String[] args) {
        SuperErou batman =
                new SuperErou.SuperErouBuilder("Batman",100)
                .setArmaDreapta(new Arma())
                .setArmaStanga(new Arma())
                .build();

        SuperErou joker=
                new SuperErou.SuperErouBuilder("Joker",200)
                .esteNegativ()
                .esteRanitGrav()
                .setArmaDreapta(new Arma())
                .build();
    }
}
