package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * VIOLACIÓN DE ISP: Interfaz "Gorda" (Fat Interface).
 * Obliga a cualquier dispositivo a saber imprimir, escanear y enviar fax,
 * sin importar si físicamente cuenta con esas capacidades.
 */
public interface DispositivoMultifuncion {
    void imprimir(String documento);
    void escanear(String documento);
    void enviarFax(String documento, String numeroDestino);
}
