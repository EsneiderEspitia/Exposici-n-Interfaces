package com.uniajc.isp.ejemplo2_trabajadores.solucion;

import java.util.List;

/**
 * Demostración de diseño desacoplado usando interfaces de rol (ISP).
 * Cada servicio de la empresa consume únicamente la interfaz requerida.
 */
public class MainSolucion {

    // El gestor de operaciones solo necesita que el recurso sea Trabajable
    public static void asignarJornadaLaboral(List<Trabajable> trabajadores) {
        System.out.println("--- GESTOR DE OPERACIONES: Asignando tareas ---");
        for (Trabajable t : trabajadores) {
            t.trabajar();
        }
    }

    // El servicio de bienestar/cafetería solo acepta entidades Alimentables
    public static void gestionarAlmuerzo(Alimentable serVivo) {
        serVivo.almorzar();
    }

    // El área de nómina solo interactúa con entidades Remunerables
    public static void procesarNomina(Remunerable empleado, double monto) {
        empleado.cobrarSalario(monto);
    }

    // El área técnica solo interactúa con entidades Recargables
    public static void darMantenimientoEnergia(Recargable dispositivo) {
        dispositivo.recargarBateria();
    }

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("   DEMOSTRACIÓN: SOLUCIÓN CON ISP (Ejemplo Trabajadores)");
        System.out.println("============================================================\n");

        ProgramadorHumano programador = new ProgramadorHumano("Carlos Espitia");
        RobotAutomata robot = new RobotAutomata("ROBOT-UNIAJC-2026");

        // 1. Asignar trabajo a ambos (ambos son Trabajables)
        asignarJornadaLaboral(List.of(programador, robot));

        // 2. Cafetería (solo programador es Alimentable)
        System.out.println("\n--- GESTIÓN DE CAFETERÍA (Segregado por Alimentable) ---");
        gestionarAlmuerzo(programador);
        // NOTA: Si intentáramos compilar: gestionarAlmuerzo(robot);
        // El compilador de Java lo impide con un error seguro de tipos antes de tiempo de ejecución!

        // 3. Estación de recarga (solo robot es Recargable)
        System.out.println("\n--- MANTENIMIENTO TÉCNICO (Segregado por Recargable) ---");
        darMantenimientoEnergia(robot);

        // 4. Pago de Nómina (solo humano es Remunerable)
        System.out.println("\n--- GESTIÓN DE NÓMINA (Segregado por Remunerable) ---");
        procesarNomina(programador, 3500000.0);

        System.out.println("\n✅ ÉXITO: El sistema es robusto, seguro en tipos y libre de métodos innecesarios.");
    }
}
