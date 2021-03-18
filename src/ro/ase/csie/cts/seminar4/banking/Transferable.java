package ro.ase.csie.cts.seminar4.banking;

public interface Transferable {

   void transfer (Recievable destination, long amount) throws InsuficientFundsException;
}
