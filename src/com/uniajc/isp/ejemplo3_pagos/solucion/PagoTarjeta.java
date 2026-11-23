package com.uniajc.isp.ejemplo3_pagos.solucion;

public class PagoTarjeta implements Pagable, Reembolsable, TarjetaGuardable {
    public void pagar(double monto) { System.out.println("[Tarjeta] Cobro de $" + monto + " realizado."); }
    public void reembolsar(double monto) { System.out.println("[Tarjeta] Reembolso de $" + monto + " realizado."); }
    public void guardarTarjeta(String numero) { System.out.println("[Tarjeta] Tarjeta guardada para futuras compras."); }
}
