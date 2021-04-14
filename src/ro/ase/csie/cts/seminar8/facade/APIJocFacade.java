package ro.ase.csie.cts.seminar8.facade;

public class APIJocFacade {
    public static ProfilJucator getProfil(String ipServer, int port,String nume_utilizator, String paorla){
        ServerJoc server = new ServerJoc(ipServer, port);
        if(server.conectare()){
            Utilizator utilizator= new Utilizator();
            utilizator.login(nume_utilizator, paorla);
            ProfilJucator profilJucator = utilizator.getProfil();
            return profilJucator;
        }
        else return null;
    }
}
