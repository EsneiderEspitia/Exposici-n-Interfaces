# 🏛️ Exposición: Principio de Segregación de Interfaces (ISP) - SOLID

**Institución Universitaria Antonio José Camacho (UNIAJC)**  
**Facultad de Ingenierías — Ingeniería de Sistemas**  
**Asignatura:** Programación II  
**Integrantes:**
- Carlos Esneider Espitia (Responsable de rama `Espitia`)
- Angel Cuenú
- Kevin García

---

## 🎯 Objetivo del Proyecto
Presentar de forma teórica y práctica el **Principio de Segregación de Interfaces (Interface Segregation Principle - ISP)**, correspondiente a la letra **"I"** de los principios de diseño de software **SOLID**.

> *"Los clientes no deberían estar obligados a depender de interfaces que no utilizan."*  
> — Robert C. Martin ("Uncle Bob")

---

## 📑 Contenido del Repositorio

1. **[PRESENTACION_ISP.md](./PRESENTACION_ISP.md)**:
   - Diapositivas completas organizadas con introducción, justificación, síntomas de violación ("code smells"), diagramas en Mermaid, checklist de diseño y notas del orador listas para la exposición.
2. **Ejemplos Prácticos en Java (Código Fuente)**:
   - **[Ejemplo 1: Dispositivos de Oficina](./src/com/uniajc/isp/ejemplo1_dispositivos/README.md)**:
     - Caso clásico de hardware: Impresoras básicas vs multifuncionales vs escáneres.
     - Comparativa directa entre `violacion/` (Fat Interface y excepciones en tiempo de ejecución) y `solucion/` (Interfaces de rol `Imprimible`, `Escaneable`, `EnviableFax`).
   - **[Ejemplo 2: Gestión de Trabajadores y Automatización](./src/com/uniajc/isp/ejemplo2_trabajadores/README.md)**:
     - Modelado empresarial: Desarrolladores humanos vs robots autómatas.
     - Comparativa entre `violacion/` (obligar a un robot a almorzar y cobrar salario) y `solucion/` (contratos segregados: `Trabajable`, `Alimentable`, `Descansable`, `Remunerable`, `Recargable`).

---

## 🛠️ Estructura del Código

```text
Exposici-n-Interfaces/
├── README.md
├── PRESENTACION_ISP.md
├── src/
│   └── com/
│       └── uniajc/
│           └── isp/
│               ├── ejemplo1_dispositivos/
│               │   ├── README.md
│               │   ├── violacion/
│               │   │   ├── DispositivoMultifuncion.java
│               │   │   ├── ImpresoraLaserAvanzada.java
│               │   │   ├── ImpresoraEconomica.java
│               │   │   └── MainViolacion.java
│               │   └── solucion/
│               │       ├── Imprimible.java
│               │       ├── Escaneable.java
│               │       ├── EnviableFax.java
│               │       ├── ImpresoraEconomica.java
│               │       ├── ImpresoraLaserAvanzada.java
│               │       ├── EscanerFotografico.java
│               │       └── MainSolucion.java
│               │
│               └── ejemplo2_trabajadores/
│                   ├── README.md
│                   ├── violacion/
│                   │   ├── Trabajador.java
│                   │   ├── DesarrolladorHumano.java
│                   │   ├── RobotAsistente.java
│                   │   └── MainViolacion.java
│                   └── solucion/
│                       ├── Trabajable.java
│                       ├── Alimentable.java
│                       ├── Descansable.java
│                       ├── Remunerable.java
│                       ├── Recargable.java
│                       ├── ProgramadorHumano.java
│                       ├── RobotAutomata.java
│                       └── MainSolucion.java
```

---

## ⚡ Compilación y Ejecución

Desde la raíz de la carpeta del proyecto (`Exposici-n-Interfaces`):

### 1. Compilar todo el proyecto:
```bash
javac -d bin src/com/uniajc/isp/ejemplo1_dispositivos/*/*.java src/com/uniajc/isp/ejemplo2_trabajadores/*/*.java
```

### 2. Ejecutar Ejemplo 1 (Dispositivos):
```bash
# Ver el error por violación del ISP:
java -cp bin com.uniajc.isp.ejemplo1_dispositivos.violacion.MainViolacion

# Ver la solución limpia aplicando ISP:
java -cp bin com.uniajc.isp.ejemplo1_dispositivos.solucion.MainSolucion
```

### 3. Ejecutar Ejemplo 2 (Trabajadores):
```bash
# Ver el error por violación del ISP:
java -cp bin com.uniajc.isp.ejemplo2_trabajadores.violacion.MainViolacion

# Ver la solución limpia aplicando ISP:
java -cp bin com.uniajc.isp.ejemplo2_trabajadores.solucion.MainSolucion
```
