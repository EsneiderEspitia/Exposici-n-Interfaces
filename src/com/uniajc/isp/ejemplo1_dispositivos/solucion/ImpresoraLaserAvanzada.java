package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Impresora multifuncional avanzada: compone múltiples interfaces según sus capacidades reales.
 */
public class ImpresoraLaserAvanzada implements Imprimible, Escaneable, EnviableFax {

    @Override
    public void imprimir(String doc) {
        System.out.println("[ImpresoraLaserAvanzada] Imprimiendo láser alta velocidad: " + doc);
    }

    @Override
    public void escanear(String doc) {
        System.out.println("[ImpresoraLaserAvanzada] Escaneando a doble cara: " + doc);
    }

    @Override
    public void enviarFax(String doc, String num) {
        System.out.println("[ImpresoraLaserAvanzada] Enviando fax a " + num + " con doc: " + doc);
    }
}
