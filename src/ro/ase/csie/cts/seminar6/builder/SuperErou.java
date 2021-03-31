package ro.ase.csie.cts.seminar6.builder;

public class SuperErou {

    String nume;
    int puncteViata;

    boolean esteNegativ;
    boolean esteRanitGrav;

    InterfataArma armaStanga;
    InterfataArma armaDreapta;
    InterfataSuperPutere superPutere;
    InterfataSuperPutere superSuperPutere;

    private SuperErou() {
    }

    public String getNume() {
        return nume;
    }

    public int getPuncteViata() {
        return puncteViata;
    }

    public boolean esteNegativ() {
        return esteNegativ;
    }

    public boolean esteRanitGrav() {
        return esteRanitGrav;
    }

    public InterfataArma getArmaStanga() {
        return armaStanga;
    }

    public InterfataArma getArmaDreapta() {
        return armaDreapta;
    }

    public InterfataSuperPutere getSuperPutere() {
        return superPutere;
    }

    public InterfataSuperPutere getSuperSuperPutere() {
        return superSuperPutere;
    }



    class SuperErouBuilder{

    }
}
