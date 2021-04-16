package ro.ase.csie.cts.seminar5Recuperare.flyweight;

public class ContextEcran {
    private int x;
    private int y;
    private String culoareTextura;

    public ContextEcran(int x, int y, String culoareTextura) {
        this.x = x;
        this.y = y;
        this.culoareTextura = culoareTextura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getCuloareTextura() {
        return culoareTextura;
    }

    public void setCuloareTextura(String culoareTextura) {
        this.culoareTextura = culoareTextura;
    }
}
