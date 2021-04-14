package ro.ase.csie.cts.seminar8.facade;

public class TestFacade {
    public static void main(String[] args) {
        ServerJoc server = new ServerJoc("10.0.0.1", 3306);
        if(server.conectare()){
            Utilizator utilizator= new Utilizator();
            utilizator.login("Player 1", "1234");
            ProfilJucator profilJucator = utilizator.getProfil();
            String dateProfil = profilJucator.getDateProfil();
        }

        ProfilJucator profilJucator2= APIJocFacade.getProfil("10.0.0.1", 3306,"Player2","123456");
    }
}
