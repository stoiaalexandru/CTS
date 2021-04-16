package ro.ase.csie.cts.seminar5Recuperare.composite;

public class CaracterNPC extends NodAbstractStructura{

    private String nume;
    private int putere;

    public CaracterNPC(String nume, int putere) {
        this.nume = nume;
        this.putere = putere;
    }

    @Override
    public void atacaJucator(String numeJucator) {
        System.out.printf("%s ataca pe %s%n",this.nume,numeJucator);
    }

    @Override
    public void seRetrage() {
        System.out.printf("%s se retrage %n",this.nume);
    }

    @Override
    public void seDeplaseaza() {
        System.out.printf("%s se deplaseaza %n",this.nume);
    }

    @Override
    public void adaugaNod(NodAbstractStructura nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeNod(NodAbstractStructura nod) {
        throw new UnsupportedOperationException();
    }

    @Override
    public NodAbstractStructura getNod(int index) {
        throw new UnsupportedOperationException();
    }
}
