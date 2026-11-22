package com.uniajc.isp.ejemplo1_dispositivos.solucion;

public class MainSolucion {

    // Beneficio Polimórfico: Solo pide Imprimible; no le importa si sabe escanear o enviar fax
    public static void solicitarImpresion(Imprimible equipo, String documento) {
        System.out.println("-> Enviando trabajo a cola de impresión...");
        equipo.imprimir(documento);
    }

    // Solo pide Escaneable
    public static void digitalizarDocumento(Escaneable equipo, String documento) {
        System.out.println("-> Solicitando escaneo digital...");
        equipo.escanear(documento);
    }

    // Solo pide EnviableFax
    public static void transmitirPorFax(EnviableFax equipo, String documento, String numero) {
        System.out.println("-> Iniciando transmisión telefónica de fax...");
        equipo.enviarFax(documento, numero);
    }

    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println(" DEMOSTRACIÓN SOLUCIÓN CON ISP: DISPOSITIVOS");
        System.out.println("==================================================");

        ImpresoraEconomica impresoraEco = new ImpresoraEconomica();
        ImpresoraLaserAvanzada laserAvanzada = new ImpresoraLaserAvanzada();
        EscanerFotografico escanerFoto = new EscanerFotografico();

        System.out.println("\n1. Demostración de Impresión (Polimorfismo con Imprimible):");
        solicitarImpresion(impresoraEco, "Boleta_Venta_001.pdf");
        solicitarImpresion(laserAvanzada, "Memoria_Anual_2026.pdf");

        System.out.println("\n2. Demostración de Escaneo (Polimorfismo con Escaneable):");
        digitalizarDocumento(laserAvanzada, "Cédula_Cliente.pdf");
        digitalizarDocumento(escanerFoto, "Fotografia_Historica_1950.tiff");

        System.out.println("\n3. Demostración de Fax (Polimorfismo con EnviableFax):");
        transmitirPorFax(laserAvanzada, "Acuerdo_Comercial.pdf", "+1 800 555 0199");

        System.out.println("\n[ROBUSTEZ Y SEGURIDAD EN COMPILACIÓN]");
        System.out.println("Si intentáramos compilar: solicitarImpresion(escanerFoto, ...);");
        System.out.println("O: digitalizarDocumento(impresoraEco, ...);");
        System.out.println("El compilador de Java lo rechazaría de inmediato, evitando fallos en tiempo de ejecución.");
    }
}
