package com.uniajc.isp.ejemplo3_pagos.violacion;

public class PagoEfecty implements PasarelaPago {
    public void pagar(double monto) { System.out.println("[Efecty] Pago de $" + monto + " recibido en ventanilla."); }
    public void generarCodigoDePago(double monto) { System.out.println("[Efecty] Codigo de pago generado: EF-" + (int) monto); }

    @Override
    public void reembolsar(double monto) {
        // Efecty no hace reembolsos automaticos: metodo vacio
    }

    @Override
    public void guardarTarjeta(String numero) {
        // Efecty no maneja tarjetas: metodo vacio
    }
}
