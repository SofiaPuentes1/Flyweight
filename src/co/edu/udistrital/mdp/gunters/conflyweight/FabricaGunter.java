package co.edu.udistrital.mdp.gunters.conflyweight;

import java.util.HashMap;
import java.util.Map;

public class FabricaGunter {

    private Map<String, Gunter> pool = new HashMap<>();

    public Gunter obtenerGunter(String tipo) {
        Gunter gunter = pool.get(tipo);
        if (gunter == null) {
            gunter = new Gunter(tipo);
            pool.put(tipo, gunter);
        }
        return gunter;
    }

    public int cantidadGuntersCreados() {
        return pool.size();
    }
}
