package ro.ase.csie.cts.seminar6.builder;

public class SuperErou {

    private String nume;
    private int puncteViata;

    private boolean esteNegativ;
    private boolean esteRanitGrav;

    private InterfataArma armaStanga;
    private InterfataArma armaDreapta;
    private InterfataSuperPutere superPutere;
    private InterfataSuperPutere superSuperPutere;

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


    public static class SuperErouBuilder {
        SuperErou superErou;

        public SuperErouBuilder(String nume, int puncteViata) {
            this.superErou = new SuperErou();
            this.superErou.nume = nume;
            this.superErou.puncteViata = puncteViata;
        }

        public SuperErouBuilder esteNegativ() {
            this.superErou.esteNegativ = true;
            return this;
        }

        public SuperErouBuilder esteRanitGrav() {
            this.superErou.esteRanitGrav = true;
            return this;
        }

        public SuperErouBuilder setArmaStanga(InterfataArma arma) {
            this.superErou.armaStanga = arma;
            return this;
        }

        public SuperErouBuilder setArmaDreapta(InterfataArma arma) {
            this.superErou.armaDreapta = arma;
            return this;
        }

        public SuperErouBuilder setSuperPutere(InterfataSuperPutere superPutere) {
            this.superErou.superPutere = superPutere;
            return this;
        }

        public SuperErouBuilder setSuperSuperPutere(InterfataSuperPutere superSuperPutere) {
            this.superErou.superSuperPutere = superSuperPutere;
            return this;
        }

        public SuperErou build() {
            return this.superErou;
        }
    }
}
