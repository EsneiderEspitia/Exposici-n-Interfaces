# Ejemplo 3: Sistema de pagos (Tarjeta, Nequi, Efecty)

Ubicacion: `src/com/uniajc/isp/ejemplo3_pagos/`

## Problema (carpeta `violacion`)
La interfaz gorda `PasarelaPago` obliga a todos los medios de pago a tener `pagar`, `reembolsar`,
`guardarTarjeta` y `generarCodigoDePago`.
- `PagoTarjeta` no genera codigos de pago -> **metodo vacio**.
- `PagoEfecty` no reembolsa ni guarda tarjetas -> **metodos vacios**.

Aqui no hay excepcion: el programa NO falla. La tienda llama `reembolsar()` sobre Efecty, el metodo
no hace nada y el sistema cree que devolvio la plata. Es una **falla silenciosa** (code smell:
metodos vacios / dummy methods), mas peligrosa que una excepcion porque nadie la nota.

## Solucion (carpeta `solucion`)
Interfaces de rol: `Pagable`, `Reembolsable`, `TarjetaGuardable`, `GeneradorCodigoPago`.
- `PagoTarjeta` -> Pagable, Reembolsable, TarjetaGuardable
- `PagoNequi` -> Pagable, Reembolsable
- `PagoEfecty` -> Pagable, GeneradorCodigoPago

El modulo de devoluciones pide `Reembolsable`: Efecty ni siquiera se puede pasar (error de compilacion).

## Ejecutar
```
javac -d out $(find src -name "*.java")
java -cp out com.uniajc.isp.ejemplo3_pagos.violacion.MainViolacion
java -cp out com.uniajc.isp.ejemplo3_pagos.solucion.MainSolucion
```
