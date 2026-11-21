package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * Demostración de problemas generados al modelar con una interfaz general y saturada.
 */
public class MainViolacion {

    public static void rutinaCafeteria(Trabajador t) {
        System.out.println("-> Coordinando horario de almuerzo...");
        t.almorzar();
    }

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("  DEMOSTRACIÓN: VIOLACIÓN DEL ISP (Ejemplo Trabajadores)");
        System.out.println("============================================================\n");

        Trabajador humano = new DesarrolladorHumano("Carlos Espitia");
        Trabajador robot = new RobotAsistente("BOT-AI-9000");

        System.out.println("--- 1. Asignando trabajo general ---");
        humano.trabajar();
        robot.trabajar();

        System.out.println("\n--- 2. Turno del almuerzo en cafetería ---");
        rutinaCafeteria(humano);

        System.out.println("\nIntentando enviar al robot a almorzar...");
        try {
            rutinaCafeteria(robot);
        } catch (UnsupportedOperationException e) {
            System.err.println("❌ ERROR INESPERADO: " + e.getMessage());
            System.err.println("-> Diagnóstico: Se obligó a la clase 'RobotAsistente' a depender de una operación biológica.");
        }
    }
}
