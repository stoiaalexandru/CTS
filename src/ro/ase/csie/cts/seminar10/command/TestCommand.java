package ro.ase.csie.cts.seminar10.command;

public class TestCommand {
    public static void main(String[] args) {
        TaskAsincron autosave =  new TaskToDo(new ModulAutosave(),"Autosave", 5);
        TaskAsincron autoUpdate =  new TaskToDo(new ModulUpdateClient(),"Update v2", 20);

        autosave.executaTask();
        autoUpdate.executaTask();
    }
}
