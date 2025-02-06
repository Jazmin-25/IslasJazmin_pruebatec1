
package com.softek.islasariadna_pruebatec1.inferfaz;

import com.softek.islasariadna_pruebatec1.logica.Empleado;
import java.util.List;
import java.util.Scanner;


public class InterfazUsuario {//sera la ventana del fronted cuando el usuario ingrese
    private static final Scanner teclado = new Scanner(System.in);

    public static int mostrarMenu() {
        int opcion = 0;
        boolean opcionValida = false;
        //imprimir el menu de opciones de forma atractiva
        while (!opcionValida) {
            System.out.println("\n");
            System.out.println("+--------------------------------------------------------------------------------------+");
            System.out.println("  ▒█▀▀█ ▀█▀ ▒█▀▀▀ ▒█▄░▒█ ▒█░░▒█ ▒█▀▀▀ ▒█▄░▒█ ▀█▀ ▒█▀▀▄ ▒█▀▀▀█ ");
            System.out.println("  ▒█▀▀▄ ▒█░ ▒█▀▀▀ ▒█▒█▒█ ░▒█▒█░ ▒█▀▀▀ ▒█▒█▒█ ▒█░ ▒█░▒█ ▒█░░▒█ ");
            System.out.println("  ▒█▄▄█ ▄█▄ ▒█▄▄▄ ▒█░░▀█ ░░▀▄▀░ ▒█▄▄▄ ▒█░░▀█ ▄█▄ ▒█▄▄▀ ▒█▄▄▄█ ");
            System.out.println("   ");
            System.out.println("                           ░█▀▀█     　 ▒█░░░ ░█▀▀█                             ");
            System.out.println("                           ▒█▄▄█     　 ▒█░░░ ▒█▄▄█                             ");
            System.out.println("                           ▒█░▒█ 　     ▒█▄▄█ ▒█░▒█                             ");
            System.out.println("  ");
            System.out.println("  ░█▀▀█ ░█▀▀▀ ░█▀▀▀█ ▀▀█▀▀ ▀█▀ ░█▀▀▀█ ░█▄─░█ 　 ░█▀▀▄ ░█▀▀▀      ");
            System.out.println("  ░█─▄▄ ░█▀▀▀ ─▀▀▀▄▄ ─░█── ░█─ ░█──░█ ░█░█░█ 　 ░█─░█ ░█▀▀▀ 　         ");
            System.out.println("  ░█▄▄█ ░█▄▄▄ ░█▄▄▄█ ─░█── ▄█▄ ░█▄▄▄█ ░█──▀█ 　 ░█▄▄▀ ░█▄▄▄         ");
            System.out.println("  ");
            System.out.println("  ░█▀▀▀ ░█▀▄▀█ ░█▀▀█ ░█─── ░█▀▀▀ ─█▀▀█ ░█▀▀▄ ░█▀▀▀█ ░█▀▀▀█        ");
            System.out.println("  ░█▀▀▀ ░█░█░█ ░█▄▄█ ░█─── ░█▀▀▀ ░█▄▄█ ░█─░█ ░█──░█ ─▀▀▀▄▄          ");
            System.out.println("  ░█▄▄▄ ░█──░█ ░█─── ░█▄▄█ ░█▄▄▄ ░█─░█ ░█▄▄▀ ░█▄▄▄█ ░█▄▄▄█         ");
            System.out.println("+--------------------------------------------------------------------------------------+");
            System.out.println("| 1. Alta Empleado                           |");
            System.out.println("| 2. Consultar Todos los Empleados           |");
            System.out.println("| 3. Consultar Empleado por Cargo            |");
            System.out.println("| 4. Modificar Empleado por ID               |");
            System.out.println("| 5. Baja Empleado por ID                    |");
            System.out.println("| 6. Salir                                   |");
            System.out.println("+---------------------------------------------+");
            System.out.print("Selecciona una opción: ");

            String entrada = teclado.nextLine();

            if (entrada.isEmpty()) {
                mostrarOpcionVacia();
            } else {
                try {
                    opcion = Integer.parseInt(entrada);
                    if (opcion >= 1 && opcion <= 6) {
                        opcionValida = true;
                    } else {
                        mostrarOpcionInvalida();
                    }
                } catch (NumberFormatException e) {
                    mostrarOpcionInvalida();
                }
            }
        }

        return opcion;
    }

    public static void mostrarEmpleados(List<Empleado> empleados) {
        if (empleados.isEmpty()) {
            System.out.println("\nNo hay empleados registrados en el sistema.");
        } else {
            System.out.println("\nLista de empleados:");
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
    
    public static void mostrarDespedida() {
        System.out.println("\nAgradecemos su tiempo en la utilización del sistema de gestión de empleados. ¡Hasta pronto!");
    }

    public static void mostrarOpcionInvalida() {
        System.out.println("\nLa opción seleccionada no es válida. Por favor, elija una opción disponible en el menú.");
    }

    public static void mostrarOpcionVacia() {
        System.out.println("\nLa entrada no puede estar vacía. Por favor, ingrese un valor válido.");
    }
}
