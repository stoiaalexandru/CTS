package ro.ase.csie.cts.seminar9.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        ProfilPlayer player = new ProfilPlayer("Superman", 60 , 5);
        player.setStrategieBonus(new StrategiePaste());
        player.getBonus();
        player.setStrategieBonus(new StrategieCraciun());
        player.getBonus();

        player.setStrategieBonus(new InterfataBonus() {
            @Override
            public int getPuncteBonus(ProfilPlayer player) {
                if(player.nrNiveluri > 3){
                    return 30;
                }
                else return 5;
            }
        });
        player.getBonus();
    }
}
