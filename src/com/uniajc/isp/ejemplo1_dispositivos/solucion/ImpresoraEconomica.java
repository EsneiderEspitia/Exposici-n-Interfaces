package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Ahora la impresora básica solo implementa Imprimible.
 * Ya no tiene métodos innecesarios ni excepciones artificiales.
 */
public class ImpresoraEconomica implements Imprimible {
    private String modelo;

    public ImpresoraEconomica(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("[" + modelo + "] Imprimiendo documento limpiamente: " + documento);
    }
}
