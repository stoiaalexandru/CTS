package ro.ase.csie.cts.seminar4.singleton;

public class Elvis {

    private static Elvis theTrueElvis;

    private Elvis() {

    }

    public static Elvis getInstance() {

        synchronized (Elvis.class) {
            if (theTrueElvis == null) {
                theTrueElvis = new Elvis();
            }
            return theTrueElvis;
        }
    }

    public void sing() {
        System.out.println("Elvis is singing");
    }
}
