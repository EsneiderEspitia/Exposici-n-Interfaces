package com.uniajc.isp.ejemplo2_trabajadores.solucion;

import java.util.List;

/**
 * Desacoplamiento Empresarial:
 * La Estación de Carga solo interactúa con dispositivos 'Recargable'.
 */
public class EstacionDeCarga {

    public static void conectarPuntosDeCarga(List<Recargable> dispositivos) {
        System.out.println(">>> [Estación de Carga Eléctrica] Iniciando ciclo de recarga:");
        for (Recargable r : dispositivos) {
            r.recargarBateria();
        }
    }
}
