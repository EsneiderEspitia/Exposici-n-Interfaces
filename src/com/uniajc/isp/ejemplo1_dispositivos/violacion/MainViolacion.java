package com.uniajc.isp.ejemplo1_dispositivos.violacion;

/**
 * Demostración de las consecuencias de violar el Principio de Segregación de Interfaces.
 */
public class MainViolacion {
    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("  DEMOSTRACIÓN: VIOLACIÓN DEL ISP (Ejemplo Dispositivos)");
        System.out.println("============================================================\n");

        DispositivoMultifuncion multifuncional = new ImpresoraLaserAvanzada("HP LaserJet Pro MFP");
        DispositivoMultifuncion economica = new ImpresoraEconomica("Epson EcoTank Básica");

        // 1. Uso con la impresora avanzada (todo funciona porque tiene el hardware)
        System.out.println("--- 1. Probando impresora avanzada ---");
        multifuncional.imprimir("Informe_Financiero.pdf");
        multifuncional.escanear("Cedula_Ciudadania.jpg");
        multifuncional.enviarFax("Contrato_Firmado.pdf", "+57 300 1234567");

        // 2. Uso con la impresora básica
        System.out.println("\n--- 2. Probando impresora económica básica ---");
        economica.imprimir("Recibo_Matricula.pdf");

        // Intentar escanear en la impresora básica genera un error en tiempo de ejecución
        System.out.println("\nIntentando llamar a escanear() en ImpresoraEconomica...");
        try {
            economica.escanear("Foto_Estudiante.png");
        } catch (UnsupportedOperationException e) {
            System.err.println("❌ EXCEPCIÓN CAPTURADA: " + e.getMessage());
            System.err.println("-> Causa: El cliente dependió de una interfaz gorda con métodos no soportados por la clase.");
        }
    }
}
