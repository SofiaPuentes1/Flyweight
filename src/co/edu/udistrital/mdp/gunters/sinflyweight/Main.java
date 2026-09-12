package co.edu.udistrital.mdp.gunters.sinflyweight;

import java.util.Random;
import co.edu.udistrital.mdp.gunters.util.MemoryDisplay;

public class Main {

    private static final int TOTAL_PINGUINOS = 100000;
    private static final int TOTAL_ACTIVAR = 500;
    private static final String[] TIPOS = {"Normal", "Con sombrero"};

    public static void main(String[] args) {
        Random random = new Random();

        long memoriaAntes = MemoryDisplay.memoriaUsadaMB();

        GunterCompleto[] gunters = new GunterCompleto[TOTAL_PINGUINOS];
        for (int i = 0; i < TOTAL_PINGUINOS; i++) {
            String tipo = TIPOS[i % 2];
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            gunters[i] = new GunterCompleto(tipo, x, y);
        }

        long memoriaDespues = MemoryDisplay.memoriaUsadaMB();

        for (int i = 0; i < TOTAL_ACTIVAR; i++) {
            gunters[i].activar();
        }

        System.out.println("...");
        System.out.println("Total de pingüinos simulados: " + TOTAL_PINGUINOS);
        System.out.println("Total de objetos GunterCompleto creados: " + TOTAL_PINGUINOS);
        System.out.println("Memoria antes (MB): " + memoriaAntes);
        System.out.println("Memoria después (MB): " + memoriaDespues);
        System.out.println("Memoria consumida (MB): " + (memoriaDespues - memoriaAntes));
    }
}
