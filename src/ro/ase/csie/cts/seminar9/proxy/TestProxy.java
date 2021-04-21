package ro.ase.csie.cts.seminar9.proxy;

public class TestProxy {
    public static void main(String[] args) {
        ModulLogin loginInstance = new ModulLogin("10.0.0.1", 127);
        InterfataModulLogin login = new ProxyLogin(loginInstance);
        if(login.login("admin","admin12"))
            System.out.println("Hello admin");

        String[] parole = new String[]{"1234", "123456", "admin", "root", "admin12"};
        for(String parola : parole){
            if(login.login("admin",parola))
                System.out.println("Parola gasita " +parola );
        }
    }
}
