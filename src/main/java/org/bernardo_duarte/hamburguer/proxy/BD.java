package org.bernardo_duarte.hamburguer.proxy;

import java.util.HashMap;
import java.util.Map;

public class BD {
    private static final Map<Integer, Hamburguer> hamburgueres = new HashMap<>();

    public static Hamburguer getHamburguer(Integer codigo) {
        return hamburgueres.get(codigo);
    }

    public static void addHamburguer(Hamburguer hamburguer) {
        hamburgueres.put(hamburguer.getCodigo(), hamburguer);
    }

    public static void clear() {
        hamburgueres.clear();
    }
}
