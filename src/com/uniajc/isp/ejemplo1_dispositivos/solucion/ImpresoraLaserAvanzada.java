package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * La impresora avanzada implementa múltiples interfaces específicas (Composición).
 * Satisface los tres contratos porque verdaderamente posee las 3 capacidades.
 */
public class ImpresoraLaserAvanzada implements Imprimible, Escaneable, EnviableFax {
    private String modelo;

    public ImpresoraLaserAvanzada(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("[" + modelo + "] Imprimiendo documento con alta velocidad: " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("[" + modelo + "] Escaneando en resolución óptica de 1200 DPI: " + documento);
    }

    @Override
    public void enviarFax(String documento, String numeroDestino) {
        System.out.println("[" + modelo + "] Transmitiendo fax a " + numeroDestino + " del archivo: " + documento);
    }
}
