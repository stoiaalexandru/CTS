package ro.ase.csie.cts.seminar9.proxy;

public class ModulLogin implements InterfataModulLogin {

    String ipServer;
    int port;

    public ModulLogin(String ipServer, int port) {
        super();
        this.ipServer = ipServer;
        this.port = port;
    }

    @Override
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin12");
    }

    @Override
    public boolean verificaStatusServer() {
        return true;
    }
}
