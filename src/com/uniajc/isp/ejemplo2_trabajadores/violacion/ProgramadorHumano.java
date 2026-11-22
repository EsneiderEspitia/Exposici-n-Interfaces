package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * Trabajador humano que puede cumplir naturalmente con todas las responsabilidades del contrato.
 */
public class ProgramadorHumano implements Trabajador {

    private String nombre;

    public ProgramadorHumano(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("[" + nombre + "] Escribiendo código Java y solucionando bugs.");
    }

    @Override
    public void almorzar() {
        System.out.println("[" + nombre + "] Almorzando en la cafetería corporativa.");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("[" + nombre + "] Tomando una pausa activa con café.");
    }

    @Override
    public void cobrarSalario(double monto) {
        System.out.println("[" + nombre + "] Cobrando nómina por $" + monto + " transferido a cuenta bancaria.");
    }
}
