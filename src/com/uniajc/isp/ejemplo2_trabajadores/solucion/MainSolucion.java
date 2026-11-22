package com.uniajc.isp.ejemplo2_trabajadores.solucion;

import java.util.Arrays;
import java.util.List;

public class MainSolucion {

    public static void main(String[] args) {
        System.out.println("===============================================================");
        System.out.println(" DEMOSTRACIÓN SOLUCIÓN ISP: TRABAJADORES Y ROBOTS AUTÓNOMOS");
        System.out.println("===============================================================");

        ProgramadorHumano carlos = new ProgramadorHumano("Carlos");
        ProgramadorHumano kevin = new ProgramadorHumano("Kevin");
        RobotAutomata robotX = new RobotAutomata("CyberBot-900");

        // 1. Desacoplamiento: El Gestor de Tareas solo pide Trabajable
        System.out.println("\n[1. GESTOR DE TAREAS - Requiere solo Trabajable]");
        List<Trabajable> trabajadores = Arrays.asList(carlos, kevin, robotX);
        GestorDeTareas.asignarJornada(trabajadores);

        // 2. Cafetería: Solo pide Alimentable
        System.out.println("\n[2. CAFETERÍA CORPORATIVA - Requiere solo Alimentable]");
        List<Alimentable> comensales = Arrays.asList(carlos, kevin);
        // Cafeteria.servirAlmuerzos(Arrays.asList(robotX)); // ¡ERROR DE COMPILACIÓN! Seguro por tipo
        Cafeteria.servirAlmuerzos(comensales);

        // 3. Sistema de Nómina: Solo pide Remunerable
        System.out.println("\n[3. SISTEMA DE NÓMINA - Requiere solo Remunerable]");
        List<Remunerable> empleadosNomina = Arrays.asList(carlos, kevin);
        SistemaNomina.dispersarPagos(empleadosNomina, 3500.0);

        // 4. Estación de Carga: Solo pide Recargable
        System.out.println("\n[4. ESTACIÓN DE CARGA - Requiere solo Recargable]");
        List<Recargable> unidadesRecargables = Arrays.asList(robotX);
        EstacionDeCarga.conectarPuntosDeCarga(unidadesRecargables);

        System.out.println("\n===============================================================");
        System.out.println(" RESULTADO: Cada subsistema interactúa de forma totalmente");
        System.out.println(" segura, desacoplada y fuertemente tipada en Java.");
        System.out.println("===============================================================");
    }
}
