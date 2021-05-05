package ro.ase.csie.cts.seminar10.chain;

public class ModulChatPrivat extends NodChainAbstract {

    public static final String NUME_MODUL = "Modul chat privat";

    public ModulChatPrivat() {
        super(NUME_MODUL);
    }

    @Override
    public void procesareMesajChat(MesajChat mesaj) {
        if (mesaj.getDestinatie().isEmpty() || mesaj.getDestinatie().equals("@Everyone")) {
            if (this.next != null) {
                this.next.procesareMesajChat(mesaj);
            }

        } else {
            System.out.println(String.format("Mesaj privat pentru %s : %s", mesaj.getDestinatie(), mesaj.getContinut()));
        }
    }
}
