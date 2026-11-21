package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * Trabajador autómata/robotizado.
 * 
 * ALERTA: Debido a la violación de ISP, esta clase está forzada
 * a implementar métodos que no tienen sentido para una máquina.
 */
public class RobotAsistente implements Trabajador {
    private String codigoSerie;

    public RobotAsistente(String codigoSerie) {
        this.codigoSerie = codigoSerie;
    }

    @Override
    public void trabajar() {
        System.out.println("[Robot " + codigoSerie + "] Ejecutando pipelines de integración continua y despliegues.");
    }

    @Override
    public void almorzar() {
        // VIOLACIÓN DE ISP: Un robot no ingiere comida
        throw new UnsupportedOperationException("ERROR: El robot " + codigoSerie + " no consume alimentos orgánicos.");
    }

    @Override
    public void tomarDescanso() {
        // VIOLACIÓN DE ISP: Un robot opera continuamente
        throw new UnsupportedOperationException("ERROR: El robot " + codigoSerie + " opera 24/7 y no requiere descansos.");
    }

    @Override
    public void cobrarSalario(double monto) {
        // VIOLACIÓN DE ISP: Un robot no tiene cuenta bancaria ni cobra salario
        throw new UnsupportedOperationException("ERROR: El robot " + codigoSerie + " no recibe remuneración salarial.");
    }
}
