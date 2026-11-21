package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * Dispositivo básico de bajo costo. FÍSICAMENTE SOLO IMPRIME.
 * 
 * ALERTA: Debido a la violación del ISP, el compilador obliga a esta clase
 * a implementar métodos que no puede cumplir, forzando el lanzamiento
 * de UnsupportedOperationException o dejar métodos vacíos.
 */
public class ImpresoraEconomica implements DispositivoMultifuncion {
    private String modelo;

    public ImpresoraEconomica(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("[" + modelo + "] Imprimiendo documento en blanco y negro: " + documento);
    }

    @Override
    public void escanear(String documento) {
        // VIOLACIÓN CLARA DE ISP: Este método no debería existir aquí.
        throw new UnsupportedOperationException("ERROR DE DISEÑO: La " + modelo + " no cuenta con hardware de escáner.");
    }

    @Override
    public void enviarFax(String documento, String numeroDestino) {
        // VIOLACIÓN CLARA DE ISP: Este método no debería existir aquí.
        throw new UnsupportedOperationException("ERROR DE DISEÑO: La " + modelo + " no cuenta con módem de fax.");
    }
}
