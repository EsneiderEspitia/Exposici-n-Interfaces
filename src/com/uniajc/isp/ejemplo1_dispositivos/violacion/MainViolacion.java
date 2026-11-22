package com.uniajc.isp.ejemplo1_dispositivos.violacion;

public class MainViolacion {

    public static void ejecutarRutinaOficina(DispositivoMultifuncion dispositivo) {
        System.out.println("--- Iniciando rutina de oficina ---");
        dispositivo.imprimir("Informe_Financiero.pdf");

        // Intentar escanear: si el dispositivo no soporta la función, fallará estrepitosamente
        System.out.println("Intentando escanear...");
        dispositivo.escanear("Contrato_Firmado.pdf");

        // Intentar enviar fax
        System.out.println("Intentando enviar fax...");
        dispositivo.enviarFax("Factura.pdf", "+57 300 1234567");
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println(" DEMOSTRACIÓN VIOLACIÓN ISP: DISPOSITIVOS OFICINA");
        System.out.println("=================================================");

        DispositivoMultifuncion laser = new ImpresoraLaserAvanzada();
        System.out.println("\n1. Probando Dispositivo Completo (ImpresoraLaserAvanzada):");
        ejecutarRutinaOficina(laser);

        DispositivoMultifuncion economica = new ImpresoraEconomica();
        System.out.println("\n2. Probando Dispositivo Básico (ImpresoraEconomica):");
        try {
            ejecutarRutinaOficina(economica);
        } catch (UnsupportedOperationException e) {
            System.err.println("\n[ERROR EN RUNTIME - VIOLACIÓN ISP]");
            System.err.println("Causa: " + e.getMessage());
            System.err.println("Explicación: El cliente dependía de un contrato gordo e invocó un método que la clase fingía tener.");
        }
    }
}
