package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * Dispositivo de gama alta que efectivamente puede realizar todas las tareas.
 * Para esta clase la interfaz parece adecuada, pero fue pensada solo para ella.
 */
public class ImpresoraLaserAvanzada implements DispositivoMultifuncion {
    private String modelo;

    public ImpresoraLaserAvanzada(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void imprimir(String documento) {
        System.out.println("[" + modelo + "] Imprimiendo en alta definición: " + documento);
    }

    @Override
    public void escanear(String documento) {
        System.out.println("[" + modelo + "] Escaneando documento y guardando en PDF: " + documento);
    }

    @Override
    public void enviarFax(String documento, String numeroDestino) {
        System.out.println("[" + modelo + "] Enviando fax de '" + documento + "' al número: " + numeroDestino);
    }
}
