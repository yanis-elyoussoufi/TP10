package fr.umontpellier.iut;

import java.util.HashMap;

public class GestionDistance {
    private static HashMap<String, Integer> distances;

    static {
        distances = new HashMap<>();
        distances.put("Montpellier",0);
        distances.put("Sète",36);
        distances.put("Nimes",58);
        distances.put("Lunel",30);
        distances.put("Béziers",80);
        distances.put("Sommières",30);

    }

    public static int getDistances(String ville) {
        return distances.get(ville);
    }


}
