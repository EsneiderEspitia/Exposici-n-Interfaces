package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Impresora económica: solo implementa Imprimible.
 * Cero métodos basura. No finge capacidades inexistentes.
 */
public class ImpresoraEconomica implements Imprimible {

    @Override
    public void imprimir(String doc) {
        System.out.println("[ImpresoraEconomica] Imprimiendo documento limpiamente: " + doc);
    }
}
