package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * INTERFAZ GORDA (Fat Interface)
 * Viola el Principio de Segregación de Interfaces (ISP).
 * Obliga a los clientes a depender de métodos que no utilizan ni necesitan.
 */
public interface DispositivoMultifuncion {
    void imprimir(String doc);
    void escanear(String doc);
    void enviarFax(String doc, String num);
}
