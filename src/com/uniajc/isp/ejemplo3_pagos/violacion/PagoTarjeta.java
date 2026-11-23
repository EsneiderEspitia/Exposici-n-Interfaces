package com.uniajc.isp.ejemplo3_pagos.violacion;

public class PagoTarjeta implements PasarelaPago {
    public void pagar(double monto) { System.out.println("[Tarjeta] Cobro de $" + monto + " realizado."); }
    public void reembolsar(double monto) { System.out.println("[Tarjeta] Reembolso de $" + monto + " realizado."); }
    public void guardarTarjeta(String numero) { System.out.println("[Tarjeta] Tarjeta guardada para futuras compras."); }

    @Override
    public void generarCodigoDePago(double monto) {
        // Una tarjeta no genera codigos de pago: metodo vacio solo para compilar
    }
}
