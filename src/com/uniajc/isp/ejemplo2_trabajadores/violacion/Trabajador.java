package com.uniajc.isp.ejemplo2_trabajadores.violacion;

/**
 * INTERFAZ GORDA (Fat Interface)
 * Agrupa comportamientos laborales, biológicos y financieros en un solo contrato.
 * Viola gravemente ISP al forzar a actores no humanos a implementar métodos absurdos.
 */
public interface Trabajador {
    void trabajar();
    void almorzar();
    void tomarDescanso();
    void cobrarSalario(double monto);
}
