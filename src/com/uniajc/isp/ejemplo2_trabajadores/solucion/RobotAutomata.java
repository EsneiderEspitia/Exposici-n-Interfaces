package com.uniajc.isp.ejemplo2_trabajadores.solucion;

/**
 * Robot autónomo: implementa únicamente Trabajable y Recargable.
 * No finge almorzar, descansar ni cobrar salario.
 */
public class RobotAutomata implements Trabajable, Recargable {

    private String modeloId;

    public RobotAutomata(String modeloId) {
        this.modeloId = modeloId;
    }

    public String getModeloId() {
        return modeloId;
    }

    @Override
    public void trabajar() {
        System.out.println("[Robot " + modeloId + "] Ejecutando tareas de cómputo y ensamblaje continuo.");
    }

    @Override
    public void recargarBateria() {
        System.out.println("[Robot " + modeloId + "] Acoplado a estación de inducción rápida al 100%.");
    }
}
