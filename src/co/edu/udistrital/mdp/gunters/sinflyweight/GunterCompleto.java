package co.edu.udistrital.mdp.gunters.sinflyweight;

public class GunterCompleto {

    private String tipo;
    private String sonido;
    private int x;
    private int y;

    public GunterCompleto(String tipo, int x, int y) {
        this.tipo = tipo;
        this.sonido = "Wenk";
        this.x = x;
        this.y = y;
    }

    public void activar() {
        System.out.println(sonido + "! Gunter " + tipo + " en posición (" + x + ", " + y + ")");
    }

    public String getTipo() {
        return tipo;
    }

    public String getSonido() {
        return sonido;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
