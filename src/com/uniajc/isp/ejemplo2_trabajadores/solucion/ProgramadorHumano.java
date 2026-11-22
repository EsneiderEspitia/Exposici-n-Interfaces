package com.uniajc.isp.ejemplo2_trabajadores.solucion;

/**
 * Programador humano: implementa exactamente los roles que le corresponden por su naturaleza.
 * Es Trabajable, Alimentable, Descansable y Remunerable.
 */
public class ProgramadorHumano implements Trabajable, Alimentable, Descansable, Remunerable {

    private String nombre;

    public ProgramadorHumano(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("[Programador " + nombre + "] Diseñando arquitectura y programando microservicios.");
    }

    @Override
    public void almorzar() {
        System.out.println("[Programador " + nombre + "] Almorzando menú saludable en la cafetería.");
    }

    @Override
    public void tomarDescanso() {
        System.out.println("[Programador " + nombre + "] Tomando 15 minutos de descanso y café.");
    }

    @Override
    public void cobrarSalario(double monto) {
        System.out.println("[Programador " + nombre + "] Pago de nómina recibido: $" + String.format("%.2f", monto));
    }
}
