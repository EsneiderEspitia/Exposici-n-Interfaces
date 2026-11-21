package com.uniajc.isp.ejemplo2_trabajadores.solucion;

/**
 * ISP: Interfaz segregada para entidades con derecho a compensación económica.
 */
public interface Remunerable {
    void cobrarSalario(double monto);
}
