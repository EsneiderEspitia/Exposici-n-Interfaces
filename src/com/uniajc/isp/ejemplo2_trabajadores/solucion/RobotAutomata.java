package com.uniajc.isp.ejemplo2_trabajadores.solucion;

/**
 * El robot implementa únicamente Trabajable y Recargable.
 * No tiene relación alguna con comida, salario o descansos biológicos.
 */
public class RobotAutomata implements Trabajable, Recargable {
    private String idSerie;

    public RobotAutomata(String idSerie) {
        this.idSerie = idSerie;
    }

    @Override
    public void trabajar() {
        System.out.println("[Robot " + idSerie + "] Compilando y ejecutando pruebas automatizadas sin interrupción.");
    }

    @Override
    public void recargarBateria() {
        System.out.println("[Robot " + idSerie + "] Conectado a la estación de carga rápida (100% batería).");
    }
}
