package com.uniajc.isp.ejemplo3_pagos.violacion;

public class MainViolacion {
    public static void main(String[] args) {
        PasarelaPago tarjeta = new PagoTarjeta();
        PasarelaPago efecty = new PagoEfecty();

        tarjeta.pagar(50000);
        efecty.pagar(50000);

        System.out.println("--- La tienda devuelve la plata al cliente que pago por Efecty ---");
        efecty.reembolsar(50000);
        System.out.println("La tienda registra: 'Reembolso exitoso'");
        System.out.println("PROBLEMA: el metodo estaba vacio, NO se devolvio nada y NO hubo ningun error.");
        System.out.println("El cliente nunca recibe su plata y nadie se entera (falla silenciosa).");
    }
}
