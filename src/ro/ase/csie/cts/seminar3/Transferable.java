package ro.ase.csie.cts.seminar3;

public interface Transferable {

   void transfer (Recievable destination, long amount) throws InsuficientFundsException;
}
