# 🖨️ Ejemplo 1: Sistema de Dispositivos y Periféricos de Oficina

Este ejemplo ilustra de forma clara y didáctica cómo el **Principio de Segregación de Interfaces (ISP)** resuelve el problema de las interfaces monolíticas ("Fat Interfaces") en el contexto de hardware y periféricos de oficina.

---

## ❌ 1. El Problema: Violación del ISP (`violacion/`)

### Escenario:
Se define una interfaz general llamada `DispositivoMultifuncion` con todas las operaciones que cualquier periférico avanzado podría hacer:
- `imprimir(String documento)`
- `escanear(String documento)`
- `enviarFax(String documento, String numeroDestino)`

### El Conflicto:
- La clase `ImpresoraLaserAvanzada` puede realizar las tres operaciones sin problema.
- Sin embargo, la empresa adquiere una `ImpresoraEconomica` (un modelo básico que solo imprime en tinta o láser).
- **Problema:** En Java, al implementar `DispositivoMultifuncion`, la `ImpresoraEconomica` **está forzada por el compilador a implementar `escanear()` y `enviarFax()`**, a pesar de que físicamente no cuenta con escáner ni módem de fax.
- **Consecuencia (Code Smell):** Para que compile, el desarrollador se ve obligado a:
  ```java
  @Override
  public void escanear(String documento) {
      throw new UnsupportedOperationException("Error: Esta impresora no soporta escaneo.");
  }
  ```
- **Riesgo:** Si un cliente invoca el método esperando polimorfismo, el programa colapsa en tiempo de ejecución con una excepción no controlada.

---

## ✅ 2. La Solución: Aplicando ISP (`solucion/`)

### Estrategia:
Segregamos la gran interfaz en contratos pequeños, específicos y de responsabilidad única:
1. `Imprimible`: contrato exclusivo para imprimir.
2. `Escaneable`: contrato exclusivo para escanear.
3. `EnviableFax`: contrato exclusivo para transmisión vía fax.

### Resultado:
- `ImpresoraEconomica` implementa únicamente `Imprimible`.
- `ImpresoraLaserAvanzada` implementa `Imprimible, Escaneable, EnviableFax`.
- Si en el futuro incorporamos un `EscanerFotografico`, simplemente implementará `Escaneable` sin arrastrar métodos de impresión o fax.

---

## 🚀 ¿Cómo compilar y ejecutar?

Desde la raíz del repositorio:
```bash
# Compilar todo el ejemplo 1:
javac -d bin src/com/uniajc/isp/ejemplo1_dispositivos/violacion/*.java src/com/uniajc/isp/ejemplo1_dispositivos/solucion/*.java

# Ejecutar la demostración de la violación (muestra la excepción forzada):
java -cp bin com.uniajc.isp.ejemplo1_dispositivos.violacion.MainViolacion

# Ejecutar la solución limpia con ISP:
java -cp bin com.uniajc.isp.ejemplo1_dispositivos.solucion.MainSolucion
```
