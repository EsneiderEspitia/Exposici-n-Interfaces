package com.uniajc.isp.ejemplo2_trabajadores.solucion;

import java.util.List;

/**
 * Desacoplamiento Empresarial:
 * El Gestor de Tareas solo pide entidades que sean 'Trabajable'.
 * Le es indiferente si son humanos o robots.
 */
public class GestorDeTareas {

    public static void asignarJornada(List<Trabajable> equipo) {
        System.out.println(">>> [Gestor de Tareas] Asignando órdenes de trabajo:");
        for (Trabajable t : equipo) {
            t.trabajar();
        }
    }
}
