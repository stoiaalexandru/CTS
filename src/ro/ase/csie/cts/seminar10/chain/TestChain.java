package ro.ase.csie.cts.seminar10.chain;

public class TestChain {
    public static void main(String[] args) {
        NodChainAbstract chatGlobal = new ModulChatGlobal();
        NodChainAbstract chatPrivat = new ModulChatPrivat();
        NodChainAbstract filtruChat = new ModulFiltru("Reguli limba romana");

        filtruChat.setNext(chatPrivat);
        chatPrivat.setNext(chatGlobal);

        NodChainAbstract serverChat = filtruChat;

        serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti rau",1));
        serverChat.procesareMesajChat(new MesajChat("@Everyone", "Esti ok",1));
        serverChat.procesareMesajChat(new MesajChat("@Gigel", "Hai sa incercam nivelul 5",1));
    }
}
