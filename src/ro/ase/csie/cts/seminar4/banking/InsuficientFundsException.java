package ro.ase.csie.cts.seminar4.banking;

public class InsuficientFundsException extends Exception {

    public InsuficientFundsException(String message) {
        super(message);
    }
}
