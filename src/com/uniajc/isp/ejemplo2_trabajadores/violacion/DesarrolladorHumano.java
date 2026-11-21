package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * Trabajador biológico estándar. Cumple todos los métodos sin problema.
 */
public class DesarrolladorHumano implements Trabajador {
    private String nombre;

    public DesarrolladorHumano(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("[" + nombre + "] Escribiendo código Java y solucionando bugs.");
    }

    @Override
    public void almorzar() {
        System.out.println("[" + nombre + "] Tomando hora de almuerzo en la cafetería.");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("[" + nombre + "] Realizando pausa activa de 15 minutos.");
    }

    @Override
    public void cobrarSalario(double monto) {
        System.out.println("[" + nombre + "] Cobrando salario mensual de $" + monto + " COP.");
    }
}
