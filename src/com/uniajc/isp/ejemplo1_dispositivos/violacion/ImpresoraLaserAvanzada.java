package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * Dispositivo de gama alta que sí cuenta con todas las funciones de la interfaz gorda.
 */
public class ImpresoraLaserAvanzada implements DispositivoMultifuncion {

    @Override
    public void imprimir(String doc) {
        System.out.println("[ImpresoraLaserAvanzada] Imprimiendo en alta resolución: " + doc);
    }

    @Override
    public void escanear(String doc) {
        System.out.println("[ImpresoraLaserAvanzada] Escaneando a 1200 DPI: " + doc);
    }

    @Override
    public void enviarFax(String doc, String num) {
        System.out.println("[ImpresoraLaserAvanzada] Enviando fax al número " + num + " con documento: " + doc);
    }
}
