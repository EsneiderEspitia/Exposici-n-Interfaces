package com.uniajc.isp.ejemplo2_trabajadores.violacion;

import java.util.ArrayList;
import java.util.List;

public class MainViolacion {

    public static void horaDelAlmuerzo(List<Trabajador> trabajadores) {
        System.out.println("\n--- HORA DEL ALMUERZO EN LA EMPRESA ---");
        for (Trabajador t : trabajadores) {
            t.almorzar(); // ¡Explotará cuando sea un RobotAsistente!
        }
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN VIOLACIÓN ISP: TRABAJADORES Y ROBOTS");
        System.out.println("==================================================");

        List<Trabajador> equipo = new ArrayList<>();
        equipo.add(new ProgramadorHumano("Carlos"));
        equipo.add(new RobotAsistente("RX-9000"));

        System.out.println("\n1. Jornada Laboral (trabajar):");
        for (Trabajador t : equipo) {
            t.trabajar();
        }

        System.out.println("\n2. Intentando enviar a todo el equipo a almorzar:");
        try {
            horaDelAlmuerzo(equipo);
        } catch (UnsupportedOperationException e) {
            System.err.println("\n[ERROR CRÍTICO EN RUNTIME]");
            System.err.println("Excepción capturada: " + e.getMessage());
            System.err.println("Explicación: El sistema obligó a un RobotAsistente a implementar 'almorzar()',");
            System.err.println("causando que el polimorfismo falle y se rompa el contrato en ejecución.");
        }
    }
}
