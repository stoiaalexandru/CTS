package ro.ase.csie.cts.seminar9.composite;

public class TestComposite {
    public static void main(String[] args) {
        GrupCaractere grup1= new GrupCaractere("Grup 1");
        grup1.adaugaNod(new CaracterNPC("Soldat 1",100));
        grup1.adaugaNod(new CaracterNPC("Soldat 2",100));

        GrupCaractere grup2= new GrupCaractere("Grup 2");
        grup1.adaugaNod(new CaracterNPC("Soldat 3",100));
        grup1.adaugaNod(new CaracterNPC("Tanc",100));

        GrupCaractere grupNivelJoc= new GrupCaractere("Level 2");
        grupNivelJoc.adaugaNod(new CaracterNPC("Level Boss", 1000));
        grupNivelJoc.adaugaNod(grup1);
        grupNivelJoc.adaugaNod(grup2);

        grupNivelJoc.atacaJucator("Superman");
        grupNivelJoc.seRetrage();
        grupNivelJoc.getNod(0).seDeplaseaza();
    }
}
