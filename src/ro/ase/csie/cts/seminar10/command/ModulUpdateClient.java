package ro.ase.csie.cts.seminar10.command;

public class ModulUpdateClient implements  InterfataModulJoc{
    @Override
    public void executaActiune(String numeActiune) {
        System.out.println("Update client joc. Detalii:" + numeActiune);
    }
}
