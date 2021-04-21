package ro.ase.csie.cts.seminar9.strategy;

public class StrategiePaste implements InterfataBonus{
    @Override
    public int getPuncteBonus(ProfilPlayer player) {
        if (player.playtime>50)
            return 50;
        else
            return 0 ;
    }
}
