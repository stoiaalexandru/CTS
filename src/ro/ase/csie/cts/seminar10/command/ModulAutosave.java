package ro.ase.csie.cts.seminar10.command;

public class ModulAutosave implements InterfataModulJoc{
    @Override
    public void executaActiune(String numeActiune) {
        System.out.println("Se realizeaza autosave pentru "+ numeActiune);
    }
}
