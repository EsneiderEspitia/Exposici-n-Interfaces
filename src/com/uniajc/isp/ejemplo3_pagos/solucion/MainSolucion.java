package com.uniajc.isp.ejemplo3_pagos.solucion;

import java.util.List;

public class MainSolucion {
    public static void main(String[] args) {
        // El checkout solo necesita saber COBRAR: pide Pagable
        List<Pagable> checkout = List.of(new PagoTarjeta(), new PagoNequi(), new PagoEfecty());
        for (Pagable p : checkout) p.pagar(50000);

        // El modulo de devoluciones solo acepta medios que SI reembolsan
        List<Reembolsable> devoluciones = List.of(new PagoTarjeta(), new PagoNequi());
        for (Reembolsable r : devoluciones) r.reembolsar(50000);

        // Efecty solo genera codigo, lo pide quien lo necesita
        GeneradorCodigoPago efecty = new PagoEfecty();
        efecty.generarCodigoDePago(50000);

        // Descomentar la siguiente linea NO compila: Efecty no es Reembolsable.
        // devoluciones = List.of(new PagoEfecty());
        System.out.println("Cada medio de pago hace solo lo que realmente sabe hacer.");
    }
}
