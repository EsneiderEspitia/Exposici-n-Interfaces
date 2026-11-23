package com.uniajc.isp.ejemplo3_pagos.solucion;

public class PagoNequi implements Pagable, Reembolsable {
    public void pagar(double monto) { System.out.println("[Nequi] Pago de $" + monto + " aprobado."); }
    public void reembolsar(double monto) { System.out.println("[Nequi] Reembolso de $" + monto + " enviado al celular."); }
}
