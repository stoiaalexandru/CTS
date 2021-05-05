package ro.ase.csie.cts.seminar10.chain;

public class MesajChat {

    String destinatie;
    String continut;
    int prioritate;

    public MesajChat(String destinatie, String continut, int prioritate) {
        this.destinatie = destinatie;
        this.continut = continut;
        this.prioritate = prioritate;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public String getContinut() {
        return continut;
    }

    public int getPrioritate() {
        return prioritate;
    }
}
