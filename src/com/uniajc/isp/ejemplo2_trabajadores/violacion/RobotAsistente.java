package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * Robot Asistente obligado a implementar una interfaz gorda incompatible con su naturaleza.
 */
public class RobotAsistente implements Trabajador {

    private String serial;

    public RobotAsistente(String serial) {
        this.serial = serial;
    }

    @Override
    public void trabajar() {
        System.out.println("[Robot-" + serial + "] Procesando tareas automatizadas 24/7.");
    }

    @Override
    public void almorzar() {
        // VIOLACIÓN ISP: Forzar métodos absurdos
        throw new UnsupportedOperationException("Violación ISP: Un robot no consume alimentos orgánicos.");
    }

    @Override
    public void tomarDescanso() {
        // VIOLACIÓN ISP: Los robots no toman descansos fisiológicos
        throw new UnsupportedOperationException("Violación ISP: Un robot industrial no toma descansos para café.");
    }

    @Override
    public void cobrarSalario(double monto) {
        // VIOLACIÓN ISP: Los robots no tienen cuenta bancaria ni cobran salario
        throw new UnsupportedOperationException("Violación ISP: Un robot no cobra salario (¿Cobrar salario? ¿Descansos? Absurdo).");
    }
}
