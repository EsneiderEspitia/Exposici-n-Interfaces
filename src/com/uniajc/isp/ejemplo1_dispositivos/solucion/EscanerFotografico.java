package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Nuevo periférico que solo sabe escanear.
 * Gracias al ISP, solo implementa Escaneable sin verse forzado a implementar
 * impresión o fax.
 */
public class EscanerFotografico implements Escaneable {
    private String modelo;

    public EscanerFotografico(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void escanear(String documento) {
        System.out.println("[" + modelo + "] Escaneando fotografía profesional: " + documento);
    }
}
