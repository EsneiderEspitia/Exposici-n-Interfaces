# 🤖 Ejemplo 2: Sistema de Gestión de Trabajadores y Automatización

Este segundo ejemplo demuestra la aplicación del **Principio de Segregación de Interfaces (ISP)** en el modelado de recursos y roles laborales dentro de una empresa tecnológica o planta industrial moderna.

---

## ❌ 1. El Problema: Violación del ISP (`violacion/`)

### Escenario:
Diseñamos un sistema de personal y creamos una interfaz general llamada `Trabajador`:
- `trabajar()`
- `almorzar()`
- `tomarDescanso()`
- `cobrarSalario(double monto)`

### El Conflicto:
- La empresa contrata desarrolladores humanos (`DesarrolladorHumano`) que cumplen todas las funciones biológicas y administrativas.
- Luego, la empresa adquiere un robot o bot autónomo (`RobotAsistente`) para automatizar tareas repetitivas de software.
- **Problema:** En Java, al implementar `Trabajador`, el robot **es obligado por el contrato a almorzar, tomar pausas activas y cobrar salario**.
- **Consecuencia (Code Smell):** Métodos con excepciones o vacíos:
  ```java
  @Override
  public void almorzar() {
      throw new UnsupportedOperationException("Un robot no tiene necesidades biológicas de alimentación.");
  }
  ```
- Si el módulo de cafetería o bienestar recorre una lista de `Trabajador` para enviar a todos a almorzar, el sistema colapsa al intentar procesar al robot.

---

## ✅ 2. La Solución: Aplicando ISP (`solucion/`)

### Estrategia:
Separamos las responsabilidades en interfaces pequeñas basadas en capacidades reales:
1. `Trabajable`: capacidad de ejecutar tareas laborales.
2. `Alimentable`: necesidad de consumir alimentos.
3. `Descansable`: requerimiento de pausas laborales y descansos.
4. `Remunerable`: derecho a recibir salario o compensación monetaria.
5. `Recargable`: capacidad técnica de reabastecimiento eléctrico.

### Resultado:
- `ProgramadorHumano`: implementa `Trabajable, Alimentable, Descansable, Remunerable`.
- `RobotAutomata`: implementa únicamente `Trabajable, Recargable`.
- **Ventajas:**
  - El gestor de proyectos solo interactúa con `Trabajable`.
  - El servicio de restaurante/cafetería solo interactúa con `Alimentable`.
  - La nómina solo interactúa con `Remunerable`.
  - El área de soporte técnico de hardware interactúa con `Recargable`.

---

## 🚀 ¿Cómo compilar y ejecutar?

Desde la raíz del repositorio:
```bash
# Compilar todo el ejemplo 2:
javac -d bin src/com/uniajc/isp/ejemplo2_trabajadores/violacion/*.java src/com/uniajc/isp/ejemplo2_trabajadores/solucion/*.java

# Demostración del error por violación de ISP:
java -cp bin com.uniajc.isp.ejemplo2_trabajadores.violacion.MainViolacion

# Demostración de la solución desacoplada con ISP:
java -cp bin com.uniajc.isp.ejemplo2_trabajadores.solucion.MainSolucion
```
