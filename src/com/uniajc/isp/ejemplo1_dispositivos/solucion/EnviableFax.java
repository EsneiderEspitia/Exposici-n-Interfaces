package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Interfaz de Rol específica para la capacidad de envío de faxes.
 */
public interface EnviableFax {
    void enviarFax(String doc, String num);
}
