package ro.ase.csie.cts.seminar10.chain;

public abstract class NodChainAbstract {

    NodChainAbstract next =null;

    String numeModul;

    public NodChainAbstract(String numeModul) {
        super();
        this.numeModul = numeModul;
    }

    public NodChainAbstract getNext() {
        return next;
    }

    public void setNext(NodChainAbstract next) {
        this.next = next;
    }

    public abstract void procesareMesajChat(MesajChat mesaj);
}
