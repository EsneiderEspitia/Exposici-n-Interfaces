package com.uniajc.isp.ejemplo1_dispositivos.solucion;

/**
 * Demostración de la solución limpia aplicando el Principio de Segregación de Interfaces.
 * Los clientes dependen únicamente de la abstracción que necesitan consumir.
 */
public class MainSolucion {

    // Cliente que solo necesita imprimir: acepta cualquier cosa que sea Imprimible
    public static void procesarImpresion(Imprimible dispositivo, String archivo) {
        dispositivo.imprimir(archivo);
    }

    // Cliente que solo necesita escanear: acepta cualquier cosa que sea Escaneable
    public static void procesarDigitalizacion(Escaneable dispositivo, String archivo) {
        dispositivo.escanear(archivo);
    }

    public static void main(String[] args) {
        System.out.println("============================================================");
        System.out.println("   DEMOSTRACIÓN: SOLUCIÓN CON ISP (Ejemplo Dispositivos)");
        System.out.println("============================================================\n");

        ImpresoraEconomica impresoraBasica = new ImpresoraEconomica("Epson L3210 Básica");
        ImpresoraLaserAvanzada mfpAvanzada = new ImpresoraLaserAvanzada("Canon imageRUNNER ADVANCE");
        EscanerFotografico escanerCanon = new EscanerFotografico("Epson Perfection V600");

        System.out.println("--- 1. Tareas de Impresión (Dependencia sobre Imprimible) ---");
        procesarImpresion(impresoraBasica, "Tesis_Grado_UNIAJC.pdf");
        procesarImpresion(mfpAvanzada, "Planos_Arquitectonicos.dwg");

        System.out.println("\n--- 2. Tareas de Escaneo (Dependencia sobre Escaneable) ---");
        procesarDigitalizacion(mfpAvanzada, "Contrato_Laboral.pdf");
        procesarDigitalizacion(escanerCanon, "Foto_Antigua_Familiar.tiff");

        System.out.println("\n--- 3. Tareas de Fax (Dependencia sobre EnviableFax) ---");
        mfpAvanzada.enviarFax("Documento_Confidencial.pdf", "+57 2 6652000");

        System.out.println("\n✅ ÉXITO: Ninguna clase contiene métodos vacíos ni excepciones forzadas.");
        System.out.println("Cada cliente interactúa únicamente con el contrato que le interesa.");
    }
}
