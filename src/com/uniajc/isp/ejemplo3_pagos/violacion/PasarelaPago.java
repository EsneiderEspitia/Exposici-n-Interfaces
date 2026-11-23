package com.uniajc.isp.ejemplo3_pagos.violacion;

/** VIOLACION: interfaz gorda. Obliga a todo medio de pago a hacer todo. */
public interface PasarelaPago {
    void pagar(double monto);
    void reembolsar(double monto);
    void guardarTarjeta(String numero);
    void generarCodigoDePago(double monto);
}
