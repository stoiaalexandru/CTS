package ro.ase.csie.cts.seminar7.simplefactory;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SuperErouAbstract supererou = new CaracterDisney("Mickey Mouse",100,false);
        SuperErouAbstract supererou2 = new CaracterMarvel("Spiderman",150,50);
        SuperErouAbstract supererou3 = new CaracterDCComics("Batman",150);

        SuperErouAbstract superCaracter = FactorySuperou.getSuperErou(TipErou.DISNEY,"Mickey Mouse");
        superCaracter = FactorySuperou.getSuperErou(TipErou.MARVEL,"Spiderman");
        superCaracter = FactorySuperou.getSuperErou(TipErou.DC,"Batman");
    }
}
