package com.uniajc.isp.ejemplo2_trabajadores.solucion;

import java.util.List;

/**
 * Desacoplamiento Empresarial:
 * El Sistema de Nómina solo pide entidades 'Remunerable'.
 */
public class SistemaNomina {

    public static void dispersarPagos(List<Remunerable> beneficiarios, double montoBase) {
        System.out.println(">>> [Sistema de Nómina] Dispersando pagos quincenales:");
        for (Remunerable r : beneficiarios) {
            r.cobrarSalario(montoBase);
        }
    }
}
