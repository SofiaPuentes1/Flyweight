package co.edu.udistrital.mdp.gunters.conflyweight;

import java.util.Random;
import co.edu.udistrital.mdp.gunters.util.MemoryDisplay;

public class Main {

    private static final int TOTAL_PINGUINOS = 100000;
    private static final int TOTAL_ACTIVAR = 500;
    private static final String[] TIPOS = {"Normal", "Con sombrero"};

    public static void main(String[] args) {
        Random random = new Random();
        FabricaGunter fabrica = new FabricaGunter();

        long memoriaAntes = MemoryDisplay.memoriaUsadaMB();

        PosicionGunter[] posiciones = new PosicionGunter[TOTAL_PINGUINOS];
        for (int i = 0; i < TOTAL_PINGUINOS; i++) {
            String tipo = TIPOS[i % 2];
            Gunter gunter = fabrica.obtenerGunter(tipo);
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            posiciones[i] = new PosicionGunter(x, y, gunter);
        }

        long memoriaDespues = MemoryDisplay.memoriaUsadaMB();

        for (int i = 0; i < TOTAL_ACTIVAR; i++) {
            posiciones[i].activar();
        }

        System.out.println("...");
        System.out.println("Total de pingüinos simulados: " + TOTAL_PINGUINOS);
        System.out.println("Total de objetos Flyweight (Gunter) creados: " + fabrica.cantidadGuntersCreados());
        System.out.println("Memoria antes (MB): " + memoriaAntes);
        System.out.println("Memoria después (MB): " + memoriaDespues);
        System.out.println("Memoria consumida (MB): " + (memoriaDespues - memoriaAntes));
    }
}
