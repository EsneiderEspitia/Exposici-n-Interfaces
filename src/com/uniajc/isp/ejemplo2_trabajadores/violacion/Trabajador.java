package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * VIOLACIÓN DE ISP: Interfaz monolítica que asume que todo trabajador
 * tiene necesidades biológicas, laborales y financieras idénticas.
 */
public interface Trabajador {
    void trabajar();
    void almorzar();
    void tomarDescanso();
    void cobrarSalario(double monto);
}
