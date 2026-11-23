package com.uniajc.isp.ejemplo3_pagos.solucion;

public class PagoEfecty implements Pagable, GeneradorCodigoPago {
    public void pagar(double monto) { System.out.println("[Efecty] Pago de $" + monto + " recibido en ventanilla."); }
    public void generarCodigoDePago(double monto) { System.out.println("[Efecty] Codigo de pago generado: EF-" + (int) monto); }
}
