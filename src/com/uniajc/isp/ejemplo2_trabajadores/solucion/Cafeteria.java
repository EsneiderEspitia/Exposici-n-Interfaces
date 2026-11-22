package com.uniajc.isp.ejemplo2_trabajadores.solucion;

import java.util.List;

/**
 * Desacoplamiento Empresarial:
 * La Cafetería solo pide entidades 'Alimentable'.
 * Es imposible por tipo invocar un robot aquí.
 */
public class Cafeteria {

    public static void servirAlmuerzos(List<Alimentable> comensales) {
        System.out.println(">>> [Cafetería] Sirviendo almuerzo a personal biológico:");
        for (Alimentable a : comensales) {
            a.almorzar();
        }
    }
}
