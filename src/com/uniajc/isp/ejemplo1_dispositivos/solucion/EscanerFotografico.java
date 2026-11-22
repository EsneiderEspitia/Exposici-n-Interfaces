package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Escáner fotográfico: dispositivo especializado que solo digitaliza.
 * Implementa únicamente la interfaz Escaneable.
 */
public class EscanerFotografico implements Escaneable {

    @Override
    public void escanear(String doc) {
        System.out.println("[EscanerFotografico] Digitalizando diapositiva/foto en formato RAW: " + doc);
    }
}
