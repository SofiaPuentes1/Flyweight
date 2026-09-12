package co.edu.udistrital.mdp.gunters.conflyweight;

public class PosicionGunter {

    private int x;
    private int y;
    private Gunter gunter;

    public PosicionGunter(int x, int y, Gunter gunter) {
        this.x = x;
        this.y = y;
        this.gunter = gunter;
    }

    public void activar() {
        gunter.hacerSonido(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Gunter getGunter() {
        return gunter;
    }
}
