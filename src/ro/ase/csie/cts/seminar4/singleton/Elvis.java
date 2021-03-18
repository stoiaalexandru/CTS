package ro.ase.csie.cts.seminar4.singleton;

public class Elvis {

    public static final Elvis theTrueElvis = new Elvis();

    private Elvis(){

    }

    public void sing(){
        System.out.println("Elvis is singing");
    }
}
