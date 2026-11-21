package com.uniajc.isp.ejemplo2_trabajadores.solucion;

/**
 * El programador humano solo implementa los contratos que le corresponden.
 */
public class ProgramadorHumano implements Trabajable, Alimentable, Descansable, Remunerable {
    private String nombre;

    public ProgramadorHumano(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("[" + nombre + "] Desarrollando componentes y revisando Pull Requests.");
    }

    @Override
    public void almorzar() {
        System.out.println("[" + nombre + "] Almorzando en la cafetería con sus compañeros.");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("[" + nombre + "] Tomando pausa activa de estiramiento.");
    }

    @Override
    public void cobrarSalario(double monto) {
        System.out.println("[" + nombre + "] Recibiendo pago de nómina: $" + monto + " COP.");
    }
}
