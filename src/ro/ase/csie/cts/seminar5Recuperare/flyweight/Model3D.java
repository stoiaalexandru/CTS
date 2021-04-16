package ro.ase.csie.cts.seminar5Recuperare.flyweight;

import java.util.ArrayList;

public class Model3D implements InterfataModel3D{

    String descriere;
    ArrayList<Integer> puncteModel = new ArrayList<>();

    public Model3D(String descriere) {
        this.descriere = descriere;
    }

    @Override
    public void incarcaModel3D(String fisier) {
        System.out.printf("Incarcare model pentru %s din fisierul %s%n",descriere,fisier);
        for(int i=0;i<10;i++)
        {
            puncteModel.add(i);
        }
    }

    @Override
    public void afisareEcran(ContextEcran context) {
        System.out.println(
                String.format("Afisare %s la %d,%d cu textura %s",
                        descriere,context.getX(),context.getY(),context.getCuloareTextura()));
    }
}
