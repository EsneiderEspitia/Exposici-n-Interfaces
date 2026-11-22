package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * Clase que se ve forzada a implementar métodos que físicamente no soporta,
 * teniendo que arrojar excepciones en tiempo de ejecución.
 */
public class ImpresoraEconomica implements DispositivoMultifuncion {

    @Override
    public void imprimir(String doc) {
        System.out.println("[ImpresoraEconomica] Imprimiendo documento: " + doc);
    }

    @Override
    public void escanear(String doc) {
        // VIOLACIÓN ISP: Método no soportado obligado por la interfaz gorda
        throw new UnsupportedOperationException("No soportado: La Impresora Económica no tiene escáner.");
    }

    @Override
    public void enviarFax(String doc, String num) {
        // VIOLACIÓN ISP: Método no soportado obligado por la interfaz gorda
        throw new UnsupportedOperationException("No soportado: La Impresora Económica no cuenta con módem de fax.");
    }
}
