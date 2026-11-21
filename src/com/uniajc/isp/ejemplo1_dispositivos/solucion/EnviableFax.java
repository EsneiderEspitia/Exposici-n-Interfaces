package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * ISP: Interfaz segregada con la única responsabilidad de transmitir por fax.
 */
public interface EnviableFax {
    void enviarFax(String documento, String numeroDestino);
}
